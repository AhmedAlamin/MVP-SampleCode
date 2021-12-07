package com.example.mvp_samplecode.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp_samplecode.R;

public class MainActivity extends AppCompatActivity implements MovieView{

    MoviePresenter presenter;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MoviePresenter(MainActivity.this);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getAllData();
            }
        });
    }

    @Override
    public void getData(String name, String description) {
        textView.setText(name+" - "+description);
    }
}