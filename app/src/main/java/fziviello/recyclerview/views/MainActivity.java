package fziviello.recyclerview.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import fziviello.recyclerview.interfaces.MainInterface;
import fziviello.recyclerview.interfaces.MainPresenter;
import fziviello.recyclerview.R;
import fziviello.recyclerview.adapters.RecyclerAdapter;
import fziviello.recyclerview.presenters.MainPresenterImpl;

public class MainActivity extends AppCompatActivity  implements MainInterface{

    RecyclerView recyclerView;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter= new MainPresenterImpl(this);

        recyclerView=findViewById(R.id.MyRecyledView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter(this,mainPresenter.loadNews()));

    }

}
