package me.windleafy.kity.android.wiget.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;

public class LayoutUtil {

    @SuppressLint("StaticFieldLeak")
    private static RootViewLayout layout;

    /**
     * 将view显示在activity中的根视图中
     *
     * @param activity
     * @param view
     */
    public static void show(Activity activity, View view) {
        if (layout == null || layout.getActivity() != activity) {
            layout = new RootViewLayout(activity);
        }
        layout.show(view);
    }

    /**
     * 隐藏
     */
    public static void hide(View view) {
        layout.hide(view);
    }

    /**
     * 隐藏
     */
    public static void hideAll() {
        layout.hide();
    }

}
