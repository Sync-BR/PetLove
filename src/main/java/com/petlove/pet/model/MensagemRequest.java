package com.petlove.pet.model;

public class MensagemRequest {
    private String email;
    private String title;
    private String text;

    public MensagemRequest(String email, String title, String message) {
        this.email = email;
        this.title = title;
        this.text = message;
    }

    @Override
    public String toString() {
        return "MensagemRequest{" +
                "email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String message) {
        this.text = message;
    }
}
