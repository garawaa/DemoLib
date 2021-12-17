package com.example.demolib;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.lib.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyClass.dosomething();
    }
}