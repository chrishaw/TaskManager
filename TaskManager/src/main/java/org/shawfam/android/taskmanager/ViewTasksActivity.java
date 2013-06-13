package org.shawfam.android.taskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.shawfam.android.taskmanager.tasks.Task;

import java.util.ArrayList;

public class ViewTasksActivity extends TaskManagerActivity {

    private Button addButton;
    private TextView taskText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        showTasks();
    }

    private void showTasks() {
        ArrayList<Task> tasks = getTaskManagerApplication().getCurrentTasks();
        StringBuffer sb = new StringBuffer();
        for (Task t:tasks) {
            sb.append(String.format("* %s\n", t.toString()));
        }
        taskText.setText(sb.toString());
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
