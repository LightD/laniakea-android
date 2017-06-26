package petronas.nourhelmi.com.laniakea.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import petronas.nourhelmi.com.laniakea.R;
import petronas.nourhelmi.com.laniakea.activities.API.Params.LoginParams;
import petronas.nourhelmi.com.laniakea.activities.API.Params.SignupParams;
import petronas.nourhelmi.com.laniakea.activities.API.ServerError;
import petronas.nourhelmi.com.laniakea.activities.API.ServiceGenerator;
import petronas.nourhelmi.com.laniakea.activities.API.Services.UserService;
import petronas.nourhelmi.com.laniakea.activities.Helpers.ErrorUtils;
import petronas.nourhelmi.com.laniakea.activities.Models.AccessToken;
import petronas.nourhelmi.com.laniakea.activities.Models.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SharedPreferences pref = getSharedPreferences("laniakea", MODE_PRIVATE);
//        Boolean isAuthenticated = pref.getBoolean("isAuthenticated", false);
//        if (isAuthenticated) {
//            // load main fragments and all
//        }
//        else {
//            Intent i = new Intent(MainActivity.this, LoginActivity.class);
//            startActivity(i);
//            finish();
//        }
        (findViewById(R.id.testBtnLogin)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestLogin();
            }
        });

        findViewById(R.id.testGetMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestMeInfo();
            }
        });
    }

    void requestLogin() {
        final UserService userService =
                ServiceGenerator.createService(UserService.class, MainActivity.this);
        LoginParams params = new LoginParams("nourandroid");
        userService.login(params)
                .enqueue(new Callback<AccessToken>() {
                    @Override
                    public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {
                        if (response.isSuccessful()) {
                            SharedPreferences pref = getSharedPreferences("laniakea", MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putBoolean("isAuthenticated", true);
                            editor.putString("auth-token", response.body().getToken());
                            editor.putString("auth-username", "nourandroid");
                            editor.apply();
                            Toast toast = Toast.makeText(getApplicationContext(), "Logged in user successfully", Toast.LENGTH_LONG);
                            toast.show();
                        }
                        else {
                            ServerError error = ErrorUtils.parseError(response);
                            if (error.error().toUpperCase().equals("NOT FOUND")) {
                                requestSignup();
                            }
                            else {
                                Toast toast = Toast.makeText(getApplicationContext(), "Error is: " + error.error(), Toast.LENGTH_LONG);
                                toast.show();
                            }

                        }

                    }

                    @Override
                    public void onFailure(Call<AccessToken> call, final Throwable t) {
                        String error = t.getLocalizedMessage();
                        if (error.toUpperCase().equals("NOT FOUND")) {
                            requestSignup();
                        }
                        else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Error is: " + t.getLocalizedMessage(), Toast.LENGTH_LONG);
                            toast.show();
                        }

                    }
                });

    }

    void requestSignup() {
        final UserService userService =
                ServiceGenerator.createService(UserService.class, MainActivity.this);
        SignupParams signupParams = new SignupParams("nourandroid", "defaultpass123");
        userService.signup(signupParams)
                .enqueue(new Callback<AccessToken>() {
                    @Override
                    public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {
                        if (response.isSuccessful()) {
                            SharedPreferences pref = getSharedPreferences("laniakea", MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putBoolean("isAuthenticated", true);
                            editor.putString("auth-token", response.body().getToken());
                            editor.putString("auth-username", "nourandroid");
                            editor.apply();
                            Toast toast = Toast.makeText(getApplicationContext(), "Signuped up user successfully", Toast.LENGTH_LONG);
                            toast.show();
                        }
                        else {
                            ServerError error = ErrorUtils.parseError(response);
                            Toast toast = Toast.makeText(getApplicationContext(), "Error is: " + error.error(), Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }

                    @Override
                    public void onFailure(Call<AccessToken> call, Throwable t) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Error is: " + t.getLocalizedMessage(), Toast.LENGTH_LONG);
                        toast.show();
                    }
                });

    }

    void requestMeInfo() {
        final UserService userService =
                ServiceGenerator.createService(UserService.class, MainActivity.this);
        userService.me().enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    response.body();
                    Toast toast = Toast.makeText(getApplicationContext(), "Got user: " + response.body().toString(), Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    ServerError error = ErrorUtils.parseError(response);
                    Toast toast = Toast.makeText(getApplicationContext(), "Error is: " + error.error(), Toast.LENGTH_LONG);
                    toast.show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast toast = Toast.makeText(getApplicationContext(), "Error is: " + t.getLocalizedMessage(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
