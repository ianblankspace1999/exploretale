package exploretale.android.exploretale.com.exploretale.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import exploretale.android.exploretale.com.exploretale.R;
import exploretale.android.exploretale.com.exploretale.base.BaseFragment;

/**
 * Created by IanBlanco on 07/02/2018.
 */

public class FragmentProfle extends BaseFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
