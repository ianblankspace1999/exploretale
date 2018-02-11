package exploretale.android.exploretale.com.exploretale.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import exploretale.android.exploretale.com.exploretale.R;
import exploretale.android.exploretale.com.exploretale.models.Events;

/**
 * Created by IanBlanco on 07/02/2018.
 */

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {

    private Context mContext;
    private ArrayList<Events> mEventsList;

    public DashboardAdapter(Context mContext, ArrayList<Events> mEventsList) {
        this.mContext = mContext;
        this.mEventsList = mEventsList;
    }

    @Override
    public DashboardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_dashboard, parent, false);
        return new DashboardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DashboardViewHolder holder, int position) {
        Events events = mEventsList.get(position);

        holder.tvDate.setText(events.getName());
        holder.tvDate.setText(events.getDate());

    }

    @Override
    public int getItemCount() {
        return mEventsList.size();
    }

    public class DashboardViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivEventImage)
        ImageView ivEventImage;

        @BindView(R.id.tvName)
        TextView tvName;

        @BindView(R.id.tvDate)
        TextView tvDate;

        public DashboardViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
