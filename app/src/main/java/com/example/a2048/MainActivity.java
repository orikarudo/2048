package com.example.a2048;
import java.util.Random;
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

    List<Button> allBtns;


    List<Button> leftRow0;
    List<Button> leftRow1;
    List<Button> leftRow2;
    List<Button> leftRow3;

    List<Button> rightRow0;
    List<Button> rightRow1;
    List<Button> rightRow2;
    List<Button> rightRow3;

    List<Button> upRow0;
    List<Button> upRow1;
    List<Button> upRow2;
    List<Button> upRow3;

    List<Button> downRow0;
    List<Button> downRow1;
    List<Button> downRow2;
    List<Button> downRow3;



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

        A0.setText("");
        A1.setText("");
        A2.setText("");
        A3.setText("");
        B0.setText("");
        B1.setText("");
        B2.setText("");
        B3.setText("");
        C0.setText("");
        C1.setText("");
        C2.setText("");
        C3.setText("");
        D0.setText("");
        D1.setText("");
        D2.setText("");
        D3.setText("");


        allBtns = new ArrayList<Button>();
        allBtns.add(A0);
        allBtns.add(A1);
        allBtns.add(A2);
        allBtns.add(A3);
        allBtns.add(B0);
        allBtns.add(B1);
        allBtns.add(B2);
        allBtns.add(B3);
        allBtns.add(C0);
        allBtns.add(C1);
        allBtns.add(C2);
        allBtns.add(C3);
        allBtns.add(D0);
        allBtns.add(D1);
        allBtns.add(D2);
        allBtns.add(D3);

        leftRow0 = new ArrayList<Button>();
        leftRow0.add(A0);
        leftRow0.add(A1);
        leftRow0.add(A2);
        leftRow0.add(A3);

        leftRow1 = new ArrayList<Button>();
        leftRow1.add(B0);
        leftRow1.add(B1);
        leftRow1.add(B2);
        leftRow1.add(B3);

        leftRow2 = new ArrayList<Button>();
        leftRow2.add(C0);
        leftRow2.add(C1);
        leftRow2.add(C2);
        leftRow2.add(C3);

        leftRow3 = new ArrayList<Button>();
        leftRow3.add(D0);
        leftRow3.add(D1);
        leftRow3.add(D2);
        leftRow3.add(D3);


        rightRow0 = new ArrayList<Button>();
        rightRow0.add(A3);
        rightRow0.add(A2);
        rightRow0.add(A1);
        rightRow0.add(A0);

        rightRow1 = new ArrayList<Button>();
        rightRow1.add(B3);
        rightRow1.add(B2);
        rightRow1.add(B1);
        rightRow1.add(B0);

        rightRow2 = new ArrayList<Button>();
        rightRow2.add(C3);
        rightRow2.add(C2);
        rightRow2.add(C1);
        rightRow2.add(C0);

        rightRow3 = new ArrayList<Button>();
        rightRow3.add(D3);
        rightRow3.add(D2);
        rightRow3.add(D1);
        rightRow3.add(D0);


        upRow0 = new ArrayList<Button>();
        upRow0.add(A0);
        upRow0.add(B0);
        upRow0.add(C0);
        upRow0.add(D0);

        upRow1 = new ArrayList<Button>();
        upRow1.add(A1);
        upRow1.add(B1);
        upRow1.add(C1);
        upRow1.add(D1);

        upRow2 = new ArrayList<Button>();
        upRow2.add(A2);
        upRow2.add(B2);
        upRow2.add(C2);
        upRow2.add(D2);

        upRow3 = new ArrayList<Button>();
        upRow3.add(A3);
        upRow3.add(B3);
        upRow3.add(C3);
        upRow3.add(D3);


        downRow0 = new ArrayList<Button>();
        downRow0.add(D0);
        downRow0.add(C0);
        downRow0.add(B0);
        downRow0.add(A0);

        downRow1 = new ArrayList<Button>();
        downRow1.add(D1);
        downRow1.add(C1);
        downRow1.add(B1);
        downRow1.add(A1);

        downRow2 = new ArrayList<Button>();
        downRow2.add(D2);
        downRow2.add(C2);
        downRow2.add(B2);
        downRow2.add(A2);

        downRow3 = new ArrayList<Button>();
        downRow3.add(D3);
        downRow3.add(C3);
        downRow3.add(B3);
        downRow3.add(A3);

        Up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                compressTiles(upRow0);
                compressTiles(upRow1);
                compressTiles(upRow2);
                compressTiles(upRow3);
                randTile();
            }
        });

        Down.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                compressTiles(downRow0);
                compressTiles(downRow1);
                compressTiles(downRow2);
                compressTiles(downRow3);
                randTile();
            }
        });

        Left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                compressTiles(leftRow0);
                compressTiles(leftRow1);
                compressTiles(leftRow2);
                compressTiles(leftRow3);
                randTile();
            }
        });

        Right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                compressTiles(rightRow0);
                compressTiles(rightRow1);
                compressTiles(rightRow2);
                compressTiles(rightRow3);
                randTile();

            }
        });

        randTile();
        randTile();
    }

    public void compressTiles(List<Button> list) {
        int[] values = new int[4];



        //taking values of buttons and putting it into "values" list
        for (int i = 0; i < 4; ++i)
        {
            Button b = list.get(i);
            CharSequence s = b.getText();
            if(s == "") {
                values[i] = 0;

            }
            else{
                values[i] = (int) Integer.parseInt((String) s);
            }
        }

        int u = 3;
        int emp =0;
        while(u<3){
            if(values[u]==0){
                int p = u;
                while(p<3){
                    values[p]=values[p+1];
                    if(p==2){
                        values[p+1]=0;
                    }
                    p++;
                }
                emp++;
                if(emp==4){
                    u=4;
                }
                continue;
            }
        }

        int x = 0;
        int emptyRow = 0;
        while(x < 3){
            if(values[x]==0){
                int p = x;
                while(p<3){
                    values[p]=values[p+1];
                    if(p==2){
                        values[p+1]=0;
                    }
                    p++;
                }
                emptyRow++;
                if(emptyRow==4){
                    x=4;
                }
                continue;
            }
            if(values[x]==values[x+1]){
                values[x]= (2*values[x]);
                values[x+1]=0;

            }
            x++;
        }

        //setting button values to new compressed values
        for (int q = 0; q < 4; ++q) {
            Button b = list.get(q);
            if(values[q]==0){
                b.setText("");
            }
            else{
                b.setText(String.format("%d", values[q]));
            }

        }
    }

    public void randTile(){
        int x = 0;
        while(x==0){
            Random r = new Random();
            int low = 0;
            int high = 16;
            int randNum = r.nextInt(high-low) + low;
            Button b = allBtns.get(randNum);
            if(b.getText()==""){
                b.setText("2");
                x=613;
            }
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
