package com.example.librarymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView profile_logo;

    private Button all_button,current_book,already_read,wishlist,favorite_book,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        all_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllBooksActivity.class);
                startActivity(intent);
            }
        });
        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, WishlistActivity.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        profile_logo=findViewById(R.id.profile_logo);

        all_button=findViewById(R.id.allbooks);
        current_book=findViewById(R.id.currentBook);
        already_read=findViewById(R.id.alreadyread);
        wishlist=findViewById(R.id.wishlist);
        favorite_book=findViewById(R.id.favBook);
        about=findViewById(R.id.about);
    }
}