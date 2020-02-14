package com.example.contryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshbuttonid,indiabuttonid,pakisthanbuttonid;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladeshbuttonid=(Button) findViewById(R.id.BangladeshId);
        indiabuttonid=(Button) findViewById(R.id.IndiaId);
        pakisthanbuttonid=(Button) findViewById(R.id.PakisthanId);

        bangladeshbuttonid.setOnClickListener(this);
        indiabuttonid.setOnClickListener(this);
        pakisthanbuttonid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.BangladeshId){
            intent=new Intent(MainActivity.this,contryprofile.class);
            intent.putExtra("tag","Bangladesh");
            startActivity(intent);
        }if (v.getId()==R.id.IndiaId){
            intent=new Intent(MainActivity.this,contryprofile.class);
            intent.putExtra("tag","India");
            startActivity(intent);
        }if (v.getId()==R.id.PakisthanId){
            intent=new Intent(MainActivity.this,contryprofile.class);
            intent.putExtra("tag","Pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogbuilder;
        alertdialogbuilder =new AlertDialog.Builder(MainActivity.this);
        alertdialogbuilder.setTitle("This is title");
        alertdialogbuilder.setMessage("Do you want to exit.");
        alertdialogbuilder.setCancelable(false);
        alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertdialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Click to Cancel button.",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=alertdialogbuilder.create();
        alertDialog.show();
    }
}
