package com.biat.spring5recipeapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 // if we delete a Note /recipe will  remain in  database
    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
