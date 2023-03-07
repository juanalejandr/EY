package com.EY_.EY_PRUEBASo1.service;


import com.EY_.EY_PRUEBASo1.Repository.RegistroRepository;
import com.EY_.EY_PRUEBASo1.dto.PhoneDto;
import com.EY_.EY_PRUEBASo1.dto.RegistroDto;
import com.EY_.EY_PRUEBASo1.dto.RegistroDtoResp;
import com.EY_.EY_PRUEBASo1.entity.Phone;
import com.EY_.EY_PRUEBASo1.entity.Registro;
import com.EY_.EY_PRUEBASo1.jwt.JwtUtil;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.Instant;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Service

public class RegistroServiceImpl implements RegistroService{

    private String mensaje=null;
    @Autowired
    private RegistroRepository registroRepository;
    @Autowired
    private JwtUtil jwt;


    @Override
    public RegistroDtoResp crearRegistro(RegistroDto registroDto) throws ServiceException {
        final Logger LOG = Logger.getLogger("paquete.NombreClase");
        //LOG.info(registroDto.toString());
        try {
            Registro registro=mapearEntidad(registroDto);
            //LOG.info(registro.getToken());
            registro.setToken(jwt.generateToken(registro.getEmail(),registro.getName()));

            registroRepository.save(registro);

            return mapearDtoResp(registro);
        }catch (Exception e){
            throw new ServiceException("mensaje error");
        }
    }
    private ArrayList<Phone> mapearPhone (RegistroDto registroDto){
        ArrayList<PhoneDto> dtos= registroDto.getPhones();
        ArrayList<Phone> phones= new ArrayList<Phone>();
        for (PhoneDto dto : dtos) {
            Phone phone = new Phone();
            phone.setNumber(dto.getNumber());
            phone.setCityCode(dto.getCityCode());
            phone.setContryCode(dto.getCountryCode());
            phones.add(phone);
        }
        return phones;
    }

    private Registro mapearEntidad(RegistroDto registroDto){
        Registro registro=new Registro();
        registro.setId(UUID.randomUUID());
        registro.setName(registroDto.getName());
        registro.setEmail(registroDto.getEmail());
        registro.setPassword(registroDto.getPassword());
        registro.setDate(Instant.now());
        registro.setPhones(mapearPhone(registroDto));
        return registro;
    }
    private RegistroDtoResp mapearDtoResp(Registro registro){
        RegistroDtoResp registroDtoResp = new RegistroDtoResp();
        registroDtoResp.setId(registro.getId());
        registroDtoResp.setCreated(registro.getDate());
        registroDtoResp.setModified(registro.getDate());
        registroDtoResp.setLast_login(registro.getDate());
        registroDtoResp.setToken(registro.getToken());
        return registroDtoResp;
    }

}
