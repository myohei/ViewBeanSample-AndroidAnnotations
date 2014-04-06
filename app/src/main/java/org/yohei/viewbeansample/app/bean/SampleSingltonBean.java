package org.yohei.viewbeansample.app.bean;

import android.content.Context;
import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;
import org.androidannotations.annotations.RootContext;

/**
 * Created by maedayouhei on 4/6/14.
 */
@EBean(scope = Scope.Singleton)
public class SampleSingltonBean {

    private static final String TAG = SampleSingltonBean.class.getSimpleName();

    @RootContext
    Context mContext;

    private int count;

    @AfterInject
    void init() {
        count = 0;
    }

    public void countUp() {
        Log.d(TAG, "count: " + ++count);
    }

}
