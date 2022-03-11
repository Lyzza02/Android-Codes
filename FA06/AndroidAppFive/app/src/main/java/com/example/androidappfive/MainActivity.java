package com.example.androidappfive;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText etMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMsg = (EditText) findViewById(R.id.etMsg);
        View viewConext = findViewById(R.id.tvContext);
        registerForContextMenu(viewConext);
    }
    public void doNextActivity(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("msg", etMsg.getText().toString());
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    // TODO Auto-generated method stub
        Context context = getApplicationContext();
        CharSequence text="";
        int duration = Toast.LENGTH_SHORT;
        switch(item.getItemId()){
            case R.id.info:
                text="Information";
                break;
            case R.id.email:
                text="Email";
                break;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.add:
                return true;
            case R.id.edit:
                return true;
            case R.id.delete:
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}