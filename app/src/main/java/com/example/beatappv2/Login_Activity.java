package com.example.beatappv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        final Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Get the succ!!",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        //Below button is for bypassing login
        Button btn = (Button)findViewById(R.id.bypass_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Activity.this, Welcome_Activity.class));
            }
        });

    }
}
