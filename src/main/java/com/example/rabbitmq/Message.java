package com.example.rabbitmq;

import java.io.Serializable;

public class Message implements Serializable {
    private String name;
    private String description;

    public Message() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
