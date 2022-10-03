package com.example.perfil;

public class messageList {

    private String name,mobile, LastMessage;

    private int unssenMessages;

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLastMessage() {
        return LastMessage;
    }

    public int getUnssenMessages() {
        return unssenMessages;
    }

    public messageList(String name, String mobile, String lastMessage, int unssenMessages) {
        this.name = name;
        this.mobile = mobile;
        LastMessage = lastMessage;
        this.unssenMessages = unssenMessages;



    }
}
