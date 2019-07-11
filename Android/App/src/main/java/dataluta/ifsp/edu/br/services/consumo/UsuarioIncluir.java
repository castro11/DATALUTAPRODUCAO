package dataluta.ifsp.edu.br.services.consumo;

import android.content.Intent;
import android.os.AsyncTask;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class UsuarioIncluir extends AsyncTask<Object, Object, Void> {
    String userNome;
    String userMunicipio;
    String userUf;
    String userNomeAssentamento;
    Integer userCodLocal;
    String userEmail;
    String userSenha;
    private HttpURLConnection urlConnection = null;
    private BufferedReader reader = null;
    private StringBuffer buffer = new StringBuffer();


    public UsuarioIncluir(String nome, String municipio, String uf, String nomeAssentamento, Integer codLocal, String email, String senha) {
        userNome = nome;
        userMunicipio = municipio;
        userUf = uf;
        userNomeAssentamento = nomeAssentamento;
        userCodLocal = codLocal;
        userEmail = email;
        userSenha = senha;
    }
    @Override
    protected Void doInBackground(Object... objects) {
        try {
            //http://localhost:8080/PrjDataLutaServices/ProducaoIncluirService2.do?txtQualidadeProducao=otimo&txtQuantidadeProducao=100&txtCodProduto_Producao=1
            //URL url = new URL("http://localhost:8080/PrjDataLutaServices/CadastroContaUsuario.do?txtbNome=" + userNome + "&spMunicipio=" + userMunicipio + "&spUF=" + userUf + "&txtbNomeAssentamento=" + userNomeAssentamento + "&txtbCodLocal=" + userCodLocal + "&txtbEmail=" + userEmail + "&txtbSenha=" + userSenha);
            URL url = new URL("http://localhost:8080/PrjDataLutaServices/CadastroContaUsuario.do?codlocal=3&nome=3&municipio=3&uf=3&nomeassentamento=3&email=3&senha=3");

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String linha;

            while ((linha = reader.readLine()) != null) {
                buffer.append(linha);
                buffer.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        return null;
    }
}
