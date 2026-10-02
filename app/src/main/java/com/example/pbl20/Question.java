package com.example.pbl20;

import java.io.Serializable;

public class Question implements Serializable {

    // True/false answer options, shown in this order on screen
    public static final String[] OPTIONS = {"Betul", "Salah"};
    public static final int ANSWER_TRUE = 0;
    public static final int ANSWER_FALSE = 1;

    private final int id;
    private final String chapter;
    private final String questionText;
    private final int correctAnswerIndex;
    private final String explanation;
    private final int imageResId; // 0 when the question has no diagram
    private int userSelectedIndex = -1;

    public Question(int id, String chapter, String questionText, boolean answerIsTrue, String explanation) {
        this(id, chapter, questionText, answerIsTrue, explanation, 0);
    }

    public Question(int id, String chapter, String questionText, boolean answerIsTrue, String explanation, int imageResId) {
        this.id = id;
        this.chapter = chapter;
        this.questionText = questionText;
        this.correctAnswerIndex = answerIsTrue ? ANSWER_TRUE : ANSWER_FALSE;
        this.explanation = explanation;
        this.imageResId = imageResId;
    }

    public int getId() {
        return id;
    }

    public String getChapter() {
        return chapter;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return OPTIONS;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getImageResId() {
        return imageResId;
    }

    public boolean hasImage() {
        return imageResId != 0;
    }

    public int getUserSelectedIndex() {
        return userSelectedIndex;
    }

    public void setUserSelectedIndex(int userSelectedIndex) {
        this.userSelectedIndex = userSelectedIndex;
    }

    public boolean isAnswered() {
        return userSelectedIndex != -1;
    }

    public boolean isCorrect() {
        return userSelectedIndex == correctAnswerIndex;
    }
}
