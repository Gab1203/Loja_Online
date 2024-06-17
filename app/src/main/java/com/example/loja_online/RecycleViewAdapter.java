package com.example.loja_online;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    //Declaração dos atributos da classe RecycleViewAdapter
    List<Produto> produtoList;
    Context context;

    public RecycleViewAdapter(List<Produto> produtoList, Context context) {
        //Construtor da classe
        this.produtoList = produtoList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Criação do View Holder para linkar a view "item_products" com o RecylerView

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_products,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    // Método para criar a vizualização do RecyclerView a partir do toString da classe Produto e a biblioteca Glide para mostrar a imagem do produto advinda da internet
    holder.txt_productDetails.setText(produtoList.get(position).toString());
    Glide.with(this.context).load(produtoList.get(position).getImageUrl()).into(holder.iv_productImage);


    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
//Classe para instanciação do TextView e ImageView do RecylerView
ImageView iv_productImage;
TextView txt_productDetails;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_productImage = itemView.findViewById(R.id.iv_productImage);
            this.txt_productDetails = itemView.findViewById(R.id.productDetails);
        }
    }
}
