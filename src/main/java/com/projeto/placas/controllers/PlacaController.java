package com.projeto.placas.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.projeto.placas.models.Placa;
import com.projeto.placas.services.PlacaService;

@Controller
@RequestMapping("/placa")
public class PlacaController {
	
	@Autowired
	private PlacaService placaService;
	
	@RequestMapping
	@ResponseBody
	public Map<String,String> getPlaca() {
		
		Placa placa = placaService.obterPlacaAleatoria();
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", placa.getId().toString());
		map.put("sigla", placa.getSigla());
		map.put("titulo", placa.getTitulo());
		map.put("descricao", placa.getDescricao());
		map.put("imagem", placa.getImagem());
		
		return map;
	}
}
