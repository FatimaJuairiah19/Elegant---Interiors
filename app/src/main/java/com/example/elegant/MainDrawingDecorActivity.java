package com.example.elegant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainDrawingDecorActivity extends AppCompatActivity {

    List<Bedroom> bedroom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawing_decor);
        bedroom = new ArrayList<>();
        bedroom.add(new Bedroom("LIVING ROOM #01","Categorie LivingRoom","Cost 16000Tk only",R.drawable.drawingroom1));
        bedroom.add(new Bedroom("LIVING ROOM #02","Categorie LivingRoom","Cost 16000Tk only",R.drawable.drawingroom2jpg));
        bedroom.add(new Bedroom("LIVING ROOM #03","Categorie LivingRoom","Cost 15900Tk only",R.drawable.drawingroom3));
        bedroom.add(new Bedroom("LIVING ROOM #04","Categorie LivingRoom","Cost 15900Tk only",R.drawable.drawingroom4));
        bedroom.add(new Bedroom("LIVING ROOM #05","Categorie LivingRoom","Cost 16000Tk only",R.drawable.drawingroom5));
        bedroom.add(new Bedroom("LIVING ROOM #06","Categorie LivingRoom","Cost 15800Tk only",R.drawable.drawingroom6));
        bedroom.add(new Bedroom("LIVING ROOM #07","Categorie LivingRoom","Cost 16000Tk only",R.drawable.drawingroom7));
        bedroom.add(new Bedroom("LIVING ROOM #08","Categorie LivingRoom","Cost 16000Tk only",R.drawable.drawingroom3));
        bedroom.add(new Bedroom("LIVING ROOM #09","Categorie LivingRoom","Cost 15500Tk only",R.drawable.drawingroom5));
        bedroom.add(new Bedroom("LIVING ROOM #10","Categorie LivingRoom","Cost 16500Tk only",R.drawable.drawingroom8));
        bedroom.add(new Bedroom("LIVING ROOM #11","Categorie LivingRoom","Cost 15999Tk only",R.drawable.drawingroom9));
        bedroom.add(new Bedroom("LIVING ROOM #12","Categorie LivingRoom","Cost 16000Tk only",R.drawable.drawingroom4));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,bedroom);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}


