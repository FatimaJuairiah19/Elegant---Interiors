package com.example.elegant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesignerProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designer_profile);
    }

    public void goToContact2(View view) {
        Intent intent = new Intent(DesignerProfile.this, DesignerPageActivity.class);
        startActivity(intent);
    }

    public void logOut2(View view) {
        //Intent intent = new Intent(UserProfile.this,MainActivity.class);
        //startActivity(intent);

        Intent intent = new Intent(this, SignInSelection.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();


    }

}
