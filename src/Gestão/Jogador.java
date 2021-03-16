package Gestão;


import java.util.List;

public class Jogador {
    private String nome;
    private int idade;
    private double velocidade;
    private double resistencia;
    private double destreza;
    private double impulsao;
    private double jogoCabeca;
    private double remate;
    private double capacidadePasse;
    private List<String> historial;

    public Jogador(String nome,int idade) {
        //completar
        setNome(nome);
        setIdade(idade);






    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRemate() {
        return remate;
    }

    public void setRemate(double remate) {
        this.remate = remate;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getDestreza() {
        return destreza;
    }

    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }

    public double getImpulsao() {
        return impulsao;
    }

    public void setImpulsao(double impulsao) {
        this.impulsao = impulsao;
    }

    public double getJogoCabeca() {
        return jogoCabeca;
    }

    public void setJogoCabeca(double jogoCabeca) {
        this.jogoCabeca = jogoCabeca;
    }

    public double getCapacidadePasse() {
        return capacidadePasse;
    }

    public void setCapacidadePasse(double capacidadePasse) {
        this.capacidadePasse = capacidadePasse;
    }

    public List getHistorial() {
        return historial;
    }

    public void setHistorial(List historial) {
        this.historial = historial;
    }
}
