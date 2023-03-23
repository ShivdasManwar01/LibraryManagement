package com.example.librarymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private TextView txtBookName, txtAuthor, txtPages, txtDescriptor;
    private Button btnAddToWantToRead, btnAddToAlreadyRead,btnAddToCurrentlyReading,btnAddToFavorite;
    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        initView();

        Book book=new Book(1,"1Q84","Haruki Murakami", 184,"https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91WMFe33+1L.jpg","A work of maddening brilliance","Long Description");
        setData(book);
    }
    private void setData(Book book){
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtPages.setText(String.valueOf(book.getPages()));
        txtDescriptor.setText(book.getLongDesc());

        Glide.with(this).asBitmap().load(book.getImageUrl()).into(bookImage);
    }
    private void initView(){
        txtBookName=findViewById(R.id.book_book_name);
        txtAuthor=findViewById(R.id.book_activity_author);
        txtPages=findViewById(R.id.book_activity_pages);
        txtDescriptor=findViewById(R.id.book_activity_short_desc);
        btnAddToWantToRead=findViewById(R.id.book_activity_want_to_read_btn);
        btnAddToAlreadyRead=findViewById(R.id.book_activity_already_read_btn);
        btnAddToCurrentlyReading=findViewById(R.id.book_activity_curr_reading_btn);
        btnAddToFavorite=findViewById(R.id.book_activity_addToFavourite_btn);
        bookImage=findViewById(R.id.book_activity_bookimage);


    }
}