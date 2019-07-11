package com.example.gui_m.prjdatalutaview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void chamaHome(View view){
        Intent intent = new Intent(login.this,home.class);
        startActivity(intent);
    }
    public void chamaCadastroUsuario(View view){
        Intent intent = new Intent(login.this,cadastra_usuario.class);
        startActivity(intent);
    }
}
