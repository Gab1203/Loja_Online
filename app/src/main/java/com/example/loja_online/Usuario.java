package com.example.loja_online;



public class Usuario {

private String email;
private String telefone;
private String senha;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public Usuario(String email, String telefone, String senha) {
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
}
