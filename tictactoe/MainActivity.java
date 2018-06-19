package com.ce17b019.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button);
        b1.setVisibility(View.GONE);

    }

    int player=1;
    int win=0;
    int winner;

    public void click(View view){
        ImageView iv = (ImageView) view;
        int tag = Integer.parseInt(view.getTag().toString());
        if(player==1 && tag==1 && win==0){
            iv.setImageResource(R.drawable.x2);
            view.setTag(2);
            player=2;
        }
        else if(player==2 && tag==1 && win==0){
            iv.setImageResource(R.drawable.o3);
            view.setTag(3);
            player=1;
        }



        ImageView imageView1=(ImageView)findViewById(R.id.imageView1);
        int im1 =Integer.parseInt(imageView1.getTag().toString()) ;

        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        int im2 =Integer.parseInt(imageView2.getTag().toString()) ;

        ImageView imageView3=(ImageView)findViewById(R.id.imageView3);
        int im3 =Integer.parseInt(imageView3.getTag().toString()) ;

        ImageView imageView4=(ImageView)findViewById(R.id.imageView4);
        int im4 =Integer.parseInt(imageView4.getTag().toString()) ;

        ImageView imageView5=(ImageView)findViewById(R.id.imageView5);
        int im5 =Integer.parseInt(imageView5.getTag().toString()) ;

        ImageView imageView6=(ImageView)findViewById(R.id.imageView6);
        int im6 =Integer.parseInt(imageView6.getTag().toString()) ;

        ImageView imageView7=(ImageView)findViewById(R.id.imageView7);
        int im7 =Integer.parseInt(imageView7.getTag().toString()) ;

        ImageView imageView8=(ImageView)findViewById(R.id.imageView8);
        int im8 =Integer.parseInt(imageView8.getTag().toString()) ;

        ImageView imageView9=(ImageView)findViewById(R.id.imageView9);
        int im9 =Integer.parseInt(imageView9.getTag().toString()) ;




        if(im1 == 2 && im2 == 2 && im3 == 2 || im1==3 && im2==3 && im3 ==3 ){
            win=1;
        }
        else if(im4 == 2 && im5 == 2 && im6 == 2 || im4==3 && im5==3 && im6 ==3){
            win=1;
        }
        else if(im7 == 2 && im8 == 2 && im9 == 2 || im7==3 && im8==3 && im9 ==3){
            win=1;
        }
        else if(im1 == 2 && im4 == 2 && im7 == 2 || im1==3 && im4==3 && im7 ==3){
            win=1;
        }
        else if(im2 == 2 && im5 == 2 && im8 == 2 || im2==3 && im5==3 && im8 ==3){
            win=1;
        }
        else if(im3 == 2 && im6 == 2 && im9 == 2 || im3==3 && im6==3 && im9 ==3){
            win=1;
        }
        else if(im1 == 2 && im5 == 2 && im9 == 2 || im1==3 && im5==3 && im9 ==3){
            win=1;
        }
        else if(im3 == 2 && im5 == 2 && im7 == 2 || im3==3 && im5==3 && im7 ==3){
            win=1;
        }
        else if(im1!=1 && im2!=1 &&im3!=1 &&im4!=1 &&im5!=1 &&im6!=1 &&im7!=1 &&im8!=1 &&im9!=1){
            win=2;
        }

        if(win==1){
            if(player==1){
              winner =2;
            }else if(player==2){
                winner =1;
            }

            Toast.makeText(getApplicationContext(), "PLAYER"+winner+" is the winner", Toast.LENGTH_LONG).show();


            Button b1 = (Button) findViewById(R.id.button);
            b1.setVisibility(View.VISIBLE);
        }
        else if(win==2){
            Toast.makeText(getApplicationContext(), " It's a draw", Toast.LENGTH_LONG).show();
            Button b1 = (Button) findViewById(R.id.button);
            b1.setVisibility(View.VISIBLE);
        }
    }


    public void playagain(View view){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }








}
