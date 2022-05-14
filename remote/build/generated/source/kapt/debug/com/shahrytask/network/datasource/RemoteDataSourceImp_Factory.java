package com.shahrytask.network.datasource;

import com.shahrytask.network.ApiServices;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteDataSourceImp_Factory implements Factory<RemoteDataSourceImp> {
  private final Provider<ApiServices> apiServicesProvider;

  public RemoteDataSourceImp_Factory(Provider<ApiServices> apiServicesProvider) {
    this.apiServicesProvider = apiServicesProvider;
  }

  @Override
  public RemoteDataSourceImp get() {
    return newInstance(apiServicesProvider.get());
  }

  public static RemoteDataSourceImp_Factory create(Provider<ApiServices> apiServicesProvider) {
    return new RemoteDataSourceImp_Factory(apiServicesProvider);
  }

  public static RemoteDataSourceImp newInstance(ApiServices apiServices) {
    return new RemoteDataSourceImp(apiServices);
  }
}
