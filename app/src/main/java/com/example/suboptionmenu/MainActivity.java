package com.example.suboptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.sub_sms2:
                Toast.makeText(MainActivity.this, "Sub_Sms2", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Sub_Sms2.class);
                startActivity(intent);
                break;

            case R.id.sub_sms3:
                Toast.makeText(MainActivity.this, "Sub_Sms3", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(MainActivity.this,Sub_Sms3.class);
                startActivity(intent1);
                break;

            case R.id.sub_call1:
                Toast.makeText(MainActivity.this, "Sub_Call", Toast.LENGTH_SHORT).show();
                Intent intent4=new Intent(MainActivity.this,Sub_Call1.class);
                startActivity(intent4);
                break;
            case R.id.email:
                Toast.makeText(MainActivity.this, "Email", Toast.LENGTH_SHORT).show();
                Intent intent5=new Intent(MainActivity.this,EmailActivity.class);
                startActivity(intent5);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}