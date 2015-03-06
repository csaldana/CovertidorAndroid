package com.example.jonathan.conversion;

import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText pesos;
    private EditText dolares;
    private EditText cambio;

    private Button btnCovertir;
    private CheckBox chbpesos;
    private CheckBox cbdolares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cambio = (EditText) findViewById(R.id.editText3Cambio);
        this.pesos = (EditText) findViewById(R.id.editTextPesos);
        this.dolares = (EditText) findViewById(R.id.editText2Dolares);

        this.btnCovertir = (Button) findViewById(R.id.btnCovertir);
        this.chbpesos = (CheckBox) findViewById(R.id.chbpesos);
        this.cbdolares = (CheckBox)findViewById(R.id.cbdolares);
    }

    public void btnConvertirOnClick(View v){


        int pesos, dolares, cambio;
        pesos = Integer.parseInt(this.pesos.getText().toString());
        dolares = Integer.parseInt(this.dolares.getText().toString());

        cambio = dolares / pesos;
        this.cambio.setText(Integer.toString(cambio));
    }

    public  void chpesosOnClick(View v){



        Double pesos, dolares, cambio;
        pesos = Double.parseDouble(this.pesos.getText().toString());
        cambio = Double.parseDouble(this.cambio.getText().toString());


        dolares = pesos / cambio;
        this.dolares.setText(Double.toString(dolares));
    }
    public  void cbdolaresOnClick(View v){


        Double pesos, dolares;
        Double cambio;

        dolares = Double.parseDouble(this.dolares.getText().toString());
        cambio = Double.parseDouble(this.cambio.getText().toString());
        pesos = dolares * cambio;

        this.pesos.setText(Double.toString(pesos));
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
