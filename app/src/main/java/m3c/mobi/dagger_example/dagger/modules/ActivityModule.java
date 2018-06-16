package m3c.mobi.dagger_example.dagger.modules;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import m3c.mobi.dagger_example.dagger.ActivityUtil;
import m3c.mobi.dagger_example.MainActivity;
import m3c.mobi.dagger_example.dagger.scopes.ActivityScope;

@Module
public final class ActivityModule {

    @Provides
    @Reusable
    @ActivityScope
    public ActivityUtil providesActivityUtil(MainActivity activity) {
        return new ActivityUtil(activity);
    }



}