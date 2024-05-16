package com.example.loja_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;

public class Tela_Cadastro extends AppCompatActivity {
    public ArrayList<Usuario> usuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
    }


    public void cadastrar(View view){

MainActivity main = new MainActivity();


        EditText editEmail = findViewById(R.id.editEmail);
        EditText editPhone = findViewById(R.id.editPhone);
        EditText editPassword = findViewById(R.id.editPassword);
        EditText editConfirm = findViewById(R.id.editConfirm);

        String email = editEmail.getText().toString();
        String phone = editPhone.getText().toString();
        String password = editPassword.getText().toString();
        String confirma = editConfirm.getText().toString();
        int i;

        if(password.equals(confirma)){

            for (i = 0; i < usuarios.size(); i++){

                if(!phone.equals(usuarios.get(i).getTelefone()) || !email.equals(usuarios.get(i).getEmail())){

usuarios.add(new Usuario(email,phone,password));

                    Collections.copy(main.users, this.usuarios);
                    trocaTela();
                }

            }


        }




    }

    public void voltarLogin(View view){

trocaTela();


    }

    public void trocaTela(){

        Intent in = new Intent(Tela_Cadastro.this, MainActivity.class);
        startActivity(in);

    }

}