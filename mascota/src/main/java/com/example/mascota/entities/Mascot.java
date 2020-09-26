package com.example.mascota.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mascota")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Mascot implements Serializable {



    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dueño")
    private String dueño;
    @Column(name = "raza")
    private String raza;
    @Column(name = "genero")
    private String genero;
    @Column(name = "estado")
    private String estado;
}
