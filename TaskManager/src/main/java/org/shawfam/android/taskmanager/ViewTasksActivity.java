package org.shawfam.android.taskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewTasksActivity extends Activity {

    private Button addButton;
    private TextView taskText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
    }

    private void setUpViews() {
        addButton = (Button)findViewById(R.id.add_button);
        taskText = (TextView)findViewById(R.id.task_list_text);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewTasksActivity.this, AddTaskActivity.class);
                startActivity(intent);
            }
        });
    }

}
