package miguel.pruebat2_miguelhalys;

import android.app.Dialog;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Miguel on 3/8/2016.
 */
public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    private EditText usernameField, passwordField;
    private Button btnlogin;
    private LoginActivity loginActivity;

    public LoginActivityTest(){
        super(LoginActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        loginActivity=getActivity();
        usernameField = (EditText) loginActivity.findViewById(R.id.usernameField);
        passwordField = (EditText) loginActivity.findViewById(R.id.passwordField);
        btnlogin = (Button) loginActivity.findViewById(R.id.loginButton);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
    public void testLogearse() throws Exception {

        TouchUtils.tapView(this, usernameField);
        TouchUtils.tapView(this, passwordField);

        TouchUtils.clickView(this, btnlogin);

    }


}