package se.amanda.talkingtopics20;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.category);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<Topic> topicsList = new ArrayList<>();
        topicsList.add(new Topic("Fåglar", R.drawable.bird));
        topicsList.add(new Topic("Cupcakes", R.drawable.cupcake));
        topicsList.add(new Topic("Delfiner",  R.drawable.delfinen));
        topicsList.add(new Topic("Havet", R.drawable.sea));
        topicsList.add(new Topic("Manet", R.drawable.manet));
        topicsList.add(new Topic("Festival", R.drawable.festival));
        topicsList.add(new Topic("Basket", R.drawable.basket));
        topicsList.add(new Topic("Kaffe", R.drawable.coffee));
        topicsList.add(new Topic("Party", R.drawable.party));
        topicsList.add(new Topic("Pengar", R.drawable.money));

        TopicAdapter adapter = new TopicAdapter(topicsList);
        recyclerView.setAdapter(adapter);

    }
}