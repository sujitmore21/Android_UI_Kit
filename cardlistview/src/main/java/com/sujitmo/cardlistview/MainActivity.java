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
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));
        mlist.add(new ItemModel(R.drawable.ic_launcher_background,"cities",R.drawable.ic_launcher_background,2500));

        ItemAdapter adapter = new ItemAdapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
