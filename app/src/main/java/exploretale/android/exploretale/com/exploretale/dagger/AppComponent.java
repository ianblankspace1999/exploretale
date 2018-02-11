package exploretale.android.exploretale.com.exploretale.dagger;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ian.blanco on 12/26/2017.
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {

//    void inject(DisplayListCars activity);
//
//    void inject(BaseActivity activity);
//
//    void inject(DisplaySpecificUser activity);

}
