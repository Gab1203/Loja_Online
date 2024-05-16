package com.example.loja_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public ArrayList<Usuario> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void cadastrarConta(View view){
trocarTela(2);


    }


    public void entrar(View view){


        EditText editLogin = findViewById(R.id.editLogin);;
        EditText editPassword = findViewById(R.id.editPassword);


        String login = editLogin.getText().toString();
        String password = editPassword.getText().toString();
        int i;


        for(i = 0; i < users.size(); i++) {
            if (login.equals(users.get(i).getEmail()) || login.equals(users.get(i).getTelefone()) && password.equals(users.get(i).getSenha())) {


                trocarTela(0);

            }


        }

    }


    public void trocarTela(Integer whichScreen){



        switch (whichScreen) {

            case 0:

            Intent in0 = new Intent(MainActivity.this, Market.class);
            startActivity(in0);

            break;
            case 1:
            Intent in1 = new Intent(MainActivity.this , Recuperar_Senha.class);
            startActivity(in1);

            break;
            case 2:
                Intent in2 = new Intent(MainActivity.this, Tela_Cadastro.class);
                startActivity(in2);

                break;
        }


    }

    public void recuperarConta(View view){

trocarTela(1);

    }



}