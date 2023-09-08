package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include

private String cedula;
private String nombre;
private String email;

    @ElementCollection
    private List<String> telefono;


}
