package Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cadastro {
	
	@RequestMapping("/cadastro")
	public String form() {
		return "cadastro";
	}

}
