package com.projeto.placas.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.placas.models.Placa;
import com.projeto.placas.models.Placas;

@Service
public class PlacaService {
	
	@Autowired
	private Placas placas;
	
	public Placa obterPlacaAleatoria() {
		
		int totalDePlacas = placas.findAll().size();
		
		int idAleatorio = new Random().nextInt(totalDePlacas + 1);
		
		if (idAleatorio == 0)
			idAleatorio++;
		
		return placas.findOne(idAleatorio);
	}
}