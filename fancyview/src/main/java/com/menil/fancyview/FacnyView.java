package com.menil.fancyview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Menil V. on 18.1.2016 at com.menil.fancyview.
 */
public class FacnyView extends LinearLayout {
    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public FacnyView(Context context) {
        super(context);
        initialize(context);
    }

    public FacnyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }
    public FacnyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.fancy_view, this);
    }
}
