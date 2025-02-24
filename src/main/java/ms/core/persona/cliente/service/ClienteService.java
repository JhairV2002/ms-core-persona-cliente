package ms.core.persona.cliente.service;

import lombok.AllArgsConstructor;
import ms.core.persona.cliente.entity.Cliente;
import ms.core.persona.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    // Create a new Cliente
    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Get a Cliente by ID
    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    // Get all Clientes
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Update an existing Cliente
    public Cliente updateCliente(Long id, Cliente clienteDetails) {
        return clienteRepository.findById(id).map(cliente -> {
            cliente.setNombre(clienteDetails.getNombre());
            cliente.setGenero(clienteDetails.getGenero());
            cliente.setEdad(clienteDetails.getEdad());
            cliente.setIdentificacion(clienteDetails.getIdentificacion());
            cliente.setDireccion(clienteDetails.getDireccion());
            cliente.setTelefono(clienteDetails.getTelefono());
            cliente.setContrasenia(clienteDetails.getContrasenia());
            cliente.setEstado(clienteDetails.isEstado());
            return clienteRepository.save(cliente);
        }).orElseThrow(() -> new RuntimeException("Cliente not found with id " + id));
    }

    // Delete a Cliente by ID
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }


}
