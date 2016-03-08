package miguel.pruebat2_miguelhalys;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private TextView titleField,subtitleField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        titleField= (TextView) findViewById(R.id.splashTitle);
        subtitleField= (TextView) findViewById(R.id.splashSubtitle);
        titleField.startAnimation(shake);
        setFuente();
        openApp(true);
    }
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
    private void setFuente() {
        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "AmaticSC-Regular.ttf");
        titleField.setTypeface(font);
        subtitleField.setTypeface(font);
        titleField.setTypeface(font);
        subtitleField.setTypeface(font);
    }
}
