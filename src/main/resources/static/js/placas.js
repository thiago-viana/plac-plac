
$(function() {
	
	$('#busca-placa').on('click', function(event) {		
		
		event.preventDefault();
		
		var link = $(event.currentTarget);
		var url = link.attr('href');
		
		if (link.text() === "Nova Placa") {
			
			link.text("Resposta");
			
			$('#resposta').hide();
			
			var response = $.ajax({
				cache: false,
				url: url,
				type: 'GET'
			});
			
			response.done(function(placa) {
				
				$('#imagem-placa').attr('src', placa.imagem);
				$('#sigla-placa').text(placa.sigla);
				$('#titulo-placa').text(placa.titulo);
				$('#descricao-placa').text(placa.descricao);
			});
			
		} else if (link.text() === "Resposta") {
							
			$('#resposta').show();
			link.text("Nova Placa");
		}
		
	});
	
});