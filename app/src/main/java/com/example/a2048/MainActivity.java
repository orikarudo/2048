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
import java.util.*;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    Button Up;
    Button Down;
    Button Left;
    Button Right;

    List<Button> leftRow0;


    /*public void myCompress(){

    };*/

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

        A0.setText("2");
        A1.setText("4");
        A2.setText("8");
        A3.setText("16");

        List<Button> allBtns = new ArrayList<Button>();
        allBtns.add(0, A0);

        List<Integer> testing = new ArrayList<Integer>();
        testing.add(0, 44);

        leftRow0 = new ArrayList<Button>();
        leftRow0.add(0, A0);
        leftRow0.add(1, A1);
        leftRow0.add(2, A2);
        leftRow0.add(3, A3);

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
                compressTiles(leftRow0);

            }
        });


    }

    public void compressTiles(List<Button> list)
    {
        int[] values = new int[4];
        int num_non_zero = 0;
        for (int i = 0; i < 4; ++i)
        {
            Button b = list.get(i);
            CharSequence s = b.getText();
            values[i] = (int) Integer.parseInt((String) s);
            values[i] = values[i] + 10;
            b.setText(String.format("%d", values[i]));
        }
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
