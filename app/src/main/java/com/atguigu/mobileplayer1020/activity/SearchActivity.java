package com.atguigu.mobileplayer1020.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mobileplayer1020.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViews();

    }

    private EditText edSearch;
    private ImageView ivVoice;
    private TextView tvSearch;
    private ListView listview;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-01-14 22:05:17 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        setContentView(R.layout.activity_search);
        edSearch = (EditText)findViewById( R.id.ed_search );
        ivVoice = (ImageView)findViewById( R.id.iv_voice );
        tvSearch = (TextView)findViewById( R.id.tv_search );
        listview = (ListView)findViewById( R.id.listview );

        ivVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SearchActivity.this, "语音输入", Toast.LENGTH_SHORT).show();
            }
        });
        tvSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SearchActivity.this, "搜索", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
