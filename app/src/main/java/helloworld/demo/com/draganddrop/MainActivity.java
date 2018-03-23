package helloworld.demo.com.draganddrop;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ViewGroup rootLayout;
    private int xDelta;
    private int yDelta;
    //  Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rootLayout = (ViewGroup) findViewById(R.id.viewroot);
        imageView1 = (ImageView) findViewById(R.id.imgid1);
        imageView2 = (ImageView) findViewById(R.id.imgid2);
        imageView3 = (ImageView) findViewById(R.id.imgid3);

        RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(150, 150);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(150, 150);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(150 , 150);
       //IMAGE1
        imageView1.setLayoutParams(layoutParams1);
        //  imageView1.setOnTouchListener(new ChoiceTouchListener());
        imageView1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int X = (int) event.getRawX();
                final int Y = (int) event.getRawY();
                switch (event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams Params1 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        xDelta = X - Params1.leftMargin;
                        yDelta = Y - Params1.topMargin;

                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    case MotionEvent.ACTION_POINTER_UP:
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:

                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        layoutParams.leftMargin = X - xDelta;
                        layoutParams.topMargin = Y - yDelta;
                        layoutParams.rightMargin = -250;
                        layoutParams.bottomMargin = -250;
                        imageView1.setLayoutParams(layoutParams);
                        // return false;
                        break;
                }
                rootLayout.invalidate();
                return true;

            }

        });

        //IMAGE2
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int X = (int) event.getRawX();
                final int Y = (int) event.getRawY();
                switch (event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams Params1 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        xDelta = X - Params1.leftMargin;
                        yDelta = Y - Params1.topMargin;

                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    case MotionEvent.ACTION_POINTER_UP:
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:

                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        layoutParams.leftMargin = X - xDelta;
                        layoutParams.topMargin = Y - yDelta;
                        layoutParams.rightMargin = -250;
                        layoutParams.bottomMargin = -250;
                        imageView2.setLayoutParams(layoutParams);
                        // return false;
                        break;
                }
                rootLayout.invalidate();
                return true;

            }

        });

        //IMAGE3
        imageView3.setLayoutParams(layoutParams3);
        imageView3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int X = (int) event.getRawX();
                final int Y = (int) event.getRawY();
                switch (event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams Params1 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        xDelta = X - Params1.leftMargin;
                        yDelta = Y - Params1.topMargin;

                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    case MotionEvent.ACTION_POINTER_UP:
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:

                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        layoutParams.leftMargin = X - xDelta;
                        layoutParams.topMargin = Y - yDelta;
                        layoutParams.rightMargin = -250;
                        layoutParams.bottomMargin = -250;
                        imageView3.setLayoutParams(layoutParams);
                        // return false;
                        break;
                }
                rootLayout.invalidate();
                return true;

            }

        });
    }}
        //   imageView2.setLayoutParams(layoutParams2);
        //   imageView2.setOnTouchListener(new ChoiceTouchListener());
        //    imageView3.setLayoutParams(layoutParams);
        //    imageView3.setOnTouchListener(new ChoiceTouchListener());

        //   ChoiceTouchListener obj1 = new ChoiceTouchListener();
        //   ChoiceTouchListener obj2 = new ChoiceTouchListener();
        //   ChoiceTouchListener obj3 = new ChoiceTouchListener();
        //    imageView1.setOnTouchListener(obj1);
        //    imageView2.setOnTouchListener(obj2);
        //    imageView3.setOnTouchListener(obj3);
        //  imageView2.setLayoutParams(layoutParams);


        //  imageView2.setOnTouchListener(obj1);
        //   imageView3.setLayoutParams(layoutParams);

        //  imageView3.setOnTouchListener(obj1);




 /*   private final class ChoiceTouchListener implements View.OnTouchListener
    {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            final int X = (int) event.getRawX();
            final int Y = (int) event.getRawY();
            switch(event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams Params1 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                    xDelta = X - Params1.leftMargin;
                    yDelta = Y - Params1.topMargin;

                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_MOVE:

                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
                    layoutParams.leftMargin = X - xDelta;
                    layoutParams.topMargin = Y - yDelta;
                    layoutParams.rightMargin = -250;
                    layoutParams.bottomMargin = -250;
                    imageView1.setLayoutParams(layoutParams);
              //      imageView2.setLayoutParams(layoutParams);
               //     imageView3.setLayoutParams(layoutParams);

              /*      RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                    layoutParams2.leftMargin = X - xDelta;
                    layoutParams2.topMargin = Y - yDelta;
                    layoutParams2.rightMargin = -250;
                    layoutParams2.bottomMargin = -250;
                   imageView2.setLayoutParams(layoutParams2);*/

                   /* RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                    layoutParams3.leftMargin = X - xDelta;
                    layoutParams3.topMargin = Y - yDelta;
                    layoutParams3.rightMargin = -250;
                    layoutParams3.bottomMargin = -250;
                    imageView3.setLayoutParams(layoutParams3);*/
           //        break;
        //    }
        //    rootLayout.invalidate();
       //     return true;

        //    }



   //     }
 //   }

