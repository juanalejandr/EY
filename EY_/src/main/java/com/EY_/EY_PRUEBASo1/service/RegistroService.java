package com.EY_.EY_PRUEBASo1.service;


import com.EY_.EY_PRUEBASo1.dto.RegistroDto;
import com.EY_.EY_PRUEBASo1.dto.RegistroDtoResp;
import org.hibernate.service.spi.ServiceException;

public interface RegistroService {
    public RegistroDtoResp crearRegistro(RegistroDto registroDto) throws ServiceException;
}
