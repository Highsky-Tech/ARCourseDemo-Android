package com.highsky.ardemot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.highsky.artlibrary.ARLaunchActivity;
//import com.highsky.artlibrary.ARMainActivity;
//import com.highsky.artlibrary.TestActivity;

public class MainActivity extends AppCompatActivity {

    private TextView main_demotv;

    protected Activity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        main_demotv = findViewById(R.id.main_tv);

        main_demotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("main---", "start -demo");
                Intent intent = new Intent(mContext, ARLaunchActivity.class);
                intent.putExtra("companyID", "companyID");
                intent.putExtra("companyScreat", "companyScreat");
                intent.putExtra("userID", "userID");
                startActivity(intent);
            }
        });

    }
}
