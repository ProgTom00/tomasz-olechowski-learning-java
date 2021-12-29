package com.exceptions.nullpointer;

public class MessageNotSendException extends Exception {
    public MessageNotSendException(final String message) {
        super(message);
    }
}
