package com.projeto.placas.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public Map<String,String> teste() {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("sigla", "R01");
		map.put("titulo", "vire à esquerda");
		map.put("descricao", "Você deve virar à esquerda");
		map.put("imagem", "https://clubedetran.com.br/imagens/placas/S-1.png");
		
		return map;
	}
}
