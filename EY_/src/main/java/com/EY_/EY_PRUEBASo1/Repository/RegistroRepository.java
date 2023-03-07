package com.EY_.EY_PRUEBASo1.Repository;

import com.EY_.EY_PRUEBASo1.entity.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RegistroRepository extends JpaRepository <Registro, UUID> {
}
