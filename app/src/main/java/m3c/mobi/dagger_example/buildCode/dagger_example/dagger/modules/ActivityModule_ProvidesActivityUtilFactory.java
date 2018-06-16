// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityModule_ProvidesActivityUtilFactory.java

package m3c.mobi.dagger_example.dagger.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import m3c.mobi.dagger_example.MainActivity;
import m3c.mobi.dagger_example.dagger.ActivityUtil;

// Referenced classes of package m3c.mobi.dagger_example.dagger.modules:
//            ActivityModule

public final class ActivityModule_ProvidesActivityUtilFactory
    implements Factory
{

    public ActivityModule_ProvidesActivityUtilFactory(ActivityModule module, Provider activityProvider)
    {
        this.module = module;
        this.activityProvider = activityProvider;
    }

    public ActivityUtil get()
    {
        return provideInstance(module, activityProvider);
    }

    public static ActivityUtil provideInstance(ActivityModule module, Provider activityProvider)
    {
        return proxyProvidesActivityUtil(module, (MainActivity)activityProvider.get());
    }

    public static ActivityModule_ProvidesActivityUtilFactory create(ActivityModule module, Provider activityProvider)
    {
        return new ActivityModule_ProvidesActivityUtilFactory(module, activityProvider);
    }

    public static ActivityUtil proxyProvidesActivityUtil(ActivityModule instance, MainActivity activity)
    {
        return (ActivityUtil)Preconditions.checkNotNull(instance.providesActivityUtil(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public volatile Object get()
    {
        return get();
    }

    private final ActivityModule module;
    private final Provider activityProvider;
}
