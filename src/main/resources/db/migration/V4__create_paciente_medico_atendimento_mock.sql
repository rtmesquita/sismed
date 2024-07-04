INSERT INTO paciente
(id, nome, sexo, data_nascimento)
VALUES
    (1, 'Helena', 'F', '2000-07-10');
INSERT INTO paciente
(id, nome, sexo, data_nascimento)
VALUES
    (2, 'Vitoria', 'F', '2002-12-10');
INSERT INTO paciente
(id, nome, sexo, data_nascimento)
VALUES
    (3, 'Abner', 'M', '1999-07-19');
INSERT INTO paciente
(id, nome, sexo, data_nascimento)
VALUES
    (4, 'Rafael', 'M', '1989-10-12');


INSERT INTO medico
    (id, nome, crm, especialidade)
VALUES (1, 'Roberto', '123456DF', 'Obstetrícia');
INSERT INTO medico
(id, nome, crm, especialidade)
VALUES (2, 'Sergio', '654321MG', 'Cliníco Geral');


INSERT INTO atendimento
    (id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (1, 1, 1, 'Tosse', 'O paciente está se queixando de tosse a 3 dias.', 0, '', 0, 1, 0, '2024-06-02');
INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (2, 1, 2, 'Falta de ar', 'O paciente está se queixando de falta de ar a 5 dias.', 1, 'Paracetamol', 0, 1, 0, '2024-07-02');
INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (3, 1, 3, 'Diarreia', 'O paciente está se queixando de diarreia a 2 dias.', 1, '', 1, 1, 0, '2024-06-02');
INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (4, 1, 4, 'Dor no ouvido', 'O paciente está se queixando de dor no ouvido a 6 dias.', 0, 'Dipirona', 0, 1, 0, '2024-05-24');

INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (5, 2, 1, 'Dor de barriga', 'O paciente está se queixando de dor de barriga a 7 dias.', 0, '', 0, 1, 0, '2024-5-12');
INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (6, 2, 2, 'Dor de cabeça', 'O paciente está se queixando de dor de cabeça a 2 dias.', 1, 'Paracetamol', 0, 1, 0, '2024-04-22');
INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (7, 2, 3, 'Dor nas costas', 'O paciente está se queixando de dor nas costas a 12 dias.', 1, '', 1, 1, 0, '2024-03-13');
INSERT INTO atendimento
(id, id_medico, id_paciente, queixa, historia, tratamento_medico, alergia, cirurgia, gestante, fumante, data_atendimento)
VALUES
    (8, 2, 4, 'Dor na perna', 'O paciente está se queixando de dor na perna a 2 dias.', 0, 'Dipirona', 0, 1, 0, '2024-07-01');