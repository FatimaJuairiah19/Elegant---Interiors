package com.example.elegant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainBedDecorActivity extends AppCompatActivity {

    List<Bedroom> bedroom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bed_decor);
        bedroom = new ArrayList<>();
        bedroom.add(new Bedroom("Classic Bedroom","Categorie Bedroom","Cost 16000Tk only",R.drawable.bedroom1));
        bedroom.add(new Bedroom("Modern Bedroom","Categorie Bedroom","Cost 16000Tk only",R.drawable.bedroom2));
        bedroom.add(new Bedroom("Simple Bedroom","Categorie Bedroom","Cost 15900Tk only",R.drawable.bedroom3));
        bedroom.add(new Bedroom("Simple Bedroom","Categorie Bedroom","Cost 15900Tk only",R.drawable.bedroom4));
        bedroom.add(new Bedroom("Classic Bedroom","Categorie Bedroom","Cost 16000Tk only",R.drawable.bedroom5));
        bedroom.add(new Bedroom("Modern bedroom","Categorie Bedroom","Cost 15800Tk only",R.drawable.bedroom6));
        bedroom.add(new Bedroom("Classic bedroom","Categorie Bedroom","Cost 16000Tk only",R.drawable.bedroom7));
        bedroom.add(new Bedroom("Classic bedroom","Categorie Bedroom","Cost 16000Tk only",R.drawable.bedroom8));
        bedroom.add(new Bedroom("Classic bedroom","Categorie Bedroom","Cost 15500Tk only",R.drawable.bedroom9));
        bedroom.add(new Bedroom("Classic bedroom","Categorie Bedroom","Cost 16500Tk only",R.drawable.bedroom10));
        bedroom.add(new Bedroom("Classic bedroom","Categorie Bedroom","Cost 15999Tk only",R.drawable.bedroom7));
        bedroom.add(new Bedroom("Classic bedroom","Categorie Bedroom","Cost 16000Tk only",R.drawable.bedroom11));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,bedroom);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}

