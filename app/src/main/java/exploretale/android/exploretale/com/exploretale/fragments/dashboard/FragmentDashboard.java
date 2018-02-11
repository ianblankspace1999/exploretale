package exploretale.android.exploretale.com.exploretale.fragments.dashboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import exploretale.android.exploretale.com.exploretale.R;
import exploretale.android.exploretale.com.exploretale.adapter.DashboardAdapter;
import exploretale.android.exploretale.com.exploretale.base.BaseFragment;
import exploretale.android.exploretale.com.exploretale.models.Events;

/**
 * Created by IanBlanco on 08/02/2018.
 */

public class FragmentDashboard extends Fragment {

    @BindView(R.id.rvEvents)
    RecyclerView rvEvents;

    Unbinder unbinder;

    private LinearLayoutManager mLinearlaLinearLayoutManager;
    private DashboardAdapter mDashboardAdapter;

    private ArrayList<Events> mEventsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        unbinder = ButterKnife.bind(this, view);
        init();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private void init() {

        Events events1 = new Events(1, "name", "01-01-2018");
        Events events2 = new Events(2, "name", "01-01-2018");
        Events events3 = new Events(3, "name", "01-01-2018");
        Events events4 = new Events(4, "name", "01-01-2018");
        Events events5 = new Events(5, "name", "01-01-2018");
        Events events6 = new Events(6, "name", "01-01-2018");
        Events events7 = new Events(7, "name", "01-01-2018");
        Events events8 = new Events(8, "name", "01-01-2018");
        Events events9 = new Events(9, "name", "01-01-2018");
        Events events10 = new Events(10, "name", "01-01-2018");

        mEventsList.add(events1);
        mEventsList.add(events2);
        mEventsList.add(events3);
        mEventsList.add(events4);
        mEventsList.add(events5);
        mEventsList.add(events6);
        mEventsList.add(events7);
        mEventsList.add(events8);
        mEventsList.add(events9);
        mEventsList.add(events10);

        mLinearlaLinearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        mDashboardAdapter = new DashboardAdapter(getActivity(), mEventsList);

        rvEvents.setLayoutManager(mLinearlaLinearLayoutManager);
        rvEvents.setAdapter(mDashboardAdapter);

    }
}
