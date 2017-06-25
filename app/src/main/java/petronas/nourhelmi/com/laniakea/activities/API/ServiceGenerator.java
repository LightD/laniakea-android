package petronas.nourhelmi.com.laniakea.activities.API;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lightdream on 12/06/2017.
 */

public class ServiceGenerator {

    public static final String API_BASE_URL = "http://103.6.239.38/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
            .readTimeout(10, TimeUnit.MINUTES);

    private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz").create();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.newThread()))
//
                    .addConverterFactory(GsonConverterFactory.create(gson));

    public static <S> S createService(Class<S> serviceClass, Context context) {
        SharedPreferences pref = context.getSharedPreferences("laniakea", Context.MODE_PRIVATE);
        final String authToken = pref.getString("auth-token", "xpmVFAwftEfXpp4JXUiH");
        final String username = pref.getString("auth-username", "admin");

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                // Request customization: add request headers
                Request.Builder requestBuilder = original.newBuilder()
                        .header("X-User-Username", username)
                        .header("X-User-Token", authToken)
                        .method(original.method(), original.body());

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });



        OkHttpClient client = httpClient.build();
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);
    }

    public static Retrofit retrofit() {
        OkHttpClient client = httpClient.build();
        Retrofit retrofit = builder.client(client).build();
        return retrofit;
    }
}
