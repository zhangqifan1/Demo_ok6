package com.as.demo_ok6;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2018/12/7.
 * ---------------------------
 */
public class SampleAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public SampleAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_item,item);
    }
}
