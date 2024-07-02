package com.sismed.sismed.repository;

import com.sismed.sismed.model.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese, Long> {
    List<Anamnese> findAllByMedico_Id (Long MedicoId);
    List<Anamnese> findAllByPaciente_Id (Long pacienteId);
}
