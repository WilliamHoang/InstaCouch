package couchbaselesson.instacouch;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by william on 4/6/15.
 */
public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }


    }

    @Override
    public void onBindViewHolder (ViewHolder viewHolder , int i){

    }

    @Override
    public ViewHolder onCreateViewHolder (ViewGroup viewGroup , int i){
        return null;
    }

    @Override
    public int getItemCount(){
        return 0;
    }

    public FeedAdapter(){
        super();
    }

}
