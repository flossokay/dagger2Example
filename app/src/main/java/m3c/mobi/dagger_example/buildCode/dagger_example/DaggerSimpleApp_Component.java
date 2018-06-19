// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DaggerSimpleApp_Component.java

package m3c.mobi.dagger_example;

import dagger.android.*;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.*;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import m3c.mobi.dagger_example.dagger.ActivityUtil;
import m3c.mobi.dagger_example.dagger.modules.ActivityBindingModule_ContributeYourActivityInjector;
import m3c.mobi.dagger_example.dagger.modules.ActivityModule;
import m3c.mobi.dagger_example.dagger.modules.ActivityModule_ProvidesActivityUtilFactory;
import m3c.mobi.dagger_example.dagger.modules.BuildModule_ProvideModelFactory;

// Referenced classes of package m3c.mobi.dagger_example:
//            MainActivity, SimpleApp, MainActivity_MembersInjector

public final class DaggerSimpleApp_Component
    implements SimpleApp.Component
{
    private final class MainActivitySubcomponentImpl
        implements m3c.mobi.dagger_example.dagger.modules.ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent
    {

        private DispatchingAndroidInjector getDispatchingAndroidInjectorOfFragment()
        {
            return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(Collections.emptyMap());
        }

        private void initialize(MainActivitySubcomponentBuilder builder)
        {
            seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
            providesActivityUtilProvider = SingleCheck.provider(ActivityModule_ProvidesActivityUtilFactory.create(activityModule, seedInstanceProvider));
        }

        public void inject(MainActivity arg0)
        {
            injectMainActivity(arg0);
        }

        private MainActivity injectMainActivity(MainActivity instance)
        {
            MainActivity_MembersInjector.injectModel(instance, BuildModule_ProvideModelFactory.proxyProvideModel());
            MainActivity_MembersInjector.injectActivityUtil(instance, (ActivityUtil)providesActivityUtilProvider.get());
            return instance;
        }

        public volatile void inject(Object obj)
        {
            inject((MainActivity)obj);
        }

        private Provider seedInstanceProvider;
        private Provider providesActivityUtilProvider;
        final DaggerSimpleApp_Component this$0;

        private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder)
        {
            this$0 = DaggerSimpleApp_Component.this;
            super();
            initialize(builder);
        }

    }

    private final class MainActivitySubcomponentBuilder extends
            m3c.mobi.dagger_example.dagger.modules.ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent.Builder
    {

        public m3c.mobi.dagger_example.dagger.modules.ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent build()
        {
            if(seedInstance == null)
                throw new IllegalStateException((new StringBuilder()).append(MainActivity.getCanonicalName()).append(" must be set").toString());
            else
                return new MainActivitySubcomponentImpl(this);
        }

        public void seedInstance(MainActivity arg0)
        {
            seedInstance = (MainActivity)Preconditions.checkNotNull(arg0);
        }

        public volatile AndroidInjector build()
        {
            return build();
        }

        public volatile void seedInstance(Object obj)
        {
            seedInstance((MainActivity)obj);
        }

        private MainActivity seedInstance;
        final DaggerSimpleApp_Component this$0;


        private MainActivitySubcomponentBuilder()
        {
            this$0 = DaggerSimpleApp_Component.this;
            super();
        }

    }

    private static final class Builder extends SimpleApp.Component.Builder
    {

        public SimpleApp.Component build()
        {
            if(activityModule == null)
                activityModule = new ActivityModule();
            if(seedInstance == null)
                throw new IllegalStateException((new StringBuilder()).append(SimpleApp.getCanonicalName()).append(" must be set").toString());
            else
                return new DaggerSimpleApp_Component(this);
        }

        public void seedInstance(SimpleApp arg0)
        {
            seedInstance = (SimpleApp)Preconditions.checkNotNull(arg0);
        }

        public volatile AndroidInjector build()
        {
            return build();
        }

        public volatile void seedInstance(Object obj)
        {
            seedInstance((SimpleApp)obj);
        }

        private ActivityModule activityModule;
        private SimpleApp seedInstance;


        private Builder()
        {
        }

    }


    private DaggerSimpleApp_Component(Builder builder)
    {
        initialize(builder);
    }

    public static SimpleApp.Component.Builder builder()
    {
        return new Builder();
    }

    private Map getMapOfClassOfAndProviderOfFactoryOf()
    {
        return Collections.singletonMap(MainActivity, mainActivitySubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector getDispatchingAndroidInjectorOfActivity()
    {
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(getMapOfClassOfAndProviderOfFactoryOf());
    }


    private void initialize(Builder builder)
    {
        mainActivitySubcomponentBuilderProvider = new Provider() {

            public m3c.mobi.dagger_example.dagger.modules.ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent.Builder get()
            {
                return new MainActivitySubcomponentBuilder();
            }

            public volatile Object get()
            {
                return get();
            }

            final DaggerSimpleApp_Component this$0;

            
            {
                this.this$0 = DaggerSimpleApp_Component.this;
                super();
            }
        }
;
        activityModule = builder.activityModule;
    }

    public void inject(SimpleApp arg0)
    {
        injectSimpleApp(arg0);
    }

    private SimpleApp injectSimpleApp(SimpleApp instance)
    {
        DaggerApplication_MembersInjector.injectActivityInjector(instance, getDispatchingAndroidInjectorOfActivity());
        DaggerApplication_MembersInjector.injectSetInjected(instance);
        return instance;
    }

    public volatile void inject(Object obj)
    {
        inject((SimpleApp)obj);
    }


    private ActivityModule activityModule;
    private Provider mainActivitySubcomponentBuilderProvider;


}
