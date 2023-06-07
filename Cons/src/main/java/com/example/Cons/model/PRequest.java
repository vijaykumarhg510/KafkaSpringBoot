package com.example.Cons.model;

import lombok.Data;

@Data
public class PRequest {

    private String preferenceID;
    private String preferenceIDType;
    private Preference preference;

}
