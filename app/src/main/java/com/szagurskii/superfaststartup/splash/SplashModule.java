package com.szagurskii.superfaststartup.splash;

import android.support.annotation.NonNull;

import java.util.Random;
import java.util.concurrent.Callable;

import dagger.Module;
import dagger.Provides;
import rx.Observable;

@Module
public class SplashModule {
  @Provides @NonNull @SplashScope public Observable<SplashLibrary> splashLibrary(final Random random) {
    return Observable.fromCallable(new Callable<SplashLibrary>() {
      @Override public SplashLibrary call() throws Exception {
        return new SplashLibrary(random);
      }
    });
  }
}
