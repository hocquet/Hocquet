package fr.univartois.firssreader;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RssItemAdapter extends ArrayAdapter<RssItem> {
    private List<RssItem> news;
    private Context context;

    public RssItemAdapter(@NonNull Context context, @NonNull List<RssItem> news) {
        super(context, 0,news);
        this.news = news;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();

            holder.rsstitle = convertView.findViewById(R.id.rssTitle);
            holder.rsstext =  convertView.findViewById(R.id.rssDescription);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        RssItem item = this.news.get(position);
        holder.rsstitle.setText(item.getTitle());
        holder.rsstext.setText(Html.fromHtml(item.getDescription(), Html.FROM_HTML_MODE_LEGACY));
        return convertView;
    }


    static class ViewHolder {
        TextView rsstitle;
        TextView rsstext;
    }
}
