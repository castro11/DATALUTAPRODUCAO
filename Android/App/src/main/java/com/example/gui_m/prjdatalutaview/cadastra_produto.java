package com.example.gui_m.prjdatalutaview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cadastra_produto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_produto);
    }

    public void chamaLegumes(View view){
        Intent intent = new Intent(cadastra_produto.this,cadastra_produto_legume.class);
        intent.putExtra("chave","Legumes");
        startActivity(intent);

    }

    public void chamaFruta(View view){
        Intent intent = new Intent(cadastra_produto.this,cadastra_produto_fruta.class);
        intent.putExtra("chave","Frutas");
        startActivity(intent);
    }

    public void chamaCarne(View view){
        Intent intent = new Intent(cadastra_produto.this,cadastra_produto_carne.class);
        intent.putExtra("chave","Carnes");
        startActivity(intent);

    }

    public void chamaFolhagem(View view){
        Intent intent = new Intent(cadastra_produto.this,cadastra_produto_folhagem.class);
        intent.putExtra("chave","Folhas");
        startActivity(intent);

    }

    public void chamaOvos(View view){
        Intent intent = new Intent(cadastra_produto.this,cadastra_produto_ovo.class);
        intent.putExtra("chave","Ovos");
        startActivity(intent);
    }
}
