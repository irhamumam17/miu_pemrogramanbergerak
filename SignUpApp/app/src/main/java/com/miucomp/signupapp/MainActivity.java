package com.miucomp.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText edtUsername,edtPass,edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDaftar = findViewById(R.id.btnRegister);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        edtUsername = findViewById(R.id.edtUsername);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUsername.getText().toString().trim().isEmpty()){
                    edtUsername.setError("Username tidak boleh kosong");
                }else if(edtEmail.getText().toString().trim().isEmpty()){
                    edtEmail.setError("Email tidak boleh kosong");
                }else if(edtPass.getText().toString().trim().isEmpty()){
                    edtPass.setError("Password tidak boleh kosong");
                }else{
                    Toast.makeText(MainActivity.this, "Silahkan Login untuk masuk dengan akun yang telah anda buat", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,LoginActivity.class));
                }
            }
        });
    }


}
