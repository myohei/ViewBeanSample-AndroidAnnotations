package org.yohei.viewbeansample.app.bean;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by maedayouhei on 4/6/14.
 */
@EBean
public class SampleBean {

    private static final String TAG = SampleBean.class.getSimpleName();

    @RootContext
    Context mContext;

    @RootContext
    Activity mActivity;

    private int count;

    @AfterInject
    void init() {
        count = 0;
    }

    public void countUp() {
        Log.d(TAG, "count: " + ++count);
    }


}
