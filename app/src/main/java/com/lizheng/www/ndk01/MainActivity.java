package com.lizheng.www.ndk01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button button;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = (TextView) findViewById(R.id.tv);
        button = (Button) findViewById(R.id.button);
        input = (EditText) findViewById(R.id.input);



//       final String str = input.getText().toString(); 这样是不可以的

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString();  //这行代码一定要放在这
                tv.setText(new MyNdk().getString(str));
            }
        });

    }
}
