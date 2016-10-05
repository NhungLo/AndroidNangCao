package nhungltpk00606_lab6.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import manhinhdieukhienen.com.R;

public class lab6 extends Activity {
	EditText name,weight,dc;
	Button bntlab6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		
		name=(EditText) findViewById(R.id.txtTen);
		dc=(EditText)findViewById(R.id.txtDiachi);
		weight=(EditText)findViewById(R.id.txtTrongluong);
		bntlab6= (Button) findViewById(R.id.btnlab66);
		bntlab6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String hotenn=name.getText().toString();
				String diachin=dc.getText().toString();
				String trongluongn=weight.getText().toString();
				
				Intent intent=new Intent(getApplicationContext(),lab6_intent.class);
				intent.putExtra("a", hotenn);
				intent.putExtra("b", diachin);
				intent.putExtra("c", trongluongn);
				startActivity(intent);
			}
		});
	}

}
