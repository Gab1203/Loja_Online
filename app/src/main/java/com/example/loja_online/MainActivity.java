package com.example.loja_online;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Declaração de atributos da MainActivity(login), incluindo um objeto da classe FirebaseAuth e a classe de Usuario
    EditText editLogin, editPassword;
    FirebaseAuth autenticacao;
    Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Construtor que inicializa os objetos da activity

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autenticacao = ConnectionDb.Fireautenticacao();
        initialize();
    }


    public void initialize(){

         editLogin = findViewById(R.id.editLogin);
         editPassword = findViewById(R.id.editPassword);

    }



    public void cadastrarConta(View view){
trocarTela(2);


    }


    public void entrar(View view){

//Método que verifica se o usuário está ou não cadastrado para o login
        String login = editLogin.getText().toString();
        String password = editPassword.getText().toString();

        if(!login.isEmpty() && !password.isEmpty()) {
            user = new Usuario(login, login, password);

            autenticacao.signInWithEmailAndPassword(user.getEmail(), user.getSenha()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {


                    if (task.isSuccessful()) {

                        trocarTela(0);

                    } else {
                        String excecao = "";
                        try {
                            throw task.getException();

                        } catch (FirebaseAuthInvalidUserException e) {
                            excecao = "Usuário não cadastrado";


                        } catch (FirebaseAuthInvalidCredentialsException e) {
                            excecao = "Email ou senha incorretos!";

                        } catch (Exception e) {
                            excecao = "Erro ao logar: " + e.getMessage();
                            e.printStackTrace();

                        }

                        Toast.makeText(MainActivity.this, excecao, Toast.LENGTH_SHORT).show();
                    }
                }

            });


        } else{
            Toast.makeText(MainActivity.this, "Preencha os campos com informações para o login!", Toast.LENGTH_SHORT).show();
        }

    }


    public void trocarTela(Integer whichScreen){

//Método que faz a troca de tela a partir de um índice passado como parâmetro nessa função

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