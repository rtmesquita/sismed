CREATE TABLE medico
(
    id INTEGER PRIMARY KEY UNIQUE NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    crm VARCHAR(20) NOT NULL UNIQUE,
    especialidade VARCHAR(50) NOT NULL
);

CREATE TABLE paciente
(
    id INTEGER PRIMARY KEY UNIQUE NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    sexo CHAR(1) NOT NULL,
    data_nascimento DATE NOT NULL
);

CREATE TABLE atendimento
(
    id INTEGER PRIMARY KEY UNIQUE NOT NULL AUTO_INCREMENT,
    id_paciente INTEGER NOT NULL,
    id_medico INTEGER NOT NULL,
    queixa VARCHAR(300) NOT NULL,
    historia VARCHAR(1000) NOT NULL,
    tratamento_medico BOOLEAN NOT NULL,
    alergia VARCHAR(150),
    cirurgia BOOLEAN,
    gestante BOOLEAN,
    fumante BOOLEAN,
    FOREIGN KEY (id_paciente) REFERENCES paciente(id),
    FOREIGN KEY (id_medico) REFERENCES medico(id)
);