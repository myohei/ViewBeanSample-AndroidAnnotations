package org.yohei.viewbeansample.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.yohei.viewbeansample.app.model.ItunesRoot.ItunesResult;
import org.yohei.viewbeansample.app.widget.FoxyItemView;
import org.yohei.viewbeansample.app.widget.FoxyItemView_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maedayouhei on 4/7/14.
 */
@EBean
public class FoxyAdapater extends BaseAdapter {
    private List<ItunesResult> mItunesResults;

    @RootContext
    Context mContext;

    @AfterInject
    void init() {
        mItunesResults = new ArrayList<ItunesResult>();
    }

    @Override
    public int getCount() {
        return mItunesResults.size();
    }

    @Override
    public Object getItem(int position) {
        return mItunesResults.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FoxyItemView itemView = null;
        if (convertView == null) {
            itemView = FoxyItemView_.build(mContext);
            convertView = itemView;
        } else {
            itemView = (FoxyItemView) convertView;
        }

        itemView.setValue(mItunesResults.get(position));
        return convertView;
    }

    public void add(List<ItunesResult> list) {
        mItunesResults.addAll(list);
        notifyDataSetChanged();
    }
}
