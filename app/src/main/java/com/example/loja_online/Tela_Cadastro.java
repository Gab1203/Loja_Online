package com.example.loja_online;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.ims.ImsStateCallback;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;

import java.util.concurrent.TimeUnit;


public class Tela_Cadastro extends AppCompatActivity {

    //Criação dos atributos da classe Tela_Cadastro
EditText editEmail, editPhone, editPassword,editConfirm ;
    FirebaseAuth autenticacao;
    Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Construtor que inicializa os objetos

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        autenticacao = ConnectionDb.Fireautenticacao();
initialize();
    }


    public void initialize(){
        editEmail = findViewById(R.id.editEmail);
        editPhone = findViewById(R.id.editPhone);
        editPassword = findViewById(R.id.editSenha);
        editConfirm = findViewById(R.id.editConfirm);


    }

    public void cadastrar(View view) {
//Método para realizar o cadastro do usuário a partir de inserção dos seus dados e confirmação de senha
//Utiliza o Firebase como intermediador do processo

        String email = editEmail.getText().toString();
        String phone = editPhone.getText().toString();
        String password = editPassword.getText().toString();
        String confirma = editConfirm.getText().toString();


        if (!email.isEmpty() && !phone.isEmpty() && !password.isEmpty() && !confirma.isEmpty())  {

            if (password.equals(confirma)) {

                user = new Usuario(email, phone, password);


                autenticacao.createUserWithEmailAndPassword(user.getEmail(), user.getSenha()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Tela_Cadastro.this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();

                        } else {

                            Toast.makeText(Tela_Cadastro.this, "Erro ao cadastrar usuário!", Toast.LENGTH_SHORT).show();
                        }
                    }

                });


            } else {

                Toast.makeText(Tela_Cadastro.this, "Senhas não conferem!", Toast.LENGTH_SHORT).show();

            }


        }else{

            Toast.makeText(Tela_Cadastro.this, "Os campos estão vazios, coloque suas informações!", Toast.LENGTH_SHORT).show();

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