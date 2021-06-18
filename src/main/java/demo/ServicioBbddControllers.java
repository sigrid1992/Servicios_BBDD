package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioBbddControllers {

	@GetMapping
 public String saludos(@RequestParam(required = false, defaultValue =
"") int id) {
 return "".equals(id) ? "Estamos utilizando el servicio" : "Alumno " + id;
 }
	 

}
