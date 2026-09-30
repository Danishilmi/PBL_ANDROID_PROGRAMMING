package com.example.pbl20;

import java.io.Serializable;

public class Question implements Serializable {
    private final int id;
    private final String chapter;
    private final String questionText;
    private final String[] options;
    private final int correctAnswerIndex;
    private final String explanation;
    private int userSelectedIndex = -1;

    public Question(int id, String chapter, String questionText, String[] options, int correctAnswerIndex, String explanation) {
        this.id = id;
        this.chapter = chapter;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.explanation = explanation;
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
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getUserSelectedIndex() {
        return userSelectedIndex;
    }

    public void setUserSelectedIndex(int userSelectedIndex) {
        this.userSelectedIndex = userSelectedIndex;
    }

    public boolean isCorrect() {
        return userSelectedIndex == correctAnswerIndex;
    }
}