package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Myholder> {

    List<Data> data ;
    Context context;


    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_layout , parent , false);
        return new Myholder(view);
    }

    public Adapter(List<Data> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        Data all = data.get(position);
        holder.textView.setText(all.txt);
        holder.imageView.setImageResource(all.imageId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public Myholder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.txtView);
            imageView = itemView.findViewById(R.id.image);


        }
    }
}
