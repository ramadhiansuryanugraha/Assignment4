package com.example.unj.cs.hw4.coffeeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.unj.cs.hw4.coffeeapplication.Model.ItemList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter coffeeAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemList> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList.add(new ItemList("Latte",R.drawable.latte, "Latte sering disajikan dengan menuangkan susu panas ke dalam cangkir yang sudah berisi espresso, sehingga terbentuk gambar lucu di cangkir latte.","Namanya berasal dari 'caffelatte' yang berarti kopi susu. Tergolong minuman kopi klasik yang diracik dari espresso yang ditambahkan susu panas dan foam susu di atasnya. Sesuai namanya, perbandingan antara espresso yang digunakan dengan susu cair adalah 1:3. Bagi sebagian orang, mereka menyukai latte tanpa tambahan gula maupun sirup karamel."));
        arrayList.add(new ItemList("Cappucino",R.drawable.cappucino,"Nama 'cappuccino' berasal dari 'caphucin', topi pada jubah pastur Italia karena warnanya mirip jubah tersebut. Racikan kopi dan susu khas Italia.","Minuman kopi ini terdiri dari dua bahan, espresso dan susu panas yang dikocok hingga berbuih halus. Racikan cappuccino dibuat dengan perbandingan bahan, 1/3 espresso, 1/3 susu dan 1/3 buih susu atau foam."));
        arrayList.add(new ItemList("Machiato",R.drawable.machiato, "Macchiato merupakan minuman dengan perpaduan espresso dan susu.","Untuk perbandingan espresso dan susu dalam minuman macchiato ini adalah 1:1. Sedangkan untuk macchiato latte memiliki perbandingan takaran antara espresso dan susu sebesar 1:4. Tatanan isi macchiato memiliki 3 layer, yaitu foam atau busa, susu, dan kopi."));
        arrayList.add(new ItemList("Cold Brew",R.drawable.coldbrew, "Cold brew dibuat dari biji kopi lokal pilihan atau house blend. Kopi ini biasanya dikemas dalam botol-botol kaca dan didinginkan dalam lemari es.","Sesuai dengan namanya kopi ini dibuat tidak dengan menyeduh pakai air panas. Melainkan merendam kopi bubuk dengan air dingin atau air bersuhu ruangan selama beberapa jam atau semalaman. Tujuannya untuk mengeluarkan semua rasa kopi dan menciptakan profil yang berbeda dengan kopi seduh panas."));
        arrayList.add(new ItemList("Espresso",R.drawable.espresso, "Espresso merupakan ekstrak biji kopi yang dimana biji kopi ini diproses menggunakan mesin bertekanan dan suhu tinggi dalam waktu singkat. ","Nama espresso ini diambil dari Bahasa Italia yang artinya “cepat”. Espresso merupakan ekstrak biji kopi yang dimana biji kopi ini diproses menggunakan mesin bertekanan dan suhu tinggi dalam waktu singkat. Espresso bisa dikatakan sebagai saripati bijij kopi yang murni karena tidak ditambah bahan-bahan lainnya."));
        arrayList.add(new ItemList("Americano",R.drawable.americano, "Merupakan minuman kopi yang terkenal di Italia dan orang Italia menyebut racikan kopi ini sebagai kopi Amerika atau cafe America.", "Minuman kopi ini terbuat dari espresso yang dilarutkan dengan air tetapi rasanya lebih kuat dari kopi tubruk. Pekat tidaknya Americano tergantung pada perbandingan antara jumlah shot espresso dengan air. Biasanya 28 ml hingga 455 ml air panas ditambahkan ke double shot espresso."));



        recyclerView = findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        coffeeAdapter =  new CoffeeAdapter(this, arrayList);
        recyclerView.setAdapter(coffeeAdapter);





    }
}