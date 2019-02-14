package com.example.a2048;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Up;
    Button Down;
    Button Left;
    Button Right;

    Button A0 = (Button)findViewById(R.id.A1);
    Button A1 = (Button)findViewById(R.id.A2);
    Button A2 = (Button)findViewById(R.id.A3);
    Button A3 = (Button)findViewById(R.id.A4);
    Button B0 = (Button)findViewById(R.id.B1);
    Button B1 = (Button)findViewById(R.id.B2);
    Button B2 = (Button)findViewById(R.id.B3);
    Button B3 = (Button)findViewById(R.id.B4);
    Button C0 = (Button)findViewById(R.id.C1);
    Button C1 = (Button)findViewById(R.id.C2);
    Button C2 = (Button)findViewById(R.id.C3);
    Button C3 = (Button)findViewById(R.id.C4);
    Button D0 = (Button)findViewById(R.id.D1);
    Button D1 = (Button)findViewById(R.id.D2);
    Button D2 = (Button)findViewById(R.id.D3);
    Button D3 = (Button)findViewById(R.id.D4);

    Button[] allButtons = new Button[16];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Up = (Button)findViewById(R.id.Up);
        Down = (Button)findViewById(R.id.Down);
        Left = (Button)findViewById(R.id.Left);
        Right = (Button)findViewById(R.id.Right);

        Up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        Down.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        Left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        Right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
