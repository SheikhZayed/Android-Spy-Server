package io.github.ashif.androidspyserver.controller;

import io.github.ashif.androidspyserver.data.model.Greeting;
import io.github.ashif.androidspyserver.data.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author Ashif Ismail
 * github.com/SheikhZayed
 **/

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting sendResponse(Message incomingMessage) {
        return new Greeting("Hello " + incomingMessage.getMessage());
    }
}
