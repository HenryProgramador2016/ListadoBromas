package exafinal.edu.cibertec.com.desarrolloandroid;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class ListadoBromas extends AppCompatActivity {

    RecyclerView recyclerView;
    MiAdaptador adapatador;
    AsyncHttpClient cliente;
    BromaResponse bromaResponse;
    String url="http://api.icndb.com/jokes/random/20";
    Gson gson;


    //Para las imagenes;
    ImagenesResponse imagenesResponse;
    AsyncHttpClient clienteImagen;
    String urlImagen="http://www.json-generator.com/api/json/get/cfVBQuyffS?indent=2";
    Gson gsonImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_bromas);

        recyclerView=(RecyclerView)findViewById(R.id.bromaLiatado);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);


        clienteImagen=new AsyncHttpClient();
        clienteImagen.get(ListadoBromas.this, urlImagen, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String str=new String(responseBody);
                gsonImagen=new Gson();
                imagenesResponse=gsonImagen.fromJson(str,ImagenesResponse.class);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

        cliente=new AsyncHttpClient();
        cliente.get(ListadoBromas.this, url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    String str=new String(responseBody);
                    gson=new Gson();
                    bromaResponse=gson.fromJson(str,BromaResponse.class);
                    adapatador=new MiAdaptador(bromaResponse.getValue(),getApplicationContext(),imagenesResponse.getImagenes());
                    recyclerView.setAdapter(adapatador);

                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                }
            });




    }
}
