package com.example.gridview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GridAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] flowerNmae;
    int[] image;


    public GridAdapter(Activity context, String[] flowerNmae, int[] image){
        super(context,R.layout.grid_item,flowerNmae);
        this.context = context;
        this.flowerNmae = flowerNmae;
        this.image = image;
    }

    public int getCout(){
        return flowerNmae.length;

    }
    public long  getItemId(int postion){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(R.layout.grid_item,null,true);

        ImageView imageView = convertView.findViewById(R.id.grid_mage);
        TextView textView = convertView.findViewById(R.id.item_name);
        imageView.setImageResource(image[position]);
        textView.setText(flowerNmae[position]);
     return  convertView;
    }

}
