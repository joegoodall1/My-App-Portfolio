package com.getstrength.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MyAppPortfolio extends ActionBarActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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

    public void showToast(View view) {
        switch (view.getId()) {
            case R.id.button:
                message = "This button will launch my Spotify Streamer app!";
                break;
            case R.id.button2:
                message = "This button will launch my Scores app!";
                break;
            case R.id.button3:
                message = "This button will launch my Library app!";
                break;
            case R.id.button4:
                message = "This button will launch my Build It Bigger app!";
                break;
            case R.id.button5:
                message = "This button will launch my XYZ Reader!";
                break;
            case R.id.button6:
                message = "This button will launch my Capstone app!";
                break;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
