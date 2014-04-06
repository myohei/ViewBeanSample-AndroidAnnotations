package org.yohei.viewbeansample.app.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;
import org.yohei.viewbeansample.app.R;
import org.yohei.viewbeansample.app.model.ItunesRoot.ItunesResult;

/**
 * Created by maedayouhei on 4/6/14.
 */
@EViewGroup(R.layout.view_item)
public class FoxyItemView extends RelativeLayout {

    @ViewById
    ImageView thumb;

    @ViewById
    TextView title, artist, price;

    public FoxyItemView(Context context) {
        super(context);
    }

    public FoxyItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FoxyItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setValue(ItunesResult value) {
        thumb.setImageBitmap(null);
        if (!TextUtils.isEmpty(value.getArtworkUrl60())) {
            ImageLoader.getInstance().displayImage(value.getArtworkUrl60(), thumb);
        }

        if (!TextUtils.isEmpty(value.getArtistName())) {
            artist.setText(value.getArtistName());
        }

        if (!TextUtils.isEmpty(value.getTrackName())) {
            title.setText(value.getTrackName());
        }

        if (!TextUtils.isEmpty(value.getTrackPrice())) {
            price.setText("$" + value.getTrackPrice());
        }

    }

}
