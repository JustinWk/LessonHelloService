package com.example.haslina.helloservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ServiceMainActivity extends AppCompatActivity {

    Button btStart, btStop,btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);
        btStart = (Button) findViewById(R.id.buttonStartService);
        btStop = (Button) findViewById(R.id.buttonStopService);
        btNext = (Button) findViewById(R.id.buttonGotoNext);
    }

    public void startService(View v){
        startService(new Intent(this, MyService.class));
    }

    public void stopService(View v){
        stopService(new Intent(this, MyService.class));
    }

    public void gotoNext(View v){
        Intent i = new Intent(ServiceMainActivity.this, NextActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_service_main, menu);
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
