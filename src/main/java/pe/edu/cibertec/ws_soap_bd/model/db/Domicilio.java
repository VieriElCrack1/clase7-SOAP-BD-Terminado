package pe.edu.cibertec.ws_soap_bd.model.db;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddomicilio;
    private String descdomicilio;
    private int nrodomicilio;
    private String refdomicilio;
}
