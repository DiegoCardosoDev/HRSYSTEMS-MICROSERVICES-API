package br.com.diego.userapi.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExeptionHandler {

    @ExceptionHandler(ObjectNotFoundxExeption.class)
    public ResponseEntity<StandError> objectNotFound(ObjectNotFoundxExeption exeption, HttpServletRequest request){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandError(LocalDateTime.now(),
                        exeption.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        request.getRequestURI())
        );

    }
}

