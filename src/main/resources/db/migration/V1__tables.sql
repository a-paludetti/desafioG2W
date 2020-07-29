CREATE TABLE IF NOT EXISTS trilha(
  id                 int NOT NULL,
  trilha_nome        varchar(35)NOT NULL,
  diretoria          varchar(30)NOT NULL,
  missao_formal      varchar(270)NOT NULL,
  missao_alternativa varchar(126)NOT NULL,
  data_atualizacao   datetime NOT NULL
);

CREATE TABLE IF NOT EXISTS cargo(
  id               INT NOT NULL,
  cargo_nome       varchar(53)NOT NULL,
  trilha_id        INT NOT NULL,
  cargo_missao     varchar(492)NOT NULL,
  data_atualizacao datetime NOT NULL
);

--ALTER TABLE cargo ADD CONSTRAINT fk_cargo_trilha FOREIGN KEY(trilha_id)REFERENCES trilha;