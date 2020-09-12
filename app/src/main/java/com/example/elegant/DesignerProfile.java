package com.example.elegant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class DesignerProfile extends AppCompatActivity {

    FirebaseUser user;
    DatabaseReference reff;
    FirebaseAuth auth;
    FirebaseDatabase firebaseDatabase;
    ImageView mImageView;
    TextView uName;

    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designer_profile);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();

        uName = findViewById(R.id.pName);

        mImageView = (ImageView) findViewById(R.id.image);

        reff = FirebaseDatabase.getInstance().getReference("Users").child(user.getUid());

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String username = dataSnapshot.child("username").getValue().toString();
                uName.setText(username);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        mStorageRef = FirebaseStorage.getInstance().getReference().child("designer.jpg");

        try {
            final File localFile = File.createTempFile("designer", "jpg");
            mStorageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    mImageView.setImageBitmap(bitmap);
                    //Toast.makeText(DesignerProfile.this,"downloading image",Toast.LENGTH_SHORT).show();

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
                   // Toast.makeText(DesignerProfile.this,"Failed to download image",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
        }




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
