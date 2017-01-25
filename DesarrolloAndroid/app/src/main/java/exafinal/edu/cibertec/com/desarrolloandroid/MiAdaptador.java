package exafinal.edu.cibertec.com.desarrolloandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by HENRY on 24/01/2017.
 */

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder>  {
    private List<BromaResponse.ValueBean> listadoBromas;
    private List<ImagenesResponse.ImagenesBean> listadoImagenes;

    Context context;



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mDescripcion;
        public TextView mCodigo;
        public ImageView imageView;
        public ViewHolder(View v) {
            super(v);
            imageView=(ImageView)v.findViewById(R.id.photo_broma);
            mDescripcion =(TextView) v.findViewById(R.id.lblDescripcion);
            mCodigo =(TextView) v.findViewById(R.id.lblCodigo);

        }


    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MiAdaptador(List<BromaResponse.ValueBean> listadoBromas,Context context,List<ImagenesResponse.ImagenesBean> listadoImagenes) {
        this.listadoBromas = listadoBromas;
        this.context=context;
        this.listadoImagenes=listadoImagenes;

    }

    @Override
    public MiAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
       //Pasando valores al textview codigo
        holder.mCodigo.setText("Codigo: "+listadoBromas.get(position).getId());
        //Cargando las imagenes(url) con la libreria picasso
         Picasso.with(context).load( listadoImagenes.get(position).getUrl()).placeholder(R.mipmap.ic_launcher).error(R.drawable.abc_btn_check_material).
                into(holder.imageView);

        //Agregando eventos a los elementos del Recyclearview
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BromaResponse.ValueBean objeto = listadoBromas.get(position);

                //Enviando los valores al Activity DetalleBroma , mediante el Intent
                Intent intent = new Intent(context, DetalleBroma.class);
                intent.putExtra("codigo", objeto.getId()+"");
                intent.putExtra("descripcion", objeto.getJoke());
                intent.putExtra("url",listadoImagenes.get(position).getUrl());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });

    }
    @Override
    public int getItemCount() {
        return listadoBromas.size();
    }
}