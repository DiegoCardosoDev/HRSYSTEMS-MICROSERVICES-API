package br.com.diego.userapi.exeptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StandError {

    private LocalDateTime timeStamp;
    private String error;
    private  Integer status;
    private String path;
}

