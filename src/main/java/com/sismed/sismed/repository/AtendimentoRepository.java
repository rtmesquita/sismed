package com.sismed.sismed.repository;

import com.sismed.sismed.model.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
    List<Atendimento> findAllByMedico_Id (Long MedicoId);
    List<Atendimento> findAllByPaciente_Id (Long pacienteId);
}
