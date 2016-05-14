package com.natidze.irakli.googlemaps;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button view;
    TextView textView;

    public void click(View v){
        switch (v.getId()){
            case R.id.uninstallBtn:
                view = (Button) findViewById(R.id.uninstallBtn);
                Toast.makeText(this, view.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.openBtn:
                view = (Button) findViewById(R.id.openBtn);
                Toast.makeText(this, view.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.travelIcon:
                textView = (TextView) findViewById(R.id.travelIconText);
                Toast.makeText(this, textView.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.similarIcon:
                textView = (TextView) findViewById(R.id.similarIconText);
                Toast.makeText(this, textView.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu,menu);

        return true;
    }
}
