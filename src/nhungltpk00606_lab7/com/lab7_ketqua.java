package nhungltpk00606_lab7.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import manhinhdieukhienen.com.R;

public class lab7_ketqua extends Activity{
	TextView txtKetqua;
	
	Button btnback;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	txtKetqua=(TextView)findViewById(R.id.txtKetqualaab7);
	btnback=(Button)findViewById(R.id.btnbacklab7);
	String ketqua=getIntent().getExtras().getString("kq");
	txtKetqua.setText(ketqua);
	btnback.setOnClickListener(new View.OnClickListener() {	
		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent(getApplicationContext(),lab7.class);
			startActivity(intent);
		}
	});
	}
}
