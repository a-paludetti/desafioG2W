package br.com.desafioG2W.desafioG2W.model;

import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
public class Trilha {

    @Id
    private int ID;
    private String trilha_nome;
    private String diretoria;
    private String missao_formal;
    private String missao_alternativa;

    private Date data_atualizacao;
}