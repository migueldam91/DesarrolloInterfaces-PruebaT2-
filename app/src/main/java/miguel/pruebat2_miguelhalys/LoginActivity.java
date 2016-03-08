package miguel.pruebat2_miguelhalys;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView titleField,subtitleField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        titleField=(TextView) findViewById(R.id.title);
        subtitleField=(TextView) findViewById(R.id.subtitle);
        setFuente();
    }
    private void setFuente() {
        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "AmaticSC-Regular.ttf");
        titleField.setTypeface(font);
        subtitleField.setTypeface(font);
    }
    public void logearse(View v){
        Intent mainActivity = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(mainActivity);
    }

}
