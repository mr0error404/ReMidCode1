package com.example.remidcode1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.button2);
        tv1=findViewById(R.id.textView5);
        tv2=findViewById(R.id.textView7);

        Bundle bnd = getIntent().getExtras();
        String usernamee=bnd.getString("username");
        String type=bnd.getString("account");
        tv1.setText(usernamee);
        tv2.setText(type);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);

                startActivity(intent);
            }
        });
    }
}