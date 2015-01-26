package com.example.desy.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by desy on 1/24/15.
 */
public class EditToDo extends ActionBarActivity {
    EditText etNewItem;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etNewItem = (EditText) findViewById(R.id.edit_todo);
        String todo = getIntent().getStringExtra("itemList");
        etNewItem.setText(todo);

    }


    public void onEditItem(View view) {
        String editText = etNewItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("itemList", editText);
        setResult(RESULT_OK, data);
        finish();
    }
}
