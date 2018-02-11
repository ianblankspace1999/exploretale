package exploretale.android.exploretale.com.exploretale.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by IanBlanco on 07/02/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getLayoutResource();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        ButterKnife.bind(this);
    }
}
