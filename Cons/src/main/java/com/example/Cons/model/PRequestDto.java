package com.example.Cons.model;

import lombok.Data;

@Data
public class PRequestDto {

    private String preferenceID;
    private String preferenceIDType;
    private Preference preference;

}
