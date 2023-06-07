package com.example.Cons.model;

import com.example.Cons.converter.PreferenceConverter;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Preference")
@Data
public class PRequestDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String preferenceID;
    private String preferenceIDType;
    @Convert(converter = PreferenceConverter.class)
    @Column(columnDefinition = "TEXT")
    private Preference preference;
}
