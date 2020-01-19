package com.example.techmantra;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Response {
    private String message;
    LocalDate createdDate;

    public Response(String message, LocalDate datetime){
        this.message = message;
        this.createdDate = datetime;
    }

}
