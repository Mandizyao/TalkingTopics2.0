package se.amanda.talkingtopics20;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {

    private List<Topic> topicList;

    public TopicAdapter(List <Topic> topicsList) {
        this.topicList = topicsList;
    }


    @NonNull
    @Override
    public TopicAdapter.TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_cards, parent, false);
        return new TopicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicViewHolder holder, int position) {
        Topic topic = topicList.get(position);
        holder.topicImage.setImageResource(topic.getImageId());
        holder.topicTitle.setText(topic.getTitle());


    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public static class TopicViewHolder extends RecyclerView.ViewHolder {
        ImageView topicImage;
        TextView topicTitle;

        public TopicViewHolder (View itemView) {
            super(itemView);
            topicImage = itemView.findViewById(R.id.topicImage);
            topicTitle = itemView.findViewById(R.id.topicTitle);

        }
    }
}
