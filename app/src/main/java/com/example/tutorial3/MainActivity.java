package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static final String Message="com.example.tutorial3.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view)
    {
        EditText Edittxtuser=findViewById(R.id.edtUsername);
        EditText Edittxtpass=findViewById(R.id.edtPassword);
        String Username=Edittxtuser.getText().toString();
        String Password=Edittxtpass.getText().toString();
        String u="admin@gmail.com";
        String p="admin";
        String blank="";
        if(Username.equals(blank) ||  Password.equals(blank))
        {
            if(Username.equals(blank) && Password.equals(blank))
            {
                Toast.makeText(this, "Please Enter Username and Password...", Toast.LENGTH_SHORT).show();
                return;
            }
            if(Username.equals(blank))
            {
                Toast.makeText(this, "Please Enter Username...", Toast.LENGTH_SHORT).show();
            }
            if(Password.equals(blank))
            {
                Toast.makeText(this, "Please Enter Password...", Toast.LENGTH_SHORT).show();
            }
        }
        else if(Username.equals(u) && Password.equals(p))
        {
            Intent intent=new Intent(this,Welcome.class);

            String M="Welcome";
            intent.putExtra(Message, M);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Please Enter Valid Username and Password...", Toast.LENGTH_SHORT).show();
        }

    }
}