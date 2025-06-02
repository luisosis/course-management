package com.tuempresa.gestioncursos.infrastructure.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private String userId;
    private String id;
    private String title;
    private String body;
}
