package com.example.admin.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ADMIN on 13/04/2016.
 */
public class Camera extends Activity implements View.OnClickListener {
    ImageButton ib;
    Button b;
    ImageView iv;
    Intent i;
    final static int cameraData=0;
    Bitmap bmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        initialize();
        //InputStream is=getResources().openRawResource(R.mipmap.ic_launcher);
        //bmap= BitmapFactory.decodeStream(is);
    }

    private void initialize() {
        ib=(ImageButton)findViewById(R.id.ibTakePic);
        iv=(ImageView)findViewById(R.id.ivReturnedPic);
        b=(Button)findViewById(R.id.bSetWall);
        b.setOnClickListener(this);
        ib.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bSetWall:
                try {
                    //Just a Test
                    getApplicationContext().setWallpaper(bmap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.ibTakePic:
                i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,cameraData);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Bundle extras=data.getExtras();
            bmap=(Bitmap)extras.get("data");
            iv.setImageBitmap(bmap);
        }
    }
}
