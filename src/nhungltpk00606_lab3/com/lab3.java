package nhungltpk00606_lab3.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhienen.com.R;

public class lab3 extends Activity implements OnClickListener{
	EditText username, Pass;
	Button login;
	TextView dk, qmk;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3);
		username=(EditText)findViewById(R.id.username);
		Pass=(EditText) findViewById(R.id.pass);
		login=(Button)findViewById(R.id.btnLogin);
		dk=(TextView)findViewById(R.id.register);
		qmk=(TextView)findViewById(R.id.forgot);
		login.setOnClickListener(this);
		dk.setOnClickListener(this);
		qmk.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==login){
			String user= username.getText().toString();
			String pass= Pass.getText().toString();
			if((user.equals(""))||(pass.equals(""))){
				Toast.makeText(getApplicationContext(), "bạn chưa nhập tk", Toast.LENGTH_LONG).show();
				
			}else if((user.equals("admin"))&&(pass.equals("admin"))){
				Intent intent=new Intent(getApplicationContext(),quanli.class);
				startActivity(intent);
			}else{
				Toast.makeText(getApplicationContext(), "bạn nhập sai tk", Toast.LENGTH_LONG).show();
			}
		}
	}

}
