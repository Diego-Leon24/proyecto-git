package pe.unas.demoapi;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String inicio() {
        return "RAIZ OK 🚀";
    }

    @GetMapping("/Hola")
    public String Hola() {
        return "Hola 🚀";
    }
    @GetMapping("/Producto")
    public List<String> Producto() {
        return List.of("Teclado", "mouse", "monitor");
    }
}