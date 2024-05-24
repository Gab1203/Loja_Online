package com.example.loja_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;




public class Tela_Cadastro extends AppCompatActivity {
EditText editEmail, editPhone, editPassword,editConfirm ;
    FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        initialize();
    }


    public void initialize(){
         editEmail = findViewById(R.id.editEmail);
         editPhone = findViewById(R.id.editPhone);
         editPassword = findViewById(R.id.editSenha);
         editConfirm = findViewById(R.id.editConfirm);


    }

    public void cadastrar(View view){

autenticacao = ConnectionDb.Fireautenticacao();

        String email = editEmail.getText().toString();
        String phone = editPhone.getText().toString();
        String password = editPassword.getText().toString();
        String confirma = editConfirm.getText().toString();


        if(password.equals(confirma)) {





        }

trocaTela();


    }





    public void voltarLogin(View view){

trocaTela();


    }

    public void trocaTela(){

        Intent in = new Intent(Tela_Cadastro.this, MainActivity.class);
        startActivity(in);

    }

}