package nhungltpk00606_lab6.com;

import manhinhdieukhienen.com.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lab6_intent extends Activity {
	
	TextView hoten, diachi, trongluong;
	Button btnlab6Back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6_intent);
		hoten=(TextView)findViewById(R.id.txtname);
		diachi=(TextView)findViewById(R.id.txtaddress);
		trongluong=(TextView)findViewById(R.id.txtweight);
		btnlab6Back=(Button)findViewById(R.id.btnlab6Back);
		String mot=getIntent().getExtras().getString("a");
		String hai=getIntent().getExtras().getString("b");
		String ba=getIntent().getExtras().getString("c");
		hoten.setText(mot);
		diachi.setText(hai);
		trongluong.setText(ba);
		btnlab6Back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),lab6.class);
				startActivity(intent);
				
			}
		});
		
	}

}
