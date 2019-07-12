package pe.edu.sistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.sistemas.service.DocenteService;

@RequestMapping("/docente")
@Controller
public class ListarDocente {
	
	@Autowired
	private DocenteService docenteService;
	
	@GetMapping("/listar")
	public String Listar(Model model) {
		model.addAttribute("titulo", "Docentes");
		model.addAttribute("docentes", docenteService.listarDocente());
		return "listar";
	}
	
}
