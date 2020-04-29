package com.sujitmo.cardlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the status bar background to transparent

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //setup recyclerview with the adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemModel> mlist = new ArrayList<>();
        mlist.add(new ItemModel(R.drawable.nick_herasimenka,"Nick Herasimenka",R.drawable.collins_lesulie,2500));
        mlist.add(new ItemModel(R.drawable.jeff_rodgers,"Jeff Rodgers",R.drawable.stephen_arnold,1500));
        mlist.add(new ItemModel(R.drawable.ray_hennessy,"Roy Hennessy",R.drawable.tyler_nix,500));
        mlist.add(new ItemModel(R.drawable.collins_lesulie,"Collins Lesulie",R.drawable.tyler_nix,1100));
        mlist.add(new ItemModel(R.drawable.stephen_arnold,"Stephen Arnold",R.drawable.stephen_arnold,3200));
        mlist.add(new ItemModel(R.drawable.tyler_nix,"Tyler Nix",R.drawable.collins_lesulie,2200));
        mlist.add(new ItemModel(R.drawable.nick_herasimenka,"Nick Herasimenka",R.drawable.collins_lesulie,2500));
        mlist.add(new ItemModel(R.drawable.jeff_rodgers,"Jeff Rodgers",R.drawable.stephen_arnold,1500));
        mlist.add(new ItemModel(R.drawable.ray_hennessy,"Roy Hennessy",R.drawable.tyler_nix,500));
        mlist.add(new ItemModel(R.drawable.collins_lesulie,"Collins Lesulie",R.drawable.tyler_nix,1100));
        mlist.add(new ItemModel(R.drawable.stephen_arnold,"Stephen Arnold",R.drawable.stephen_arnold,3200));
        mlist.add(new ItemModel(R.drawable.tyler_nix,"Tyler Nix",R.drawable.collins_lesulie,2200));


        ItemAdapter adapter = new ItemAdapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
