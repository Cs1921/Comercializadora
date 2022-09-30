
package com.co.POJO;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="unidades")
public class Unidades implements Serializable{
    
    private static  final long  SerialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nombre;
    private String prefijo;    
    private Integer activo;
    
}
