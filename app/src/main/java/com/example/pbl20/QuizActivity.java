package com.example.pbl20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

    private TextView tvProgressText, tvScoreCounter, tvChapter, tvQuestionText;
    private ImageView ivQuestionImage;
    private TextView tvOptionTrue, tvOptionFalse;
    private TextView tvLabelTrue, tvLabelFalse;
    private LinearLayout layoutOptionTrue, layoutOptionFalse;
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
        tvProgressText = findViewById(R.id.tvProgressText);
        tvScoreCounter = findViewById(R.id.tvScoreCounter);
        progressBar = findViewById(R.id.progressBar);

        tvChapter = findViewById(R.id.tvChapter);
        tvQuestionText = findViewById(R.id.tvQuestionText);
        ivQuestionImage = findViewById(R.id.ivQuestionImage);

        layoutOptionTrue = findViewById(R.id.layoutOptionTrue);
        layoutOptionFalse = findViewById(R.id.layoutOptionFalse);

        tvOptionTrue = findViewById(R.id.tvOptionTrue);
        tvOptionFalse = findViewById(R.id.tvOptionFalse);

        tvLabelTrue = findViewById(R.id.tvLabelTrue);
        tvLabelFalse = findViewById(R.id.tvLabelFalse);

        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
    }

    private void setupWindowInsets() {
        View headerLayout = findViewById(R.id.headerLayout);
        View bottomNavLayout = findViewById(R.id.bottomNavLayout);
        View quizMainLayout = findViewById(R.id.quizMainLayout);

        ViewCompat.setOnApplyWindowInsetsListener(quizMainLayout, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
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
                    systemBars.bottom + 12
            );
            return insets;
        });
    }

    private void loadQuestions() {
        questionList = QuestionRepository.getQuestions();
        progressBar.setMax(questionList.size());
    }

    private void setupListeners() {
        btnExit.setOnClickListener(v -> showExitConfirmationDialog());

        layoutOptionTrue.setOnClickListener(v -> selectOption(Question.ANSWER_TRUE));
        layoutOptionFalse.setOnClickListener(v -> selectOption(Question.ANSWER_FALSE));

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

        if (currentQ.hasImage()) {
            ivQuestionImage.setImageResource(currentQ.getImageResId());
            ivQuestionImage.setVisibility(View.VISIBLE);
        } else {
            ivQuestionImage.setImageDrawable(null);
            ivQuestionImage.setVisibility(View.GONE);
        }

        String[] options = currentQ.getOptions();
        tvOptionTrue.setText(options[Question.ANSWER_TRUE]);
        tvOptionFalse.setText(options[Question.ANSWER_FALSE]);
        updateOptionsUI(currentQ.getUserSelectedIndex());

        btnPrev.setVisibility(currentIndex == 0 ? View.INVISIBLE : View.VISIBLE);

        if (currentIndex == questionList.size() - 1) {
            btnNext.setText("Hantar");
        } else {
            btnNext.setText("Seterusnya");
        }

        updateAnsweredCounter();
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
        resetOption(layoutOptionTrue, tvLabelTrue);
        resetOption(layoutOptionFalse, tvLabelFalse);

        if (selectedIndex == Question.ANSWER_TRUE) highlightOption(layoutOptionTrue, tvLabelTrue);
        else if (selectedIndex == Question.ANSWER_FALSE) highlightOption(layoutOptionFalse, tvLabelFalse);
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