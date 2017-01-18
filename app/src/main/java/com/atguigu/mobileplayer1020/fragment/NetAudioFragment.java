package com.atguigu.mobileplayer1020.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.atguigu.mobileplayer1020.R;
import com.atguigu.mobileplayer1020.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 作者：尚硅谷-杨光福 on 2017/1/6 16:46
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：网络音频
 */
public class NetAudioFragment extends BaseFragment {
    @InjectView(R.id.listview)
    ListView listview;
    @InjectView(R.id.progressbar)
    ProgressBar progressbar;
    @InjectView(R.id.tv_nomedia)
    TextView tvNomedia;

    @Override
    public View initView() {
        Log.e("TAG", "网络音频ui初始化了。。");

        View view = View.inflate(mContext, R.layout.fragment_net_audio, null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "网络音频数据初始化了。。");
    }


    @Override
    public void onRefrshData() {
        super.onRefrshData();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @OnClick({R.id.listview, R.id.progressbar, R.id.tv_nomedia})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.listview:
                break;
            case R.id.progressbar:
                break;
            case R.id.tv_nomedia:
                break;
        }
    }
}
