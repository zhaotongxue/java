package com.zhao.soga;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et=(EditText)findViewById(R.id.edit);
        ListView lv=(ListView)findViewById(R.id.show);
        final ArrayList<String> al=new ArrayList<String>();
        final ArrayAdapter<String> sa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        lv.setAdapter(sa);
        
        
        et.setOnKeyListener(new  OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==KeyEvent.ACTION_DOWN){
					if((keyCode==KeyEvent.KEYCODE_DPAD_CENTER)||(keyCode==KeyEvent.KEYCODE_ENTER)){
						al.add(0,et.getText().toString());
						et.setText("");
						sa.notifyDataSetChanged();
						return true;
					}
				}
				return false;
			}
		});
    }
}
