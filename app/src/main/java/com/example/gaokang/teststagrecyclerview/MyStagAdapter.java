package com.example.gaokang.teststagrecyclerview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * 项目名称：TestStagRecyclerView
 * 类描述：
 * 创建人：gaokang
 * 创建时间：2016/3/25 15:48
 * 修改人：gaokang
 * 修改时间：2016/3/25 15:48
 * 修改备注：
 */
public class MyStagAdapter extends RecyclerView.Adapter<MyStagAdapter.MyViewHolder> {
    private Activity context;
    private List<Integer> image_list;
    BitmapFactory.Options options;
    int use_width;
    int use_height = 0;

    public MyStagAdapter(Activity context, List<Integer> image_list) {
        this.context = context;
        this.image_list = image_list;
        options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        use_width = Utils.getWindowsWidth(context) / 2 - 20;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stag, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), image_list.get(position % image_list.size()), options);
        use_height = use_width * options.outHeight / options.outWidth;
        Log.e("onBindViewHolder", "position % image_list.size():" + position % image_list.size());
        Log.e("onBindViewHolder", "width:" + use_width);
        Log.e("onBindViewHolder", "height:" + use_height);
        holder.img_main.setLayoutParams(new ViewGroup.LayoutParams(use_width, use_height));
        holder.img_main.setImageResource(image_list.get(position % image_list.size()));
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_main;

        public MyViewHolder(View itemView) {
            super(itemView);
            img_main = (ImageView) itemView.findViewById(R.id.img_main);
        }
    }
}
