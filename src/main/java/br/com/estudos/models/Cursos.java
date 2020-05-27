package br.com.estudos.models;

import io.swagger.annotations.ApiModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@ApiModel
@Entity
public class Cursos implements Serializable {

    @Id
    private Long idCurso;
}
