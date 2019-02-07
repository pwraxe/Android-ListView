package com.example.akshay.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView lv;
    String[] languages = {"A# .NET","A++","Apex","Android","AppleScript","Assembly language","Bash","BASIC","BCPL","C","C--","C++","C#","COBOL","Cobra","CPL","EPL","Game Maker Language","Go","Hack","Java","JavaFX Script","JavaScript","JScript","JScript .NET","JSON","Kojo","Kotlin","LaTeX","Lite-C","LiveCode","LiveScript",
            "MATLAB","Maya","MIIS","NASM","Oak","Oberon","Perl","PHP","PL/SQL","Python","R","R++","Ruby Rail","SQL","swift","Visual Basic","Visual Basic .NET"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list_id);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,languages);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        TextView txt =(TextView) view;
        Toast.makeText(this,txt.getText().toString()+" ",Toast.LENGTH_SHORT).show();
    }
}
