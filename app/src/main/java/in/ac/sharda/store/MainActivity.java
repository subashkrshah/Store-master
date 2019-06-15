package in.ac.sharda.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import in.ac.sharda.Shop.Shop;
import in.ac.sharda.SignUpActivity.SignUpActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextUserName,editTextPassword;
    Button btnSubmit,btnSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUserName = (EditText)findViewById(R.id.editTextUserName);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        btnSignUp=(Button)findViewById(R.id.btnSignUp);



        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(i);

            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(editTextUserName.getText().toString()))
                {
                    editTextUserName.setError("Enter Name");
                }
                else if(TextUtils.isEmpty(editTextPassword.getText().toString()))
                {
                    editTextPassword.setError("Enter password");
                }
                else
                {
                    Intent i = new Intent(MainActivity.this, Shop.class);
                    startActivity(i);




                }
            }
        });
    }
}
