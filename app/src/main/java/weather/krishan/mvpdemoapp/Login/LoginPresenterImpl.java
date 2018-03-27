package weather.krishan.mvpdemoapp.Login;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by krishan on 3/27/2018.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInterector.onLoginFinishedListener {
    LoginView mloginView;
    LoginInterector mloginInterector;

    public LoginPresenterImpl(LoginView loginView) {
        mloginView = loginView;
        mloginInterector = new LoginInterectorImpl();
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (mloginView != null) {
            mloginView.showProgress();
            mloginInterector.login(username, password, this);
        }
    }

    @Override
    public void onDestroy() {
        if (mloginView != null) {
            mloginView = null;
        }
    }

    @Override
    public void onUserNameError() {
        if(mloginView!=null){
          mloginView.hideProgress();
          mloginView.setUserNameError();
        }
    }

    @Override
    public void onPasswordError() {
        if(mloginView!=null){
            mloginView.hideProgress();
            mloginView.setPasswordError();
        }

    }

    @Override
    public void onSuccess() {
        if(mloginView!=null) {
            mloginView.hideProgress();
            mloginView.navigateToHome();
        }
    }

}
