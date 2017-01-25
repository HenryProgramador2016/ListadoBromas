package exafinal.edu.cibertec.com.desarrolloandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class DetalleBroma extends AppCompatActivity {
    ImageView imageView;
    TextView codigoBroma;
    TextView descripcionBroma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_broma);

        codigoBroma=(TextView) findViewById(R.id.codigo_broma);
        descripcionBroma=(TextView) findViewById(R.id.descripcion_broma);
        imageView=(ImageView)findViewById(R.id.imagenBroma) ;

        String codigo=getIntent().getStringExtra("codigo");
        String descripcion=getIntent().getStringExtra("descripcion");
        String urlImagen=getIntent().getStringExtra("url");
        codigoBroma.setText("Codigo: "+codigo);
        descripcionBroma.setText(descripcion);
        Picasso.with(DetalleBroma.this
        ).load( urlImagen).placeholder(R.mipmap.ic_launcher).error(R.drawable.abc_btn_check_material).into(imageView);

    }

}
