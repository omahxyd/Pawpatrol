package com.example.usuari.pawpatrol;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by USUARI on 07/02/2016.
 */
public class SwipeAdapter extends PagerAdapter {
    //String que contiene las imagenes que iremos recojiendo y que se alojan en drawables
    private int[] image_resources = {R.drawable.imagen_0, R.drawable.imagen_1, R.drawable.imagen_2,R.drawable.imagen_3,R.drawable.imagen_4};
    private Context cnx;
    private LayoutInflater layoutInflater;


    public SwipeAdapter(Context cnx) {
        this.cnx = cnx;
    }

    @Override
    public int getCount() {
        //Aquí se especifica el número máximo de swipes que pueden haber, en este caso tantos como posiciones tenga el string de imagenes
        return image_resources.length;



    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view== object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int  position){
        layoutInflater = (LayoutInflater)cnx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.page_fragment_layout,container,false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resources[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object ){
        container.removeView((RelativeLayout)object);

    }


}
