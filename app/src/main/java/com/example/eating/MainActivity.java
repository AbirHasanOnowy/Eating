package com.example.eating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        change();
    }

    private void change() {
        ImageView img=(ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.after_cookie);
        TextView txt=(TextView) findViewById(R.id.textView);
        txt.setText("I'm so full");
        Button bttn=(Button) findViewById(R.id.button);
        bttn.setText("Done");
    }

}