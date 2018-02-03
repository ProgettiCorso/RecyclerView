package fziviello.recyclerview.presenters;

import java.util.ArrayList;

import fziviello.recyclerview.interfaces.MainInterface;
import fziviello.recyclerview.interfaces.MainPresenter;
import fziviello.recyclerview.models.NewsModel;

/**
 * Created by fziviello on 03/02/18.
 */

public class MainPresenterImpl implements MainPresenter{

    MainInterface mainInterface;

    public MainPresenterImpl(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
    }

    @Override
    public ArrayList<NewsModel> loadNews() {

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

        mainInterface.toast("Dati Caricati!");

        return ArrayNews;

    }
}
