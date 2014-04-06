package org.yohei.viewbeansample.app;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.yohei.viewbeansample.app.model.ItunesRoot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by maedayouhei on 4/6/14.
 */
@EActivity(R.layout.activity_foxy_list)
public class FoxyListActivity extends ActionBarActivity {
    public static final String TAG = FoxyListActivity.class.getSimpleName();

    public static final String REQUEST_URL = "https://itunes.apple.com/search?term=foxy+shazam&country=us";


    @ViewById(android.R.id.list)
    ListView mListView;

    @Bean
    FoxyAdapater mFoxyAdapater;

    @AfterViews
    void init() {
        request();
        mListView.setAdapter(mFoxyAdapater);
    }


    @Background
    void request() {
        try {
            final URL url = new URL(REQUEST_URL);
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.connect();
            final BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            final String json = sb.toString();
            final ItunesRoot itunesRoot = new Gson().fromJson(json, ItunesRoot.class);
            setData(itunesRoot);
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }

    @UiThread
    void setData(ItunesRoot data) {
        Log.d(TAG, "setData:" + data);
        mFoxyAdapater.add(data.getResults());
    }
}
