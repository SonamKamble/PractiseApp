package com.example.admin.thenewboston;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int counter;
    Button add,sub;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=0;
        add=(Button)findViewById(R.id.bAdd);
        sub=(Button)findViewById(R.id.bSub);
        display=(TextView)findViewById(R.id.tvDisplay);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("Your Total is "+counter);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                display.setText("Your Total is "+counter);
            }
        });
    }
}
