package com.example.librarymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddBook extends AppCompatActivity {

    private Button submit;

    private EditText id;
    private EditText nameOfBook;
    private EditText nameOfAuthor;
    private EditText imageURL;
    private EditText pageNo;
    private EditText shortDesc;
    private EditText longDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        submit=findViewById(R.id.submit);
        ArrayList<Book> book=new ArrayList<>();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();

            }
        });
    }

    private Book addBook(){
        Book book=new Book(Integer.parseInt(id.getText().toString()),nameOfBook.getText().toString(),nameOfAuthor.getText().toString(),Integer.parseInt(pageNo.getText().toString()),imageURL.getText().toString(),shortDesc.getText().toString(),longDesc.getText().toString());
        return book;
    }
    private void init(){
        id=findViewById(R.id.book_id);
        nameOfBook=findViewById(R.id.book_name);
        nameOfAuthor=findViewById(R.id.author_name);
        imageURL=findViewById(R.id.img_url);
        pageNo=findViewById(R.id.no_pages);
        shortDesc=findViewById(R.id.short_desc);
        longDesc=findViewById(R.id.long_desc);
    }
}