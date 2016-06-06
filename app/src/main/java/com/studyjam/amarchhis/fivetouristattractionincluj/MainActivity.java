package com.studyjam.amarchhis.fivetouristattractionincluj;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

     public void Deschide (View view)
    {
      String button_text;
        button_text=((Button) view).getText().toString();

        if (button_text.equals("The Botanic Garden")) {
         Intent intent = new Intent(this , SecondActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("The Central Park"))
        {
            Intent intent = new Intent(this , ThirdActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("The National Theater"))
        {
            Intent intent = new Intent(this , FourthACtivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("The Salty Mine")) {
            Intent intent = new Intent(this , FifthACtivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("The Etnografic Museum"))
        {
            Intent intent = new Intent(this , SixthActivity.class);
            startActivity(intent);
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
