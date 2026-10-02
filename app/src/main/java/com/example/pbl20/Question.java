package com.example.pbl20;

import java.io.Serializable;
import java.util.Locale;

public class Question implements Serializable {

    public enum Type { OBJECTIVE, SUBJECTIVE }

    private final int id;
    private final Type type;
    private final String chapter;
    private final String questionText;
    private final String explanation;

    // Objective (multiple choice) fields
    private final String[] options;
    private final int correctAnswerIndex;
    private int userSelectedIndex = -1;

    // Subjective (written answer) fields
    private final String modelAnswer;
    private final String[] acceptedKeywords;
    private String userAnswerText = "";

    // Objective question
    public Question(int id, String chapter, String questionText, String[] options, int correctAnswerIndex, String explanation) {
        this.id = id;
        this.type = Type.OBJECTIVE;
        this.chapter = chapter;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.explanation = explanation;
        this.modelAnswer = null;
        this.acceptedKeywords = new String[0];
    }

    // Subjective question: the answer is correct if it contains any of the accepted keywords
    public Question(int id, String chapter, String questionText, String modelAnswer, String[] acceptedKeywords, String explanation) {
        this.id = id;
        this.type = Type.SUBJECTIVE;
        this.chapter = chapter;
        this.questionText = questionText;
        this.options = new String[0];
        this.correctAnswerIndex = -1;
        this.explanation = explanation;
        this.modelAnswer = modelAnswer;
        this.acceptedKeywords = acceptedKeywords;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public boolean isSubjective() {
        return type == Type.SUBJECTIVE;
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

    public String getModelAnswer() {
        return modelAnswer;
    }

    public String getUserAnswerText() {
        return userAnswerText;
    }

    public void setUserAnswerText(String userAnswerText) {
        this.userAnswerText = userAnswerText == null ? "" : userAnswerText;
    }

    public boolean isAnswered() {
        if (isSubjective()) {
            return !userAnswerText.trim().isEmpty();
        }
        return userSelectedIndex != -1;
    }

    public boolean isCorrect() {
        if (isSubjective()) {
            String answer = normalize(userAnswerText);
            if (answer.isEmpty()) return false;
            for (String keyword : acceptedKeywords) {
                if (answer.contains(normalize(keyword))) return true;
            }
            return false;
        }
        return userSelectedIndex == correctAnswerIndex;
    }

    private static String normalize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9 ]", " ")
                .replaceAll("\\s+", " ")
                .trim();
    }
}
