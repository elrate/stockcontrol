package com.iesb.project.stockcontrol.stockcontrol.exception;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class StandardError implements Serializable{
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
