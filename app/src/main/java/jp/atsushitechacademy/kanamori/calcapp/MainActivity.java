package jp.atsushitechacademy.kanamori.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static jp.atsushitechacademy.kanamori.calcapp.R.id.editText1;
import static jp.atsushitechacademy.kanamori.calcapp.R.id.editText2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText, nEditText;
    int numpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(editText1);
        nEditText = (EditText) findViewById(editText2);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String text1 = mEditText.getText().toString();
        String text2 = nEditText.getText().toString();

        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);

        if (v.getId() == R.id.button1) {
            numpass = (num1 + num2);

        } else if (v.getId() == R.id.button2) {
            numpass = (num1 - num2);

        } else if (v.getId() == R.id.button3) {
            numpass = (num1 * num2);

        } else if (v.getId() == R.id.button4) {
            numpass = (num1 / num2);

        }


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE",numpass);
        startActivity(intent);

    }
}
