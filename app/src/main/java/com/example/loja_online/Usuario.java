package com.example.loja_online;


import android.content.Context;
import android.widget.Toast;

import com.mysql.jdbc.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {

private String email;
private String telefone;
private String senha;

public ConnectionClass connectionClass;
public Connection con;
public ResultSet resultSet;
public String name;
public String str;
    PreparedStatement ps = null;
    private Context Usuario;

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

    public boolean searchRows(String email, String telefone) {
boolean isThere = false;

        try {

            ps = con.prepareStatement("select email, telefone, senha from usuarios where email = ? or telefone = ?");

            ps.setString(1, email);
            ps.setString(2,telefone);

ResultSet result = ps.executeQuery();

if(result.next() == false){
    isThere = false;


}else{
    isThere = true;
}

        }catch(SQLException e){

            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);

        }

        return isThere;
    }

    public boolean verifyPassword(String email, String telefone, String senha){

        boolean isIt = false;

        try {

            ps = con.prepareStatement("select email, telefone, senha from usuarios where email = ? or telefone = ? and senha = ?");

            ps.setString(1, email);
            ps.setString(2,telefone);
            ps.setString(3,senha);

            ResultSet result = ps.executeQuery();

            if(result.next() == false){
                isIt = false;


            }else{
                isIt = true;
            }

        }catch(SQLException e){

            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);

        }

        return isIt;

    }

    public void cadastrarUsuario(){

        String sql = "INSERT INTO usuarios(email, telefone, senha) VALUES (?,?,?)";



        try{
            ps = ConnectionClass.getConnection().prepareStatement(sql);
            ps.setString(1, getEmail());
            ps.setString(2, getTelefone());
            ps.setString(3, getSenha());

            ps.execute();
            ps.close();



        }catch (SQLException e){

            e.printStackTrace();
        }


    }



}
