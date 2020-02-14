package com.example.contryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class contryprofile extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contryprofile);

        textView=(TextView) findViewById(R.id.textviewid);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            String value=bundle.getString("tag");
            showdedatils(value);
        }
    }
    void showdedatils(String value){
        if (value.equals("Bangladesh")){
            textView.setText(R.string.bangladesh_text);
        }if (value.equals("India")){
            textView.setText(R.string.india_text);
        }if (value.equals("Pakistan")){
            textView.setText(R.string.pakistan_text);
        }
    }
}
