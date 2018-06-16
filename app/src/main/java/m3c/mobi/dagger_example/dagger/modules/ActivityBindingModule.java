package m3c.mobi.dagger_example.dagger.modules;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import m3c.mobi.dagger_example.MainActivity;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = { ActivityModule.class })
    abstract MainActivity contributeYourActivityInjector();

}
