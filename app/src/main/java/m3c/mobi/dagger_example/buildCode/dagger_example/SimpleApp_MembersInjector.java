// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SimpleApp_MembersInjector.java

package m3c.mobi.dagger_example;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

// Referenced classes of package m3c.mobi.dagger_example:
//            SimpleApp

public final class SimpleApp_MembersInjector
    implements MembersInjector
{

    public SimpleApp_MembersInjector(Provider activityInjectorProvider, Provider broadcastReceiverInjectorProvider, Provider fragmentInjectorProvider, Provider serviceInjectorProvider, Provider contentProviderInjectorProvider)
    {
        this.activityInjectorProvider = activityInjectorProvider;
        this.broadcastReceiverInjectorProvider = broadcastReceiverInjectorProvider;
        this.fragmentInjectorProvider = fragmentInjectorProvider;
        this.serviceInjectorProvider = serviceInjectorProvider;
        this.contentProviderInjectorProvider = contentProviderInjectorProvider;
    }

    public static MembersInjector create(Provider activityInjectorProvider, Provider broadcastReceiverInjectorProvider, Provider fragmentInjectorProvider, Provider serviceInjectorProvider, Provider contentProviderInjectorProvider)
    {
        return new SimpleApp_MembersInjector(activityInjectorProvider, broadcastReceiverInjectorProvider, fragmentInjectorProvider, serviceInjectorProvider, contentProviderInjectorProvider);
    }

    public void injectMembers(SimpleApp instance)
    {
        DaggerApplication_MembersInjector.injectActivityInjector(instance, (DispatchingAndroidInjector)activityInjectorProvider.get());
        DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(instance, (DispatchingAndroidInjector)broadcastReceiverInjectorProvider.get());
        DaggerApplication_MembersInjector.injectFragmentInjector(instance, (DispatchingAndroidInjector)fragmentInjectorProvider.get());
        DaggerApplication_MembersInjector.injectServiceInjector(instance, (DispatchingAndroidInjector)serviceInjectorProvider.get());
        DaggerApplication_MembersInjector.injectContentProviderInjector(instance, (DispatchingAndroidInjector)contentProviderInjectorProvider.get());
        DaggerApplication_MembersInjector.injectSetInjected(instance);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SimpleApp)obj);
    }

    private final Provider activityInjectorProvider;
    private final Provider broadcastReceiverInjectorProvider;
    private final Provider fragmentInjectorProvider;
    private final Provider serviceInjectorProvider;
    private final Provider contentProviderInjectorProvider;
}
