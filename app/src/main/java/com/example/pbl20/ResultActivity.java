package com.example.pbl20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        setupWindowInsets();

        TextView tvPercentage = findViewById(R.id.tvPercentage);
        TextView tvScoreSummary = findViewById(R.id.tvScoreSummary);
        TextView tvFeedback = findViewById(R.id.tvFeedback);
        RecyclerView rvReview = findViewById(R.id.rvReview);
        Button btnHome = findViewById(R.id.btnHome);

        rvReview.setLayoutManager(new LinearLayoutManager(this));

        List<Question> questionList;
        @SuppressWarnings("unchecked")
        ArrayList<Question> list = (ArrayList<Question>) getIntent().getSerializableExtra("QUESTIONS_LIST", ArrayList.class);
        questionList = list != null ? list : new ArrayList<>();

        int correctCount = 0;
        int total = questionList.size();

        for (Question q : questionList) {
            if (q.isCorrect()) {
                correctCount++;
            }
        }

        int percentage = total > 0 ? (int) Math.round(((double) correctCount / total) * 100) : 0;

        tvPercentage.setText(String.format(Locale.getDefault(), "%d%%", percentage));
        tvScoreSummary.setText(String.format(Locale.getDefault(), "Anda menjawab %d daripada %d soalan dengan betul.", correctCount, total));

        if (percentage >= 80) {
            tvFeedback.setText("🏆 Cemerlang! Syabas!");
        } else if (percentage >= 50) {
            tvFeedback.setText("👍 Bagus! Teruskan Usaha!");
        } else {
            tvFeedback.setText("💪 Jangan Putus Asa, Cuba Lagi!");
        }

        ReviewAdapter adapter = new ReviewAdapter(this, questionList);
        rvReview.setAdapter(adapter);

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }

    private void setupWindowInsets() {
        View headerLayout = findViewById(R.id.headerLayout);
        View bottomNavLayout = findViewById(R.id.bottomNavLayout);
        View resultMainLayout = findViewById(R.id.resultMainLayout);

        ViewCompat.setOnApplyWindowInsetsListener(resultMainLayout, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            headerLayout.setPadding(
                    headerLayout.getPaddingLeft(),
                    systemBars.top + 28,
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
}