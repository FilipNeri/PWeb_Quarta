package br.unisul.pweb.quarta.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.pweb.quarta.domain.Categorias;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categorias> listar(){
		List<Categorias> lista = new ArrayList<Categorias>();
		lista.add(new Categorias(1, "Informática"));
		lista.add(new Categorias(2, "Camping"));
		lista.add(new Categorias(3, "Automobilística"));
		lista.add(new Categorias(4, "Lazer"));
		return lista;
	}

}

