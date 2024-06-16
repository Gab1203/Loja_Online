
package com.example.loja_online;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;



import java.util.ArrayList;
import java.util.Arrays;

public class Market extends AppCompatActivity {
    private static final String TAG = "Loja Online";
    ArrayList<Produto> produtoArrayList = new ArrayList<Produto>();
    private RecyclerView productsRecyclerView;
    private RecyclerView.Adapter productsAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        Log.d(TAG,"onCreate" + produtoArrayList.toString());

        productsRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewProducts);
        productsRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        productsRecyclerView.setLayoutManager(layoutManager);


        productsAdapter = new RecycleViewAdapter(produtoArrayList,Market.this);
        productsRecyclerView.setAdapter(productsAdapter);
        fillProductsList();

    }


public void fillProductsList(){

Produto produto1 = new Produto("Bermuda","Bermuda Branca", Double.parseDouble("30"), 1, 6,"https://w7.pngwing.com/pngs/797/72/png-transparent-bermuda-shorts-design-white-active-shorts-art.png");
Produto produto2 = new Produto("Calça","Calça Jeans", Double.parseDouble("70"), 2, 10,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSbzxck4k8SXh532IcudQUtSXTYC70NkpNpw&s");
Produto produto3 = new Produto("Camisa","Camisa Preta", Double.parseDouble("65"), 3, 5,"https://img.freepik.com/psd-gratuitas/vista-frontal-de-camiseta-branca-isolada_125540-1194.jpg?size=626&ext=jpg&ga=GA1.1.1141335507.1718236800&semt=ais_user");
Produto produto4 = new Produto("Luvas","Luvas de Algodão", Double.parseDouble("15"), 4, 22,"https://ldisafety.com.br/wp-content/uploads/2023/11/1020-b-ok.png");
Produto produto5 = new Produto("Perfume","Perfume Doce", Double.parseDouble("82"), 5, 17,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiutbX6Irloidzx7TnuERyUA8Ms9fmQQ1cfg&s");

produtoArrayList.addAll(Arrays.asList(new Produto[] {produto1,produto2,produto3,produto4,produto5})) ;


}

}


