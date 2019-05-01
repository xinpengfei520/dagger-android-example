package cn.xpf.dagger2.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cn.xpf.dagger2.R;
import cn.xpf.dagger2.bean.MovieRespBean;

/**
 * Created by x-sir on 2019/5/1 :)
 * Function:
 */
public class MovieListAdapter extends BaseAdapter {

    private Context context;
    private List<MovieRespBean.TrailersBean> trailers;

    public MovieListAdapter(Context context, List<MovieRespBean.TrailersBean> trailers) {
        this.context = context;
        this.trailers = trailers;
    }

    @Override
    public int getCount() {
        return trailers.size();
    }

    @Override
    public Object getItem(int position) {
        return trailers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item_movie, null);
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        MovieRespBean.TrailersBean trailersBean = trailers.get(position);
        viewHolder.tvName.setText(trailersBean.getMovieName());

        return convertView;
    }

    private static class ViewHolder {
        private TextView tvName;
    }
}
