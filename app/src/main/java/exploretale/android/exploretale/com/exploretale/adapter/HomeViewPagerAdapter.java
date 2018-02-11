package exploretale.android.exploretale.com.exploretale.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IanBlanco on 07/02/2018.
 */

public class HomeViewPagerAdapter extends FragmentPagerAdapter{

    public List<Fragment> mFragmentList = new ArrayList<>();

    public HomeViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);

    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
