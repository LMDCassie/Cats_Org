package com.matburt.mobileorg.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.matburt.mobileorg.R;
import com.matburt.mobileorg.OrgNodeListActivity;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
    }

    /*
     * Called when the user taps the Send button
     */
    public void login(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(login_activity.this, OrgNodeListActivity.class);
                startActivity(intent);
            }
        });

    }
}