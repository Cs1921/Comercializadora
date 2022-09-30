
package com.co.POJO;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="roles")
public class Roles implements Serializable {
    
    private static  final long  SerialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nombre;   
    private Integer activo;
    
}
