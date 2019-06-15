package in.ac.sharda.SignUpActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import in.ac.sharda.Shop.Shop;
import in.ac.sharda.store.R;

public class SignUpActivity extends AppCompatActivity {
    RadioGroup group;
    EditText txt3,txt5,txt7,txt9,txt11;
    Button btnSubmit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        txt3 = (EditText)findViewById(R.id.txt3);
        txt5 = (EditText)findViewById(R.id.txt5);
        txt7 = (EditText)findViewById(R.id.txt7);
        txt9 = (EditText)findViewById(R.id.txt9);
        txt11 = (EditText)findViewById(R.id.txt11);
        group = (RadioGroup)findViewById(R.id.group);

        btnSubmit2=(Button)findViewById(R.id.btnSubmit2);

        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(TextUtils.isEmpty(txt3.getText().toString())){
                   txt3.setError("Enter First Name");
               }else if(TextUtils.isEmpty(txt5.getText().toString())){
                   txt5.setError("Enter Last Name");
               }

            }
        });


    }
}
