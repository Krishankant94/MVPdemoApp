package weather.krishan.mvpdemoapp.Login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by krishan on 3/27/2018.
 */

public class LoginInterectorImpl implements LoginInterector {
    @Override
    public void login(final String username,final String password,final onLoginFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if (TextUtils.isEmpty(username)) {
                    listener.onUserNameError();
                } else if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                } else if (username.equals("kk") && password.equals("8058")) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
