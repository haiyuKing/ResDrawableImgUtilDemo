package com.why.project.resdrawableimgutildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.why.project.resdrawableimgutildemo.util.ResDrawableImgUtil;

public class MainActivity extends AppCompatActivity {

	private Button btn_getId;
	private TextView tv_show;
	private ImageView img_show;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();
		initEvents();
	}

	private void initViews() {
		btn_getId = (Button) findViewById(R.id.btn_getId);
		tv_show = (TextView) findViewById(R.id.tv_show);
		img_show = (ImageView) findViewById(R.id.img_show);
	}

	private void initEvents() {
		btn_getId.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String imgName = "icon.png";
				int resId = ResDrawableImgUtil.getResourceIdByIdentifier(MainActivity.this,imgName);
				tv_show.setText(tv_show.getText().toString() + resId);

				if(resId != -1){
					img_show.setBackgroundResource(resId);
				}
			}
		});
	}


}
