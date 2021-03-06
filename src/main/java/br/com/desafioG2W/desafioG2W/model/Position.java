package br.com.desafioG2W.desafioG2W.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cargo")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cargo_nome;
    private int trail_id;
    private String cargo_missao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_atualizacao;
}
