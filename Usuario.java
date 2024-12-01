package domain;

import java.util.Objects;

public class Usuario {
    private Long codigo;
    private String nome;
    private Double peso;
    private String cor;
    private String genero;
    private Integer idade;
    private Long telefone;
    private String dono;

    public Usuario(String codigo, String nome, String peso, String cor, String genero, String idade, String telefone, String dono){
        this.codigo = Long.valueOf(codigo.trim());
        this.nome = nome;
        this.peso = Double.valueOf(peso.trim());
        this.cor = cor;
        this.genero = genero;
        this.idade = Integer.valueOf(idade);
        this.telefone = Long.valueOf(telefone.trim());
        this.dono = dono;
    }

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(codigo, usuario.codigo);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Nome: " + nome + '\'' +
                ", Peso: " + peso +
                ", Cor: " + cor + '\'' +
                ", Gênero: " + genero + '\'' +
                ", Idade: " + idade +
                ", Telefone: " + telefone +
                ", Dono: " + dono + '\'' +
                ".";
    }
}
