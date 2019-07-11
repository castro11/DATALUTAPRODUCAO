package com.example.gui_m.prjdatalutaview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import dataluta.ifsp.edu.br.model.Produto;
import dataluta.ifsp.edu.br.services.consumo.ProducaoIncluir;
import dataluta.ifsp.edu.br.services.consumo.ProdutoBuscarTodosPorTipo;

public class cadastra_produto_folhagem extends AppCompatActivity {
    private String chave = "";
    TextView txtCadastrar3;
    Spinner spFolhagem;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    int codProduto;
    EditText txtbQualidadeFolhagem;
    EditText txtbQuantidadeFolhagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_produto_folhagem);

        txtCadastrar3 = (TextView) findViewById(R.id.txtCadastrar3);
        spFolhagem = (Spinner) findViewById(R.id.spFolhagem);
        txtbQualidadeFolhagem = (EditText) findViewById(R.id.txtbQualidadeFolhagem) ;
        txtbQuantidadeFolhagem = (EditText) findViewById(R.id.txtbQuantidadeFolhagem) ;

        Intent thisIntent = getIntent();
        chave = thisIntent.getStringExtra("chave");

        if(chave.equals("Legumes")){
            txtCadastrar3.setText("Cadastrar Legumes");
        }
        if(chave.equals("Frutas")){
            txtCadastrar3.setText("Cadastrar Frutas");
        }
        if(chave.equals("Folhagens")){
            txtCadastrar3.setText("Cadastrar Folhagens");
        }
        if(chave.equals("Carnes")){
            txtCadastrar3.setText("Cadastrar Carnes");
        }
        if(chave.equals("Ovos")) {
            txtCadastrar3.setText("Cadastrar Ovos");
        }
        ProdutoBuscarTodosPorTipo produtoBuscarTodosPorTipo = new ProdutoBuscarTodosPorTipo(chave);
        try {
            produtos = produtoBuscarTodosPorTipo.execute().get();
        }catch ( Exception e){
            System.out.println(e.getStackTrace().toString());
        }


        /*ArrayAdapter<Produto> areasAdapter = new ArrayAdapter<Produto>(this, android.R.layout.simple_spinner_item, produtos);
        areasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(areasAdapter);*/

        ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, produtos);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        spFolhagem.setAdapter(adapter);


        //Método do Spinner para capturar o item selecionado
        spFolhagem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int posicao, long id) {
                //pega nome pela posição
                codProduto = Integer.parseInt(parent.getItemAtPosition(posicao).toString().substring(0,parent.getItemAtPosition(posicao).toString().indexOf("-")-1));
                //imprime um Toast na tela com o nome que foi selecionado
                Toast.makeText(cadastra_produto_folhagem.this, "Selecionado: " + codProduto, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void cadastrar(View view){
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
        ProducaoIncluir producaoIncluir = new ProducaoIncluir(txtbQualidadeFolhagem.getText().toString(),Integer.parseInt(txtbQuantidadeFolhagem.getText().toString()), 1);
        producaoIncluir.execute();

    }
}
