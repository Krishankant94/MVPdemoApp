package weather.krishan.mvpdemoapp.Login;

/**
 * Created by krishan on 3/27/2018.
 */

public interface LoginPresenter {
    void validateCredentials(String username , String password);
    void onDestroy();
}
