package com.cadify.cadifyWAS.exception;

import lombok.Getter;

import java.time.Instant;

@Getter
public class CustomLogicException extends RuntimeException {

    private final ExceptionCode exceptionCode;
    private final Instant occurredAt;

    public CustomLogicException(ExceptionCode exceptionCode){
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
        this.occurredAt = Instant.now();
    }
}
