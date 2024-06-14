package com.example.loja_online;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;

public class Recuperar_Senha extends AppCompatActivity {
    FirebaseAuth autenticacao;
    EditText editTextEmail;
    Usuario user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);
        initialize();
        autenticacao = ConnectionDb.Fireautenticacao();
    }


    public void initialize(){

        editTextEmail = findViewById(R.id.editTextEmail);



    }


    public void recuperarSenha(View view){

        String email = editTextEmail.getText().toString();



        if(!email.isEmpty()){


    autenticacao.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
        @Override
        public void onSuccess(Void aVoid) {
            Toast.makeText(Recuperar_Senha.this, "Verifique seu email!", Toast.LENGTH_SHORT).show();
        }
    }).addOnFailureListener(new OnFailureListener() {
        @Override
        public void onFailure(@NonNull Exception e) {
            Toast.makeText(Recuperar_Senha.this, "Erro ao enviar email de recuperação!", Toast.LENGTH_SHORT).show();

        }
    });



        }else{

            Toast.makeText(Recuperar_Senha.this, "O campo está vazio, coloque suas informações!", Toast.LENGTH_SHORT).show();
        }



    }

    public void VoltarLogin(View view){

        trocaTela();
    }

    public void trocaTela(){
        Intent in = new Intent(Recuperar_Senha.this, MainActivity.class);
        startActivity(in);


    }

}