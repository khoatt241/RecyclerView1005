package khoatt.ttk.tonthatkhoa.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class MonanAdapter extends RecyclerView.Adapter<MonanAdapter.ViewHolder> {

    public MonanAdapter(ArrayList<Monan> mangmonan) {
        this.mangmonan = mangmonan;
    }

    ArrayList<Monan> mangmonan;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.dong_item_monan, null);
        return new ViewHolder(v); //ViewHolder v = new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Monan monan = mangmonan.get(i);
        viewHolder.img.setImageResource(monan.getHinhanh());
    }

    @Override
    public int getItemCount() {
        return mangmonan.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageMonan);
        }
    }
}
