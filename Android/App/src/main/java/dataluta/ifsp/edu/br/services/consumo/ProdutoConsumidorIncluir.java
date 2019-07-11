package dataluta.ifsp.edu.br.services.consumo;

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

import dataluta.ifsp.edu.br.model.Produto;

public class ProdutoConsumidorIncluir extends AsyncTask<Object, Object, Void> {
    private HttpURLConnection urlConnection = null;
    private BufferedReader reader = null;

    @Override
    protected Void doInBackground(Object... objects) {
/*
        try {
            URL url = new URL("http://192.168.64.121:8080/PrjDataLutaServices/AssentamentoConsultarAllService.do");

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

        Gson gson = new Gson();
        TypeToken<ArrayList<Assentamento>> token = new TypeToken<ArrayList<Assentamento>>() {};
        ArrayList<Assentamento> assentamentos1 = (ArrayList<Assentamento>) gson.fromJson(buffer.toString(),token.getType());

        return assentamentos1;*/
        return null;
    }
}
