package weather.krishan.mvpdemoapp.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import weather.krishan.mvpdemoapp.MainActivity;
import weather.krishan.mvpdemoapp.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    EditText username, password;
    ProgressBar progressBar;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        username = (EditText) findViewById(R.id.id_username);
        password = (EditText) findViewById(R.id.id_password);
        progressBar = (ProgressBar) findViewById(R.id.id_progressbar);
        loginPresenter = new LoginPresenterImpl(this);
    }

    public void onLoginClick(View view) {
        loginPresenter.validateCredentials(username.getText().toString().trim(), password.getText().toString().trim());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUserNameError() {
        username.setError("Enter Correct UserName");
    }

    @Override
    public void setPasswordError() {
        password.setError("Enter Correct Password");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.onDestroy();
    }
}
