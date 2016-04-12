package ligandfas.rasptest;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends Activity{
    private EditText ip;
    private EditText message;
    private String mes ;
    private String ipi;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip = (EditText) findViewById(R.id.text1);
        message = (EditText) findViewById(R.id.text2);



    }
    public void controlRasp(View view){

        mes = message.getText().toString();
        ipi = ip.getText().toString();

        Network net = new Network(ipi,mes);

        net.execute();
    }

}


