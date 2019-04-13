package com.home.task.model;

import javax.persistence.*;

@Entity
@Table(name = "greetings")
public class Greetings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_msg")
    private String oneMessage;
    @Column(name = "second_msg")
    private String twoMessage;

    public Greetings(String oneMessage, String twoMessage) {
        this.oneMessage = oneMessage;
        this.twoMessage = twoMessage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Greetings() {}

    public String getOneMessage() {
        return oneMessage;
    }

    public void setOneMessage(String oneMessage) {
        this.oneMessage = oneMessage;
    }

    public String getTwoMessage() {
        return twoMessage;
    }

    public void setTwoMessage(String twoMessage) {
        this.twoMessage = twoMessage;
    }
}
