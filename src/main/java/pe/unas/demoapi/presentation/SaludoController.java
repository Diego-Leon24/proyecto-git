package pe.unas.demoapi.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.unas.demoapi.application.SaludoService;

@RestController
public class SaludoController {
    
    private final SaludoService service = new SaludoService();

    @GetMapping("/saludo")
    public String saludo() {
        return service.obtenerSaludo();
    }
}