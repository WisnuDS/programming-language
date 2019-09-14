package com.dicoding.programinglanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvProgramingLanguage;
    private ArrayList<ProgramingLanguage> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProgramingLanguage = findViewById(R.id.rv_programin_language);
        rvProgramingLanguage.setHasFixedSize(true);
        ProgramingDataset data = new ProgramingDataset(this);
        list.addAll(data.getListData());
        showRecycleview();
    }

    private void showRecycleview(){
        rvProgramingLanguage.setLayoutManager(new LinearLayoutManager(this));
        ListViewAdapter listViewAdapter = new ListViewAdapter(list);
        rvProgramingLanguage.setAdapter(listViewAdapter);
        listViewAdapter.setOnItemClickCallback(new ListViewAdapter.OnItemClickCallback() {
            @Override
            public void onItemCliced(ProgramingLanguage data) {
                selectedProgramingLanguage(data);
            }
        });
    }

    private void selectedProgramingLanguage(ProgramingLanguage data){
        Intent intent = new Intent(MainActivity.this, DetilProgramingLanguage.class);
        intent.putExtra("EXTRA_NAME", data.getName());
        intent.putExtra("EXTRA_DESC", data.getDescription());
        intent.putExtra("EXTRA_PHOTO", data.getPhoto());
        intent.putExtra("EXTRA_REFERENCE", data.getReference());
        startActivity(intent);
    }
}
