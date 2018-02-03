package fziviello.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<NewsModel> ArrayNews = new ArrayList();

        NewsModel newsModel= new NewsModel();

        newsModel.setTitolo("primo Titolo");
        newsModel.setDesc("prima Desc");
        newsModel.setIcon("http://via.placeholder.com/300.png");

        ArrayNews.add(newsModel);

        newsModel= new NewsModel();

        newsModel.setTitolo("secondo Titolo");
        newsModel.setDesc("secondo Desc");
        newsModel.setIcon("http://via.placeholder.com/200.png");

        ArrayNews.add(newsModel);

        recyclerView=findViewById(R.id.MyRecyledView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter(this,ArrayNews));


    }




}
