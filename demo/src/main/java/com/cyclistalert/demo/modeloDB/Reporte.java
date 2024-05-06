package com.cyclistalert.demo.modeloDB;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    String ubicacion;
    String descripcion;
    List <String> imagenes = new ArrayList<>();

    @ManyToOne
    Usuario usuario;
}
