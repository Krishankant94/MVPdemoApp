package weather.krishan.mvpdemoapp.Login;

/**
 * Created by krishan on 3/27/2018.
 */

public interface LoginInterector {

    void login(String username, String password, onLoginFinishedListener listener);

    interface onLoginFinishedListener {
        void onUserNameError();

        void onPasswordError();

        void onSuccess();


    }
}
