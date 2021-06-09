package entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_seq")
    @SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_seq", allocationSize = 1)
    private Long id;

    private String name;

    private String matricula;

    private String universidade;

    private String semestreInicial;

    private Double porcentagemDeIntegralização;
}
