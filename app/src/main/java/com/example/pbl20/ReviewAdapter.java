package com.example.pbl20;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private final Context context;
    private final List<Question> questionList;

    public ReviewAdapter(Context context, List<Question> questionList) {
        this.context = context;
        this.questionList = questionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_review_question, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Question q = questionList.get(position);
        holder.tvNumber.setText("Soalan " + (position + 1) + (q.isSubjective() ? " · Subjektif" : " · Objektif"));
        holder.tvQuestion.setText(q.getQuestionText());

        boolean isCorrect = q.isCorrect();
        if (isCorrect) {
            holder.tvStatusBadge.setText("BETUL");
            holder.tvStatusBadge.setTextColor(Color.parseColor("#16A34A")); // Green
            holder.tvStatusBadge.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_chip));
        } else {
            holder.tvStatusBadge.setText("SALAH");
            holder.tvStatusBadge.setTextColor(Color.parseColor("#DC2626")); // Red
            holder.tvStatusBadge.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_chip));
        }

        if (q.isSubjective()) {
            String userText = q.getUserAnswerText().trim();
            if (userText.isEmpty()) {
                holder.tvUserAnswer.setText("Jawapan anda: (Tiada Jawapan)");
            } else {
                holder.tvUserAnswer.setText("Jawapan anda: " + userText);
            }
            holder.tvUserAnswer.setTextColor(isCorrect ? Color.parseColor("#16A34A") : Color.parseColor("#DC2626"));
            holder.tvCorrectAnswer.setText("Skema jawapan: " + q.getModelAnswer());
            holder.tvExplanation.setText(q.getExplanation());
            return;
        }

        String[] options = q.getOptions();
        char[] optionLetters = {'A', 'B', 'C', 'D'};

        int userSel = q.getUserSelectedIndex();
        if (userSel >= 0 && userSel < options.length) {
            holder.tvUserAnswer.setText("Jawapan anda: " + optionLetters[userSel] + ". " + options[userSel]);
            holder.tvUserAnswer.setTextColor(isCorrect ? Color.parseColor("#16A34A") : Color.parseColor("#DC2626"));
        } else {
            holder.tvUserAnswer.setText("Jawapan anda: (Tiada Jawapan)");
            holder.tvUserAnswer.setTextColor(Color.parseColor("#DC2626"));
        }

        int correctIdx = q.getCorrectAnswerIndex();
        holder.tvCorrectAnswer.setText("Jawapan betul: " + optionLetters[correctIdx] + ". " + options[correctIdx]);
        holder.tvExplanation.setText(q.getExplanation());
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNumber, tvStatusBadge, tvQuestion, tvUserAnswer, tvCorrectAnswer, tvExplanation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.tvReviewNumber);
            tvStatusBadge = itemView.findViewById(R.id.tvStatusBadge);
            tvQuestion = itemView.findViewById(R.id.tvReviewQuestion);
            tvUserAnswer = itemView.findViewById(R.id.tvUserAnswer);
            tvCorrectAnswer = itemView.findViewById(R.id.tvCorrectAnswer);
            tvExplanation = itemView.findViewById(R.id.tvReviewExplanation);
        }
    }
}