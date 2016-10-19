package nhungltpk00606_lab8.com;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;
import manhinhdieukhienen.com.R;

public class lab8_thongbao extends Activity{
	TextView thongbao;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8_thongbao);
		thongbao=(TextView)findViewById(R.id.txtThongbao);
		int requestCode=getIntent().getExtras().getInt("RequestCode");
		Dongnotification(requestCode);
		thongbao.setText("da dong thong bao"+requestCode+"\n  bla bla");
	}
	private void Dongnotification(int notiId) {
		NotificationManager noti=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		noti.cancel(notiId);
		
	}
}
