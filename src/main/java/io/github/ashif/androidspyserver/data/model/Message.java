package io.github.ashif.androidspyserver.data.model;

import lombok.Data;

/**
 * @author Ashif Ismail
 * github.com/SheikhZayed
 **/

public @Data
class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }
}
