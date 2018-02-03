package fziviello.recyclerview.interfaces;

import java.util.ArrayList;
import fziviello.recyclerview.models.NewsModel;

/**
 * Created by fziviello on 03/02/18.
 */

public interface MainPresenter {

    ArrayList<NewsModel> loadNews();
}
