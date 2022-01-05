package com.ibm.academia.apirest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibm.academia.apirest.mapper.PaisMapper;
import com.ibm.academia.apirest.models.dto.PaisDTO;
import com.ibm.academia.apirest.models.entities.Pais;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/pais")
@Api(value = "Métodos relacionados con paises", tags = "Acciones sobre paises")
public class PaisController {

	private final Logger log = LoggerFactory.getLogger(PaisController.class);
	
	@ApiOperation(value = "Busca el pais por ip")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Ejecutado exitosamente")
	})
	@GetMapping("/buscar")
	public ResponseEntity<?> buscarPaisPorIp(@RequestParam String ip)
	{
		RestTemplate plantilla = new RestTemplate();
		String url= "https://api.ip2country.info/ip?"+ip;
		Pais pais = plantilla.getForObject(url,Pais.class);
		
		//PaisMapper paisDto= new mapPais(pais);	
		
		return new ResponseEntity<Pais>(pais, HttpStatus.OK);
	}
}
