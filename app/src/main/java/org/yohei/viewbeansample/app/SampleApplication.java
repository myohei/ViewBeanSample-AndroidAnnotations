package org.yohei.viewbeansample.app;

import android.app.Application;

import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by maedayouhei on 4/7/14.
 */
public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // imageloader init
        final ImageLoaderConfiguration.Builder builder = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
                .discCacheSize(10 * 1024 * 1024);
        ImageLoader.getInstance().init(builder.build());
    }
}
