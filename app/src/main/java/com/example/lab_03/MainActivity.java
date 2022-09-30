package com.example.lab_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Book.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Context context;
        Resources resources;
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.textview1);
        TextView tv4 = (TextView) findViewById(R.id.textview2);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.button2);

        super.onOptionsItemSelected(item);
        if (tv1 != null){
            switch (item.getItemId()) {
                case R.id.lgEnglish:
                {   Toast.makeText(this, "English", Toast.LENGTH_SHORT).show();
                    context = LocaleHelper.setLocale(MainActivity.this, "en");
                    resources = context.getResources();
                    tv1.setText(resources.getString(R.string.Welcome));
                    tv2.setText(resources.getString(R.string.pool));
                    btn1.setText(resources.getString(R.string.reserve));
                }
                break;
                case R.id.lgFrench:{
                    Toast.makeText(this, "French", Toast.LENGTH_SHORT).show();
                    context = LocaleHelper.setLocale(MainActivity.this, "fr");
                    resources = context.getResources();
                    tv1.setText(resources.getString(R.string.Welcome));
                    tv2.setText(resources.getString(R.string.pool));
                    btn1.setText(resources.getString(R.string.reserve));
                }

                break;
                case R.id.lgGerman:{
                    Toast.makeText(this, "German", Toast.LENGTH_SHORT).show();
                    context = LocaleHelper.setLocale(MainActivity.this, "de");
                    resources = context.getResources();
                    tv1.setText(resources.getString(R.string.Welcome));
                    tv2.setText(resources.getString(R.string.pool));
                    btn1.setText(resources.getString(R.string.reserve));
                }

                break;

            }

        }
        else{switch (item.getItemId()) {
            case R.id.lgEnglish:
            {
                context = LocaleHelper.setLocale(MainActivity.this, "en");
                resources = context.getResources();
                tv3.setText(resources.getString(R.string.Welcome));
                tv4.setText(resources.getString(R.string.pool));
                btn2.setText(resources.getString(R.string.reserve));
            }
            break;
            case R.id.lgFrench:{
                context = LocaleHelper.setLocale(MainActivity.this, "fr");
                resources = context.getResources();
                tv3.setText(resources.getString(R.string.Welcome));
                tv4.setText(resources.getString(R.string.pool));
                btn2.setText(resources.getString(R.string.reserve));
            }

            break;
            case R.id.lgGerman:{
                context = LocaleHelper.setLocale(MainActivity.this, "de");
                resources = context.getResources();
                tv3.setText(resources.getString(R.string.Welcome));
                tv4.setText(resources.getString(R.string.pool));
                btn2.setText(resources.getString(R.string.reserve));
            }

            break;

        }

        }
            return true;
}}