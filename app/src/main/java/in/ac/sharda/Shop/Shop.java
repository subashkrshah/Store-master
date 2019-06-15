package in.ac.sharda.Shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import in.ac.sharda.Apple.Apple;
import in.ac.sharda.Huawei.Huawei;
import in.ac.sharda.Nokia.Nokia;
import in.ac.sharda.Oppo.Oppo;
import in.ac.sharda.Samsung.Samsung;
import in.ac.sharda.Vivo.Vivo;
import in.ac.sharda.store.R;

public class Shop extends AppCompatActivity {
    TextView txtView;
    ImageView imgLogo;
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        txtView=(TextView)findViewById(R.id.txtView);
        imgLogo=(ImageView)findViewById(R.id.imgLogo);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Shop.this, Samsung.class);
                startActivity(a);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Shop.this, Nokia.class);
                startActivity(b);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Shop.this, Huawei.class);
                startActivity(c);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Shop.this, Vivo.class);
                startActivity(h);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Shop.this, Apple.class);
                startActivity(e);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Shop.this, Oppo.class);
                startActivity(o);
            }
        });
    }
}
