package com.example.librarymanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecyclerViewAdapter adapter;
    private ExtendedFloatingActionButton addBookBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        booksRecView=findViewById(R.id.booksRecyclerView);
        adapter= new BookRecyclerViewAdapter(this);
        addBookBtn=findViewById(R.id.addBookBtb);
        addBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllBooksActivity.this,AddBook.class);
                startActivity(intent);
            }
        });

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book(1,"1Q84","Haruki Murakami", 184,"https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91WMFe33+1L.jpg","A work of maddening brilliance","Long Description"));
        books.add(new Book(2,"The myth of Sisyphus","Albert Camus",250,"https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1347654509i/91950.jpg","dfdhfehfiehfiehfllkj jfjlkd  lkflkdj oeifjif dfepwjf0","long"));
        adapter.setBooks(books);
    }
}