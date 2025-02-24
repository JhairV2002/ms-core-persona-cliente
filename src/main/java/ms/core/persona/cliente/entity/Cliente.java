package ms.core.persona.cliente.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import ms.core.persona.cliente.classes.Persona;

@Data
@Entity
@NoArgsConstructor
public class Cliente extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    private String contrasenia;
    private boolean estado;
}
