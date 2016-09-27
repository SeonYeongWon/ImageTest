package kr.hs.emirim.dnj1981.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    MyImage mImg;
    static final int ORIGINAL=0;
    static final int ROTATE=1;
    static final int TRANSLATE=2;
    static final int SCALE=3;
    static final int SKEW=4;

    int choose=ORIGINAL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linear1=(LinearLayout)findViewById(R.id.linear1);
        mImg=new MyImage(getApplicationContext());
        linear1.addView(mImg);
    }
    public void transformImage(View v){
        switch (v.getId()){
            case R.id.but_rotate:
                choose=ROTATE;
                break;
            case R.id.but_scale:
                choose=SCALE;
                break;
            case R.id.but_skew:
                choose=SKEW;
                break;
            case R.id.but_translate:
                choose=TRANSLATE;
                break;
        }
        mImg.setChoose(choose);
        mImg.invalidate();
    }

  /*  class MyImage extends View {
        MyImage(Context context){
            super(context);

        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Bitmap picture= BitmapFactory.decodeResource(getResources(),R.drawable.images);
            float cx=getWidth()/2.0f;
            float cy=getWidth()/2.0f;

            float x=(getWidth()-picture.getWidth())/2.0f;
            float y=(getHeight()-picture.getHeight())/2.0f;

            //회전
            //canvas.rotate(180,cx,cy);
            //이동
            //canvas.translate(-150,200);
            //크기
            //canvas.scale(1.5f, 1.5f, cx, cy);
            //비틀기
            canvas.skew(0.4f, 0.4f);
                        canvas.drawBitmap(picture, x, y, null);

        }
    }*/


}
