CREATE SCHEMA IF NOT EXISTS GestaoDeEventos DEFAULT CHARACTER SET utf8;
USE GestaoDeEventos;

#drop database GestaoDeEventos;
 
CREATE TABLE IF NOT EXISTS Organizadores (
  id_organizador INT UNSIGNED NOT NULL,
  nome VARCHAR(45) NOT NULL,
  contato VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_organizador)
);
 
CREATE TABLE IF NOT EXISTS Eventos (
  id_eventos INT UNSIGNED NOT NULL,
  nome VARCHAR(45) NOT NULL,
  data varchar(45) NOT NULL,
  local VARCHAR(45) NOT NULL,
  capacidade INT UNSIGNED NOT NULL,
  ingressos_disponiveis INT UNSIGNED NOT NULL,
  ingressos_vendidos INT UNSIGNED NOT NULL,
  organizadores_id_organizador INT UNSIGNED NOT NULL,
  PRIMARY KEY (id_eventos),
  INDEX fk_eventos_organizadores_idx (organizadores_id_organizador),
  CONSTRAINT fk_eventos_organizadores
    FOREIGN KEY (organizadores_id_organizador)
    REFERENCES Organizadores (id_organizador)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);
 
 
CREATE TABLE IF NOT EXISTS Participantes (
  id_participante INT UNSIGNED NOT NULL,
  nome VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  telefone VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_participante)
);
 
CREATE TABLE IF NOT EXISTS Inscricoes (
  id_inscricao INT UNSIGNED NOT NULL,
  eventos_id_eventos INT UNSIGNED NOT NULL,
  participantes_id_participante INT UNSIGNED NOT NULL,
  data_inscricao DATE NOT NULL,
  status TINYINT(1) NOT NULL,
  PRIMARY KEY (id_inscricao),
  INDEX fk_inscricoes_participantes_idx (participantes_id_participante),
  INDEX fk_inscricoes_eventos_idx (eventos_id_eventos),
  CONSTRAINT fk_inscricoes_eventos
    FOREIGN KEY (eventos_id_eventos)
    REFERENCES Eventos (id_eventos)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_inscricoes_participantes
    FOREIGN KEY (participantes_id_participante)
    REFERENCES Participantes (id_participante)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);
 
CREATE TABLE IF NOT EXISTS Ingressos (
  id_ingresso INT UNSIGNED NOT NULL,
  tipo_ingresso VARCHAR(45) NOT NULL,
  preco DECIMAL(10,2) NOT NULL,
  quantidade INT UNSIGNED NOT NULL,
  inscricoes_id_inscricao INT UNSIGNED NOT NULL,
  PRIMARY KEY (id_ingresso),
  INDEX fk_ingressos_inscricoes_idx (inscricoes_id_inscricao),
  CONSTRAINT fk_ingressos_inscricoes
    FOREIGN KEY (inscricoes_id_inscricao)
    REFERENCES Inscricoes (id_inscricao)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

select * from Eventos;
select * from Organizadores;