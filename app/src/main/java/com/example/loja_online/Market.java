
package com.example.loja_online;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Market extends AppCompatActivity {
    private static final String TAG = "Loja Online";
    ArrayList<Produto> produtoArrayList = new ArrayList<Produto>();
    private RecyclerView productsRecyclerView;
    private RecyclerView.Adapter productsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    Menu menu ;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sort_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if(item.getItemId() == R.id.menu_AZ){
            Collections.sort(produtoArrayList, Produto.produtoComparatorAz);
productsAdapter.notifyDataSetChanged();
            return true;
        }else if(item.getItemId() == R.id.menu_ZA){
            Collections.sort(produtoArrayList, Produto.produtoComparatorZa);
            productsAdapter.notifyDataSetChanged();
            return true;

        }else if(item.getItemId() == R.id.menu_maiorPreco){
            Collections.sort(produtoArrayList, Produto.produtoComparatorPriceAscending);
            productsAdapter.notifyDataSetChanged();
            return true;
        }else if(item.getItemId() == R.id.menu_menorPreco){
            Collections.sort(produtoArrayList, Produto.produtoComparatorPriceDescending);
            productsAdapter.notifyDataSetChanged();
            return true;
        }


return  super.onOptionsItemSelected(item);

    }


    public void fillProductsList(){

Produto produto1 = new Produto("Bermuda","Bermuda Branca", Double.parseDouble("30"), 1, 6,"https://w7.pngwing.com/pngs/797/72/png-transparent-bermuda-shorts-design-white-active-shorts-art.png");
Produto produto2 = new Produto("Calça","Calça Jeans", Double.parseDouble("70"), 2, 10,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSbzxck4k8SXh532IcudQUtSXTYC70NkpNpw&s");
Produto produto3 = new Produto("Camisa","Camisa Preta", Double.parseDouble("65"), 3, 5,"https://img.freepik.com/psd-gratuitas/vista-frontal-de-camiseta-branca-isolada_125540-1194.jpg?size=626&ext=jpg&ga=GA1.1.1141335507.1718236800&semt=ais_user");
Produto produto4 = new Produto("Luvas","Luvas de Algodão", Double.parseDouble("15"), 4, 22,"https://ldisafety.com.br/wp-content/uploads/2023/11/1020-b-ok.png");
Produto produto5 = new Produto("Perfume","Perfume Doce", Double.parseDouble("82"), 5, 17,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiutbX6Irloidzx7TnuERyUA8Ms9fmQQ1cfg&s");
Produto produto6 = new Produto("Botas","Botas de Couro", Double.parseDouble("47.99"), 6, 12,"https://w7.pngwing.com/pngs/29/255/png-transparent-cowboy-boot-tony-lama-boots-justin-boots-leather-boots-brown-cowboy-leather.png");
Produto produto7 = new Produto("Cueca","Cueca Boxer", Double.parseDouble("15.99"), 7, 26,"https://png.pngtree.com/png-vector/20210205/ourmid/pngtree-mens-boxer-cotton-underwear-png-image_2875678.jpg");
Produto produto8 = new Produto("Cinto","Cinto de Couro", Double.parseDouble("45.99"), 8, 21,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9A4F8RRJsqyFIPnw1lIWQ4QeFT6o86lQTUQ&s");
Produto produto9 = new Produto("Jaqueta","Jaqueta de Couro", Double.parseDouble("155"), 9, 8,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdbqtoIMMAMQPAWXtQGNeRVkopd8NckHho0A&s");
Produto produto10 = new Produto("Chapéu","Chapéu Preto", Double.parseDouble("39.90"), 10, 3,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlt9b-Oy7LWLOpSMkOmUgINI_7n7AXMy5ylQ&s");



produtoArrayList.addAll(Arrays.asList(new Produto[] {produto1,produto2,produto3,produto4,produto5,produto6,produto7,produto8,produto9,produto10})) ;



}

}


