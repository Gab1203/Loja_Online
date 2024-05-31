package com.example.loja_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class Recuperar_Senha extends AppCompatActivity {
    FirebaseAuth autenticacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);
        initialize();
    }


    public void initialize(){



    }


    public void recuperarSenha(View view){

        //autenticacao.sendPasswordResetEmail();

    }

    public void trocaTela(){
        Intent in = new Intent(Recuperar_Senha.this, MainActivity.class);
        startActivity(in);


    }

}