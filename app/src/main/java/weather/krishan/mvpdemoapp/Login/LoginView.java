package weather.krishan.mvpdemoapp.Login;

/**
 * Created by krishan on 3/27/2018.
 */

public interface LoginView {

     void showProgress();
     void hideProgress();
     void setUserNameError();
     void setPasswordError();
     void navigateToHome();
}
