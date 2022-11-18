package springdata.projeto8.projeto08.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Turma {
    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Disciplina disciplina;
    @ManyToMany
    private List<Aluno> Aluno;
    private Date horario;

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Turma(int codigo, Disciplina disciplina, List<springdata.projeto8.projeto08.model.Aluno> aluno) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        Aluno = aluno;
    }

    public Turma() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAluno() {
        return Aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        Aluno = aluno;
    }
}
