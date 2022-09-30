
package com.co.POJO;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="categorias")

public class CatEliminadas implements Serializable{
    
    private static  final long  SerialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nombre;
    private Integer activo;
}
