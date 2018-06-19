// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainActivity.java

package m3c.mobi.dagger_example;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import dagger.android.support.DaggerAppCompatActivity;
import m3c.mobi.dagger_example.dagger.ActivityUtil;

// Referenced classes of package m3c.mobi.dagger_example:
//            R

public class MainActivity extends DaggerAppCompatActivity
{

    public MainActivity()
    {
    }

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(0x7f09001b);
        TextView greeting = (TextView)findViewById(0x7f07003d);
        String text = getResources().getString(0x7f0b0021, new Object[] {
            model
        });
        greeting.setText(text);
        Integer wharr[] = activityUtil.getRealMetrics();
        TextView screenMetrics = (TextView)findViewById(0x7f07004d);
        String text1 = getResources().getString(0x7f0b001e, new Object[] {
            wharr[0], wharr[1]
        });
        screenMetrics.setText(text1);
    }

    String model;
    ActivityUtil activityUtil;

}
