package com.example.tubes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterPromoRecycleView extends RecyclerView.Adapter<AdapterPromoRecycleView.ViewHolder>{

    private ArrayList<Diskon> daftarPromo = new ArrayList<>();
    private Context context;

    public AdapterPromoRecycleView(ArrayList<Diskon> promos, Context ctx) {
        daftarPromo.addAll(promos);
        context = ctx;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvPromo,tvTgl;

        ViewHolder(View v) {
            super(v);
            tvTitle = v.findViewById(R.id.nmWarung);
            tvTgl = v.findViewById(R.id.nmTanggal);
            tvPromo = v.findViewById(R.id.nmPromo);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promo, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        /**
         *  Menampilkan data pada view
         */
        final String name = daftarPromo.get(position).getNamaRM();
        final String promo = daftarPromo.get(position).getPromo();
        final String tgl = daftarPromo.get(position).getBerlaku();
        holder.tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 *  Kodingan untuk tutorial Selanjutnya :p Read detail data
                 */
            }
        });
        holder.tvTitle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                /**
                 *  Kodingan untuk tutorial Selanjutnya :p Delete dan update data
                 */
                return true;
            }
        });
        holder.tvTitle.setText(name);
        holder.tvPromo.setText(promo);
        holder.tvTgl.setText(tgl);
    }

    @Override
    public int getItemCount() {
        return daftarPromo.size();
    }
}
