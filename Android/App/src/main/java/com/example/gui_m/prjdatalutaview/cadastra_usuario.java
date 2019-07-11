package com.example.gui_m.prjdatalutaview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import dataluta.ifsp.edu.br.services.consumo.UsuarioIncluir;

public class cadastra_usuario extends AppCompatActivity {
    EditText txtbNome;
    Spinner spMunicipio;
    Spinner spUF;
    EditText txtbCodLocal;
    EditText txtbNomeAssentamento;
    EditText txtbEmail;
    EditText txtbSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_usuario);

        txtbNome = (EditText) findViewById(R.id.txtbNome) ;
        spMunicipio = (Spinner) findViewById(R.id.spMunicipio);
        spUF = (Spinner) findViewById(R.id.spUF);
        txtbCodLocal = (EditText) findViewById(R.id.txtbCodLocal) ;
        txtbNomeAssentamento = (EditText) findViewById(R.id.txtbNomeAssentamento) ;
        txtbEmail = (EditText) findViewById(R.id.txtbEmail) ;
        txtbSenha = (EditText) findViewById(R.id.txtbSenha) ;

    }
    public void chamaLogin(View view){
        Intent intent = new Intent(cadastra_usuario.this,login.class);
        startActivity(intent);
    }




    public void cadastrarUsuario(View view){
        //Eclipse
        // criar um novo DAO para cadastrar producao
        // criar um servlet ProducaoIncluirService.do
        // no servlet recuperar cada item da tela por request.getParameter
        // executar o dao.gravar

        //AndroidStudio
        // criar um novo services.consumo com o nome de ProducaoIncluir
        // passar via URL todos os parametros
        // executar a URL


        //PrProducaoIncluir producaoIncluir = new ProducaoIncluir(txtQualidade.getText().toString(),Integer.parseInt(txtQuantidade.getText().toString()), Integer.parseInt(spinner.get))oducaoIncluir producaoIncluir = new ProducaoIncluir(txtQualidade.getText().toString(),Integer.parseInt(txtQuantidade.getText().toString()), Integer.parseInt(spinner.get))
        UsuarioIncluir UsuarioIncluir = new UsuarioIncluir(txtbNome.getText().toString(), spMunicipio.getSelectedItem().toString(), spUF.getSelectedItem().toString(), txtbNomeAssentamento.getText().toString(), Integer.parseInt(txtbCodLocal.getText().toString()), txtbEmail.getText().toString(), txtbSenha.getText().toString());
        UsuarioIncluir.execute();

    }
}