package br.com.desafioG2W.desafioG2W.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;

@Data
@NoArgsConstructor
@Entity(name = "trilha")
public class Trilha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String trilha_nome;
    private String diretoria;
    private String missao_formal;
    private String missao_alternativa;
    private Date data_atualizacao;
}