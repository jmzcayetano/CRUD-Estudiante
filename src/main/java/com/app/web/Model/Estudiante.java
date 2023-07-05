package com.app.web.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estudiantes")
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Estudiante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;

    @Column(name = "email",nullable = false,length = 50,unique = true)
    private String email;
}
