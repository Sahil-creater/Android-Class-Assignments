package com.example.cafirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb,cb2,cb3;
    RadioButton rb;
    RadioButton rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





}



    public void showToast(View view)
    {

        cb=(CheckBox)findViewById(R.id.checkBox);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        rb=(RadioButton)findViewById(R.id.radioButton);
        rb=(RadioButton)findViewById(R.id.radioButton2);

        String btnName = null;
            if(R.id.checkBox==view.getId()) {
                btnName = "first check box";
                Toast.makeText(getApplicationContext(), btnName, Toast.LENGTH_LONG).show();
            }
            else if(R.id.checkBox2==view.getId()) {
                btnName = "second check box clicked";
                Toast.makeText(getApplicationContext(), btnName, Toast.LENGTH_LONG).show();
            }
            else if(R.id.checkBox3==view.getId()){
                btnName="third checkbox clicked";
                Toast.makeText(getApplicationContext(), btnName, Toast.LENGTH_LONG).show();
            }
            else if(R.id.radioButton==view.getId()) {
                btnName = "first radio button clicked";
                Toast.makeText(getApplicationContext(), btnName, Toast.LENGTH_LONG).show();
            }
            else if(R.id.radioButton2==view.getId()){
                btnName="second radion clicked";
                Toast.makeText(getApplicationContext(), btnName, Toast.LENGTH_LONG).show();
            }
            else{

            }


// display the name of clicked Button by using a Toast
      //  Toast t=   Toast.makeText(, btnName, Toast.LENGTH_LONG);
       // t.setGravity(Gravity.TOP,50,50);
       // t.show();

    }
}