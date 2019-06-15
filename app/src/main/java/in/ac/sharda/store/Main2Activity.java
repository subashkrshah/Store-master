package in.ac.sharda.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import in.ac.sharda.store.MainActivity;
import in.ac.sharda.store.R;

public class Main2Activity extends AppCompatActivity {

    Button suba;
    ImageView baloon,and2,and3;
    Animation frombottom,fromtop,fromleft,fromright;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button suba = findViewById(R.id.suba);
        ImageView baloon = findViewById(R.id.baloon);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        suba.setAnimation(frombottom);
        fromtop =AnimationUtils.loadAnimation(this,R.anim.fromtop);
        baloon.setAnimation(fromtop);


      suba.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i = new Intent(Main2Activity.this,MainActivity.class);
              startActivity(i);
          }
      });





    }
}
