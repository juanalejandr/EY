package com.EY_.EY_PRUEBASo1.service;

import com.EY_.EY_PRUEBASo1.Repository.RegistroRepository;
import com.EY_.EY_PRUEBASo1.dto.PhoneDto;
import com.EY_.EY_PRUEBASo1.dto.RegistroDto;
import com.EY_.EY_PRUEBASo1.dto.RegistroDtoResp;
import com.EY_.EY_PRUEBASo1.entity.Registro;
import com.EY_.EY_PRUEBASo1.jwt.JwtUtil;
import org.aspectj.lang.annotation.Before;
import org.hibernate.service.spi.ServiceException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


/*class RegistroServiceImplTest {

    @Autowired
    Registro registro;
    private RegistroServiceImpl registroService;

    @Mock
    private RegistroRepository registroRepository;

    @Mock
    private JwtUtil jwtUtil;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        registroService = new RegistroServiceImpl(registroRepository, jwtUtil);
    }

    @Test
    public void crearRegistro_shouldReturnRegistroDtoResp() {
        // Given
        RegistroDto registroDto = new RegistroDto();
        registroDto.setName("John");
        registroDto.setEmail("john.doe@example.com");
        registroDto.setPassword("password");
        PhoneDto phoneDto = new PhoneDto();
        phoneDto.setNumber(1234567890);
        phoneDto.setCityCode(1);
        phoneDto.setCountryCode(58);
        registroDto.setPhones((ArrayList<PhoneDto>) Arrays.asList(phoneDto));

        Registro registroMock = new Registro();
        registroMock.setId(UUID.randomUUID());
        registroMock.setName(registroDto.getName());
        registroMock.setEmail(registroDto.getEmail());
        registroMock.setPassword(registroDto.getPassword());
        registroMock.setDate(Instant.now());
        

        when(jwtUtil.generateToken(any(), any())).thenReturn("token");
        when(registroRepository.save(any(Registro.class))).thenReturn(registroMock);

        // When
        RegistroDtoResp registroDtoResp = registroService.crearRegistro(registroDto);

        // Then
        assertNotNull(registroDtoResp.getId());
        assertNotNull(registroDtoResp.getToken());
        assertEquals(registroDto.getName(), registro.getName());
        assertEquals(registroDto.getEmail(), registro.getEmail());
        assertEquals(registroDto.getPassword(), registro.getPassword());
        assertEquals(registroDto.getPhones().size(), registro.getPhones().size());
        assertEquals(registroMock.getToken(), registroDtoResp.getToken());
    }
}
*/
