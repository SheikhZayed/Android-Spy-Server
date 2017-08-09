package io.github.ashif.androidspyserver.controller;

import io.github.ashif.androidspyserver.data.model.Greeting;
import io.github.ashif.androidspyserver.data.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author Ashif Ismail
 * github.com/SheikhZayed
 **/

@Controller
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting sendResponse(Message incomingMessage) {
        logger.debug(incomingMessage.getMessage());
        return new Greeting("Hello " + incomingMessage.getMessage());
    }
}
