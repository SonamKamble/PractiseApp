package com.example.admin.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ADMIN on 14/04/2016.
 */
public class Data extends Activity implements View.OnClickListener {

    Button start, startFor;
    EditText sendET;
    TextView gotAnswer;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get);
        initialize();
    }

    private void initialize() {
        start=(Button)findViewById(R.id.bSA);
        startFor=(Button)findViewById(R.id.bSAFR);
        sendET=(EditText)findViewById(R.id.etSend);
        gotAnswer=(TextView)findViewById(R.id.tvGot);
        start.setOnClickListener(this);
        startFor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bSA:
                String bread=sendET.getText().toString();
                Bundle basket=new Bundle();
                basket.putString("Key",bread);
                Intent a=new Intent(Data.this,OpenedClass.class);
                a.putExtras(basket);
                startActivity(a);
                break;
            case R.id.bSAFR:
                Intent i=new Intent(Data.this,OpenedClass.class);
                startActivityForResult(i,0);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Bundle basket=data.getExtras();
            String s=basket.getString("Answer");
            gotAnswer.setText(s);
        }
    }
}
