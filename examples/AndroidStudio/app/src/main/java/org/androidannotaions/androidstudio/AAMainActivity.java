package org.androidannotaions.androidstudio;

import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;

/**
 * Created by SungGeun on 2015-09-18.
 */
@EActivity(R.layout.main)
public class AAMainActivity extends Activity{

    @ViewById(R.id.textView)
    TextView textView;

    @StringRes(R.string.hello)
    String hello;

    @Click(R.id.button)
    public void buttonClick(){
        textView.setText(hello);
    }

}
