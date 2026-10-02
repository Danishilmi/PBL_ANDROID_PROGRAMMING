package com.example.pbl20;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvSetTitle, tvProgressText, tvScoreCounter, tvChapter, tvQuestionText;
    private TextView tvOptionA, tvOptionB, tvOptionC, tvOptionD;
    private TextView tvLabelA, tvLabelB, tvLabelC, tvLabelD;
    private LinearLayout layoutOptionA, layoutOptionB, layoutOptionC, layoutOptionD;
    private LinearLayout layoutSubjective;
    private EditText etSubjectiveAnswer;
    private ProgressBar progressBar;
    private Button btnPrev, btnNext;
    private View btnExit;

    private List<Question> questionList;
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);

        initViews();
        setupWindowInsets();
        loadQuestions();
        setupListeners();
        setupOnBackPressed();
        updateQuestionUI();
    }

    private void initViews() {
        btnExit = findViewById(R.id.btnExit);
        tvSetTitle = findViewById(R.id.tvSetTitle);
        tvProgressText = findViewById(R.id.tvProgressText);
        tvScoreCounter = findViewById(R.id.tvScoreCounter);
        progressBar = findViewById(R.id.progressBar);

        tvChapter = findViewById(R.id.tvChapter);
        tvQuestionText = findViewById(R.id.tvQuestionText);

        layoutOptionA = findViewById(R.id.layoutOptionA);
        layoutOptionB = findViewById(R.id.layoutOptionB);
        layoutOptionC = findViewById(R.id.layoutOptionC);
        layoutOptionD = findViewById(R.id.layoutOptionD);

        tvOptionA = findViewById(R.id.tvOptionA);
        tvOptionB = findViewById(R.id.tvOptionB);
        tvOptionC = findViewById(R.id.tvOptionC);
        tvOptionD = findViewById(R.id.tvOptionD);

        tvLabelA = findViewById(R.id.tvLabelA);
        tvLabelB = findViewById(R.id.tvLabelB);
        tvLabelC = findViewById(R.id.tvLabelC);
        tvLabelD = findViewById(R.id.tvLabelD);

        layoutSubjective = findViewById(R.id.layoutSubjective);
        etSubjectiveAnswer = findViewById(R.id.etSubjectiveAnswer);

        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
    }

    private void setupWindowInsets() {
        View headerLayout = findViewById(R.id.headerLayout);
        View bottomNavLayout = findViewById(R.id.bottomNavLayout);
        View quizMainLayout = findViewById(R.id.quizMainLayout);

        ViewCompat.setOnApplyWindowInsetsListener(quizMainLayout, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            Insets ime = insets.getInsets(WindowInsetsCompat.Type.ime());
            headerLayout.setPadding(
                    headerLayout.getPaddingLeft(),
                    systemBars.top + 16,
                    headerLayout.getPaddingRight(),
                    headerLayout.getPaddingBottom()
            );
            bottomNavLayout.setPadding(
                    bottomNavLayout.getPaddingLeft(),
                    bottomNavLayout.getPaddingTop(),
                    bottomNavLayout.getPaddingRight(),
                    Math.max(systemBars.bottom, ime.bottom) + 12
            );
            return insets;
        });
    }

    private void loadQuestions() {
        tvSetTitle.setText("KUIZ SEJARAH — OBJEKTIF & SUBJEKTIF");
        questionList = QuestionRepository.getQuestions();
        progressBar.setMax(questionList.size());
    }

    private void setupListeners() {
        btnExit.setOnClickListener(v -> showExitConfirmationDialog());

        layoutOptionA.setOnClickListener(v -> selectOption(0));
        layoutOptionB.setOnClickListener(v -> selectOption(1));
        layoutOptionC.setOnClickListener(v -> selectOption(2));
        layoutOptionD.setOnClickListener(v -> selectOption(3));

        etSubjectiveAnswer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Question currentQ = questionList.get(currentIndex);
                if (currentQ.isSubjective()) {
                    currentQ.setUserAnswerText(s.toString());
                    updateAnsweredCounter();
                }
            }
        });

        btnPrev.setOnClickListener(v -> {
            if (currentIndex > 0) {
                currentIndex--;
                updateQuestionUI();
            }
        });

        btnNext.setOnClickListener(v -> {
            if (currentIndex < questionList.size() - 1) {
                currentIndex++;
                updateQuestionUI();
            } else {
                showCustomSubmitDialog();
            }
        });
    }

    private void setupOnBackPressed() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                showExitConfirmationDialog();
            }
        });
    }

    private void selectOption(int optionIndex) {
        Question currentQ = questionList.get(currentIndex);
        currentQ.setUserSelectedIndex(optionIndex);
        updateOptionsUI(optionIndex);
        updateAnsweredCounter();
    }

    private void updateQuestionUI() {
        Question currentQ = questionList.get(currentIndex);

        tvProgressText.setText("Soalan " + (currentIndex + 1) + " daripada " + questionList.size());
        progressBar.setProgress(currentIndex + 1);

        tvChapter.setText(currentQ.getChapter());
        tvQuestionText.setText(currentQ.getQuestionText());

        if (currentQ.isSubjective()) {
            setOptionsVisibility(View.GONE);
            layoutSubjective.setVisibility(View.VISIBLE);
            etSubjectiveAnswer.setText(currentQ.getUserAnswerText());
            etSubjectiveAnswer.setSelection(etSubjectiveAnswer.length());
        } else {
            setOptionsVisibility(View.VISIBLE);
            layoutSubjective.setVisibility(View.GONE);
            hideKeyboard();

            String[] options = currentQ.getOptions();
            tvOptionA.setText(options[0]);
            tvOptionB.setText(options[1]);
            tvOptionC.setText(options[2]);
            tvOptionD.setText(options[3]);
            updateOptionsUI(currentQ.getUserSelectedIndex());
        }

        btnPrev.setVisibility(currentIndex == 0 ? View.INVISIBLE : View.VISIBLE);

        if (currentIndex == questionList.size() - 1) {
            btnNext.setText("Hantar");
        } else {
            btnNext.setText("Seterusnya");
        }

        updateAnsweredCounter();
    }

    private void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(etSubjectiveAnswer.getWindowToken(), 0);
        }
        etSubjectiveAnswer.clearFocus();
    }

    private void setOptionsVisibility(int visibility) {
        layoutOptionA.setVisibility(visibility);
        layoutOptionB.setVisibility(visibility);
        layoutOptionC.setVisibility(visibility);
        layoutOptionD.setVisibility(visibility);
    }

    private void updateAnsweredCounter() {
        int answeredCount = 0;
        for (Question q : questionList) {
            if (q.isAnswered()) {
                answeredCount++;
            }
        }
        tvScoreCounter.setText(answeredCount + "/" + questionList.size());
    }

    private void updateOptionsUI(int selectedIndex) {
        resetOption(layoutOptionA, tvLabelA);
        resetOption(layoutOptionB, tvLabelB);
        resetOption(layoutOptionC, tvLabelC);
        resetOption(layoutOptionD, tvLabelD);

        if (selectedIndex == 0) highlightOption(layoutOptionA, tvLabelA);
        else if (selectedIndex == 1) highlightOption(layoutOptionB, tvLabelB);
        else if (selectedIndex == 2) highlightOption(layoutOptionC, tvLabelC);
        else if (selectedIndex == 3) highlightOption(layoutOptionD, tvLabelD);
    }

    private void resetOption(LinearLayout layout, TextView label) {
        layout.setBackground(ContextCompat.getDrawable(this, R.drawable.bg_option_default));
        label.setBackground(ContextCompat.getDrawable(this, R.drawable.bg_chip));
        label.setTextColor(ContextCompat.getColor(this, R.color.navy_header));
    }

    private void highlightOption(LinearLayout layout, TextView label) {
        layout.setBackground(ContextCompat.getDrawable(this, R.drawable.bg_option_selected));
        label.setBackgroundColor(ContextCompat.getColor(this, R.color.navy_header));
        label.setTextColor(ContextCompat.getColor(this, R.color.white));
    }

    private void showCustomSubmitDialog() {
        int answeredCount = 0;
        for (Question q : questionList) {
            if (q.isAnswered()) {
                answeredCount++;
            }
        }
        int unansweredCount = questionList.size() - answeredCount;

        View dialogView = getLayoutInflater().inflate(R.layout.dialog_submit_quiz, null);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(dialogView)
                .create();

        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        TextView tvTitle = dialogView.findViewById(R.id.tvDialogTitle);
        TextView tvMsg = dialogView.findViewById(R.id.tvDialogMessage);
        Button btnCancel = dialogView.findViewById(R.id.btnDialogCancel);
        Button btnConfirm = dialogView.findViewById(R.id.btnDialogConfirm);

        tvTitle.setText("Hantar kuiz?");
        if (unansweredCount > 0) {
            tvMsg.setText("Masih terdapat " + unansweredCount + " soalan yang belum dijawab.\nPastikan semua soalan telah dijawab sebelum menghantar.");
        } else {
            tvMsg.setText("Tahniah! Semua soalan telah dijawab.\nAdakah anda pasti mahu menghantar sekarang?");
        }

        btnCancel.setOnClickListener(v -> dialog.dismiss());
        btnConfirm.setOnClickListener(v -> {
            dialog.dismiss();
            navigateToResult();
        });

        dialog.show();
    }

    private void navigateToResult() {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("QUESTIONS_LIST", (Serializable) new ArrayList<>(questionList));
        startActivity(intent);
        finish();
    }

    private void showExitConfirmationDialog() {
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_submit_quiz, null);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(dialogView)
                .create();

        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        TextView tvTitle = dialogView.findViewById(R.id.tvDialogTitle);
        TextView tvMsg = dialogView.findViewById(R.id.tvDialogMessage);
        Button btnCancel = dialogView.findViewById(R.id.btnDialogCancel);
        Button btnConfirm = dialogView.findViewById(R.id.btnDialogConfirm);

        tvTitle.setText("Keluar kuiz?");
        tvMsg.setText("Kemajuan kuiz anda tidak akan disimpan. Adakah anda pasti mahu keluar?");
        btnCancel.setText("Batal");
        btnConfirm.setText("Keluar");

        btnCancel.setOnClickListener(v -> dialog.dismiss());
        btnConfirm.setOnClickListener(v -> {
            dialog.dismiss();
            finish();
        });

        dialog.show();
    }
}