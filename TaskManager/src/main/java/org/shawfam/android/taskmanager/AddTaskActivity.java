package org.shawfam.android.taskmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.shawfam.android.taskmanager.tasks.Task;

/**
 * Created by Chris Shaw on 6/13/13.
 */
public class AddTaskActivity extends TaskManagerActivity {
    private EditText taskNameEditText;
    private Button addButton;
    private Button cancelButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_tasks);
        setUpViews();
    }

    protected void addTask() {
        String taskName = taskNameEditText.getText().toString();
        Task t = new Task(taskName);
        getTaskManagerApplication().addTask(t);
        finish();
    }

    protected void cancel() {
        finish();
    }

    private void setUpViews() {
        taskNameEditText = (EditText)findViewById(R.id.task_name);
        addButton = (Button)findViewById(R.id.add_button);
        cancelButton = (Button)findViewById(R.id.cancel_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTask();
            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancel();
            }
        });
    }
}