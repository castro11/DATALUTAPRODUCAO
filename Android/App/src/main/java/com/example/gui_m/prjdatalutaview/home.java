package com.example.gui_m.prjdatalutaview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void chamaCadastroProduto(View view){
        Intent intent = new Intent(home.this,cadastra_produto.class);
        startActivity(intent);
    }
    public void chamaRelatorio(View view){
        Intent intent = new Intent(home.this,relatorio.class);
        startActivity(intent);
    }
    public void chamaLogin(View view){
        Intent intent = new Intent(home.this,login.class);
        startActivity(intent);
    }
}
