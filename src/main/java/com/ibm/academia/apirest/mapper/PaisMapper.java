package com.ibm.academia.apirest.mapper;

import com.ibm.academia.apirest.models.dto.PaisDTO;
import com.ibm.academia.apirest.models.entities.Pais;

public class PaisMapper {
	
	public static PaisDTO mapPais(Pais pais)
	{
        PaisDTO paisDTO = new PaisDTO();
        paisDTO.setNombre(pais.getCountryName());
        paisDTO.setCode(pais.getCountryCode());
        paisDTO.setCode3(pais.getCountryCode());
        return paisDTO;
	}
}
