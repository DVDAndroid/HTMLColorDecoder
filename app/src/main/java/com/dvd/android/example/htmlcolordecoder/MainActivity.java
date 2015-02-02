package com.dvd.android.example.htmlcolordecoder;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText et = (EditText) findViewById(R.id.editText);
		final ImageView iv = (ImageView) findViewById(R.id.imageView);

		et.addTextChangedListener(new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				if (et.getText().toString() != null) {
					try {
						iv.setBackgroundColor(Color.parseColor("#" + et.getText()
								.toString()));
					} catch (IllegalArgumentException e) {
						iv.setBackgroundColor(Color.parseColor("#ffffff"));
					}
				} else {
					iv.setBackgroundColor(Color.parseColor("#ffffff"));
				}
			}

			@Override
			public void afterTextChanged(Editable s) {
			}
		});
	}
}
