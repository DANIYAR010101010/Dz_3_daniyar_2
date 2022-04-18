package com.example.dz_3_daniyar_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private ArrayList<String> contactes= new ArrayList<>();
   private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView=findViewById(R.id.recycler);
        ContactAdapter adapter = new ContactAdapter(contactes);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        contactes=new ArrayList<>();
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
        contactes.add("+5555555555555");
    }
}