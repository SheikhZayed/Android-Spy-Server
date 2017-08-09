package io.github.ashif.androidspyserver.data.model;

import lombok.Data;

/**
 * @author Ashif Ismail
 * github.com/SheikhZayed
 **/

public @Data
class Greeting {
    private String content;

    public Greeting(String content) {
        this.content = content;
    }
}
