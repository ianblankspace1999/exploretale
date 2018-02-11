package exploretale.android.exploretale.com.exploretale.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;
import exploretale.android.exploretale.com.exploretale.R;
import exploretale.android.exploretale.com.exploretale.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @BindView(R.id.btnLogin)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_splash;
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        Log.i("tag", "tag");
        startActivity(HomeActivity.getIntent(this));
    }
}
