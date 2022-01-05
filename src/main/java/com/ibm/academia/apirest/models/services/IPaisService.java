package com.ibm.academia.apirest.models.services;

import com.ibm.academia.apirest.models.entities.Pais;

public interface IPaisService {
	
	public Pais buscarPaisPorIp(String ip); 
}
