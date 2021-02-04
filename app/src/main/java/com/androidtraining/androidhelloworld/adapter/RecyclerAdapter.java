package com.androidtraining.androidhelloworld.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.androidtraining.androidhelloworld.R;
import com.androidtraining.androidhelloworld.helpers.MyListData;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private MyListData[] listdata;

    /*Here we are receiving the data from HomeActivity */
    public RecyclerAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }

    /*This will get triggered for one time only , here we are specifying our layout for the row item
    * of the adapter
    * */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }


    /*This will get trigger for so many times to set the data to the row items based on items count*/
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MyListData myListData = listdata[position];
      /*  holder.imageView.setImageResource(listdata[position].getImgId());
        holder.textView.setText(listdata[position].getDescription());*/
        holder.textView.setText(listdata[position].getDescription());
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }

    /* This will create rows to be displayed based on item count*/
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }

    /* This will return the item count of the data set i.e., size of the data */
    @Override
    public int getItemCount() {
        return listdata.length;
    }

}





