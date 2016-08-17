package com.dw.course;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.dw.course.adapter.BottomMenuAdapter;
import com.dw.course.model.GridItem;
import com.dw.course.view.MyViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomMenuAdapter bottomMenuAdapter;
    private GridView toolbarGrid;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbarGrid = (GridView)findViewById(R.id.gv_gridview);
        context=this;
        iniMenu();
    }
    private void iniMenu(){
        //viewGroup = (MyViewGroup) findViewById(R.id.layout_viewgroup);

        List<GridItem> list=new ArrayList<GridItem>();
        list.add(new GridItem(0, "发传单", R.drawable.afj, R.drawable.afi));
        list.add(new GridItem(1, "管理", R.drawable.afh, R.drawable.afg));
        list.add(new GridItem(2, "教程", R.drawable.afl, R.drawable.afk));
        list.add(new GridItem(3, "更多", R.drawable.afn, R.drawable.afm));
        toolbarGrid.setNumColumns(4);// 设置每行列数
        toolbarGrid.setGravity(Gravity.BOTTOM);// 位置居中
        toolbarGrid.setHorizontalSpacing(10);// 水平间隔
        toolbarGrid.setSelected(true);
        toolbarGrid.setSelection(0);
        bottomMenuAdapter=new BottomMenuAdapter(this,list);
        //viewGroup.setBottomMenuAdapter(bottomMenuAdapter);
        toolbarGrid.setAdapter(bottomMenuAdapter);// 设置菜单Adapter
        /** 监听底部菜单选项 **/
        toolbarGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View view, int p,
                                    long arg3) {

                //viewGroup.snapToScreen(p);
                bottomMenuAdapter.setSelect(p);
                bottomMenuAdapter.notifyDataSetChanged();
            }
        });
    }
}
