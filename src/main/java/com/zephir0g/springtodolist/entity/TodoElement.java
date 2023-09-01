package com.zephir0g.springtodolist.entity;

import jakarta.persistence.*;

@Entity
public class TodoElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String text;
    private boolean markTaskAsComplete;
    private String addDate;

    public TodoElement(String text, boolean markTaskAsComplete, String addDate) {
        this.text = text;
        this.markTaskAsComplete = markTaskAsComplete;
        this.addDate = addDate;
    }

    public TodoElement(String text, String addDate) {
        this.text = text;
        this.addDate = addDate;
    }

    public TodoElement() {

    }

    public Long getId(){
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean markTaskAsComplete() {
        return markTaskAsComplete;
    }

    public void setMarkTaskAsComplete(boolean markTaskAsComplete) {
        this.markTaskAsComplete = markTaskAsComplete;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }
}
