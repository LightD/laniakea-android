package petronas.nourhelmi.com.laniakea.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import petronas.nourhelmi.com.laniakea.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref = getSharedPreferences("laniakea", MODE_PRIVATE);
        Boolean isAuthenticated = pref.getBoolean("isAuthenticated", false);
        if (isAuthenticated) {
            // load main fragments and all
        }
        else {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        }
    }
}
