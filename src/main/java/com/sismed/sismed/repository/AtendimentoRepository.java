package com.sismed.sismed.repository;

import com.sismed.sismed.model.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
    @Query("SELECT " +
            "p.id as id, " +
            "p.nome as nome, " +
            "p.sexo as sexo, " +
            "p.dataNascimento as dataNascimento " +
            "FROM Atendimento a " +
            "JOIN Paciente p ON p.id = a.paciente.id " +
            "JOIN Medico m ON m.id = a.medico.id " +
            "WHERE a.medico.id = ?1")
    List<Object[]> findAllPacientesByMedicoId(Long medicoId);

    List<Atendimento> findAllByPaciente_Id (Long pacienteId);
}
