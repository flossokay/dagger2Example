// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainActivity_MembersInjector.java

package m3c.mobi.dagger_example;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;
import m3c.mobi.dagger_example.dagger.ActivityUtil;

// Referenced classes of package m3c.mobi.dagger_example:
//            MainActivity

public final class MainActivity_MembersInjector
    implements MembersInjector
{

    public MainActivity_MembersInjector(Provider supportFragmentInjectorProvider, Provider frameworkFragmentInjectorProvider, Provider modelProvider, Provider activityUtilProvider)
    {
        this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
        this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
        this.modelProvider = modelProvider;
        this.activityUtilProvider = activityUtilProvider;
    }

    public static MembersInjector create(Provider supportFragmentInjectorProvider, Provider frameworkFragmentInjectorProvider, Provider modelProvider, Provider activityUtilProvider)
    {
        return new MainActivity_MembersInjector(supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, modelProvider, activityUtilProvider);
    }

    public void injectMembers(MainActivity instance)
    {
        DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(instance, (DispatchingAndroidInjector)supportFragmentInjectorProvider.get());
        DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(instance, (DispatchingAndroidInjector)frameworkFragmentInjectorProvider.get());
        injectModel(instance, (String)modelProvider.get());
        injectActivityUtil(instance, (ActivityUtil)activityUtilProvider.get());
    }

    public static void injectModel(MainActivity instance, String model)
    {
        instance.model = model;
    }

    public static void injectActivityUtil(MainActivity instance, ActivityUtil activityUtil)
    {
        instance.activityUtil = activityUtil;
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((MainActivity)obj);
    }

    private final Provider supportFragmentInjectorProvider;
    private final Provider frameworkFragmentInjectorProvider;
    private final Provider modelProvider;
    private final Provider activityUtilProvider;
}
