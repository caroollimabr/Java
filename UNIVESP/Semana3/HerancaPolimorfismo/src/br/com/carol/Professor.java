package br.com.carol;

public class Professor {

    private int matricula;
    private String nome;

    public Professor() {
    }

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario(){
        return 0;
    }
}

class ProfessorConcursado extends Professor {  // poderia ser public ou private em outro arquivo
    private float salario;

    public ProfessorConcursado() {
    }

    public ProfessorConcursado(int matricula, String nome) {
        super(matricula,nome);
    }
    public ProfessorConcursado(int matricula, String nome, float salario) {
        super(matricula,nome);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

class ProfessorHorista extends Professor { // poderia ser public ou private em outro arquivo

    private float valorHora;
    private float numeroHoras;

    public ProfessorHorista() {
    }

    public ProfessorHorista(int matricula, String nome) {
        super(matricula, nome);
    }

    public ProfessorHorista(int matricula, String nome, float valorHora, float numeroHoras) {
        super(matricula, nome);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getNumeroHoras() {
        return this.numeroHoras;
    }

    public void setNumeroHoras(float numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getSalario() {
        return this.valorHora * this.numeroHoras;
    }
}
class TesteProfessor { // poderia ser public ou private em outro arquivo
    public void main(String[] args) { // seria static em outro arquivo
        ProfessorConcursado profconcur = new ProfessorConcursado();
        ProfessorHorista profhora = new ProfessorHorista();
        profconcur.setMatricula(2011);
        profconcur.setNome("Julio");
        profconcur.setSalario(1000);
        profhora.setMatricula(2021);
        profhora.setNome("João");
        profhora.setValorHora(70);
        profhora.setNumeroHoras(15);

        System.out.println("Salario Professor Concursado = " + profconcur.getSalario());
        System.out.println("Matrícula Professor Horista = " + profhora.getMatricula());
        System.out.println("Salario Professor Concursado = " + profconcur.getSalario());
        System.out.println("Matrícula Professor Horista = " + profhora.getMatricula());
    }
}

