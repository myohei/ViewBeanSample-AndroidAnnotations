package org.yohei.viewbeansample.app;

import android.support.v7.app.ActionBarActivity;
import android.view.View;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.yohei.viewbeansample.app.bean.SampleBean;
import org.yohei.viewbeansample.app.bean.SampleBean_;
import org.yohei.viewbeansample.app.bean.SampleSingltonBean;
import org.yohei.viewbeansample.app.bean.SampleSingltonBean_;


@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @Bean
    SampleBean mSampleBean;

    @Bean
    SampleSingltonBean mSampleSingltonBean;

    @AfterInject
    void init() {
        mSampleBean.countUp();
        mSampleSingltonBean.countUp();
    }

    @Click(R.id.countup)
    void countUpClicked(View v) {
        mSampleBean.countUp();
        mSampleSingltonBean.countUp();
    }

    @Click(R.id.reset)
    void resetClicked(View v) {
        mSampleBean = SampleBean_.getInstance_(this);
        mSampleSingltonBean = SampleSingltonBean_.getInstance_(this);
    }

    @Click(R.id.to_list)
    void toListClicked(View v) {
        FoxyListActivity_.intent(this).start();
    }
}
