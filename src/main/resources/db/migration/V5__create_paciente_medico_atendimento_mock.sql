INSERT INTO paciente
(id, nome, sexo, data_nascimento)
VALUES
    (1, 'Helena', 'F', '2000-07-10');

INSERT INTO medico
    (id, nome, crm, especialidade)
VALUES (1, 'Roberto', '123456DF', 'Obstetrícia');

INSERT INTO atendimento
    (id, id_paciente, id_medico, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante)
VALUES
    (1, 1, 1, 'Tosse', 'O paciente está se quiexando de tosse a 3 dias.', 0, '', 0, 1, 0);
