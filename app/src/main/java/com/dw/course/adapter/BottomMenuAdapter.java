package com.dw.course.adapter;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dw.course.R;
import com.dw.course.model.GridItem;


/**
 * 底部菜单
 * 
 * @author 
 * 
 */
public class BottomMenuAdapter extends BaseAdapter {
    private final Context mContext;
    private List<GridItem> list;
    private int viewHeight=0;
    private int select;
    
    public int getViewHeight(){
    	return viewHeight;
    }
    public BottomMenuAdapter(Context context,List<GridItem> list ) {
        this.mContext = context;
        this.list=list;
    }
    

    public void setSelect(int position){
    	select=position;
    }
	@Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }
    
    @Override
    public Object getItem(int arg0) {
        return null;
    }
    
    @Override
    public long getItemId(int arg0) {
        return arg0;
    }
    
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_dismenu, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mTvItemText = (TextView)convertView.findViewById(R.id.item_text);
            viewHolder.mTvItemImage = (ImageView)convertView.findViewById(R.id.item_image);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.mTvItemText.setText(list.get(position).getTitle());
        viewHolder.mTvItemImage.setImageResource(list.get(position).getIcon());
        viewHolder.mTvItemText.setTextColor(mContext.getResources().getColor(R.color.bottomColor));
        if(select==position){
        	 viewHolder.mTvItemImage.setImageResource(list.get(position).getSelectIcon());
        	 viewHolder.mTvItemText.setTextColor(mContext.getResources().getColor(R.color.bottomSelectColor));
        }
        
        return convertView;
    }
    
    private class ViewHolder {
    	private ImageView mTvItemImage;
        private TextView mTvItemText;
    }
}
