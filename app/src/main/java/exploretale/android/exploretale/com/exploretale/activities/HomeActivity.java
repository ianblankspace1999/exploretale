package exploretale.android.exploretale.com.exploretale.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.OnClick;
import exploretale.android.exploretale.com.exploretale.R;
import exploretale.android.exploretale.com.exploretale.adapter.HomeViewPagerAdapter;
import exploretale.android.exploretale.com.exploretale.base.BaseActivity;
import exploretale.android.exploretale.com.exploretale.fragments.dashboard.FragmentDashboard;
import exploretale.android.exploretale.com.exploretale.fragments.FragmentProfle;

/**
 * Created by IanBlanco on 07/02/2018.
 */

public class HomeActivity extends BaseActivity {

    public static Intent getIntent(Context context) {
        return new Intent(context, HomeActivity.class);
    }

    @BindView(R.id.vpHomeView)
    ViewPager vpHomeView;

    @BindView(R.id.ivDashboard)
    ImageView ivDashboard;

    @BindView(R.id.ivProfile)
    ImageView ivProfile;

    private HomeViewPagerAdapter mHomeViewPagerAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @OnClick({R.id.ivDashboard, R.id.ivProfile})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivDashboard:
                vpHomeView.setCurrentItem(0);
                break;
            case R.id.ivProfile:
                vpHomeView.setCurrentItem(1);
                break;
        }
    }

    private void init() {


        mHomeViewPagerAdapter = new HomeViewPagerAdapter(getSupportFragmentManager());

        mHomeViewPagerAdapter.addFragment(new FragmentDashboard());
        mHomeViewPagerAdapter.addFragment(new FragmentProfle());

        vpHomeView.setAdapter(mHomeViewPagerAdapter);

    }
}
