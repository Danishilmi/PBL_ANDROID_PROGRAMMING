package com.example.pbl20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        View headerLayout = findViewById(R.id.headerLayout);
        View mainView = findViewById(R.id.main);

        ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            headerLayout.setPadding(
                    headerLayout.getPaddingLeft(),
                    systemBars.top + 20,
                    headerLayout.getPaddingRight(),
                    headerLayout.getPaddingBottom()
            );
            v.setPadding(0, 0, 0, systemBars.bottom);
            return insets;
        });

        Button btnStartSet1 = findViewById(R.id.btnStartSet1);
        Button btnStartSet2 = findViewById(R.id.btnStartSet2);

        btnStartSet1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            intent.putExtra(QuizActivity.EXTRA_SET_ID, 1);
            startActivity(intent);
        });

        btnStartSet2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            intent.putExtra(QuizActivity.EXTRA_SET_ID, 2);
            startActivity(intent);
        });
    }
}