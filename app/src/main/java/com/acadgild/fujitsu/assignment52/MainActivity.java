package com.acadgild.fujitsu.assignment52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MenuItem.OnMenuItemClickListener {

    private final int MenuItem_EditId = 1, MenuItem_DeleteId = 0,MenuItem_rose=1;

    MenuItem edit_item ,delete_item,rose_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){

         edit_item = menu.add(0, MenuItem_EditId, 0, R.string.edit);
        edit_item.setIcon(R.mipmap.ic_launcher);
        edit_item.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        delete_item = menu.add(0, MenuItem_DeleteId, 1, R.string.edit1);
        delete_item.setIcon(R.mipmap.ic_launcher1);
        delete_item.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        rose_item = menu.add(0, MenuItem_rose, 1, R.string.edit2);
        rose_item.setIcon(R.mipmap.ic_launcher1);
        rose_item.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        edit_item.setOnMenuItemClickListener(this);
        delete_item.setOnMenuItemClickListener(this);
        rose_item.setOnMenuItemClickListener(this);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {

        if(item ==edit_item ){

            Toast.makeText(MainActivity.this,"Computer Is everything",Toast.LENGTH_SHORT).show();

        }
        if(item ==delete_item ){

            Toast.makeText(MainActivity.this,"Knowledge Is everything",Toast.LENGTH_SHORT).show();

        }

        if(item ==rose_item ){

            Toast.makeText(MainActivity.this,"Power Is everything",Toast.LENGTH_SHORT).show();

        }



        return false;
    }
}
