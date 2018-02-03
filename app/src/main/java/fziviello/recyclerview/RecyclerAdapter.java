package fziviello.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by fziviello on 02/02/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<NewsModel> listNews;
    Context ctx;

    public RecyclerAdapter(Context ctx, ArrayList<NewsModel> listNews) {
        this.ctx=ctx;
        this.listNews=listNews;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycled_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {

        try {
            Glide.with(ctx)
                .load(listNews.get(position).getIcon())
                .into(holder.icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        holder.titolo.setText(listNews.get(position).getTitolo());
        holder.desc.setText(listNews.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return listNews.size(); //size array
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView titolo;
        TextView desc;

        public ViewHolder(View itemView) {
            super(itemView);

            icon=itemView.findViewById(R.id.icon);
            titolo=itemView.findViewById(R.id.titolo);
            desc=itemView.findViewById(R.id.desc);
        }
    }
}
