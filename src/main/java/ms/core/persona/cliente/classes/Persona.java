package ms.core.persona.cliente.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private String nombre;
    private String genero;
    private String edad;
    private String identificacion;
    private String direccion;
    private String telefono;
}
