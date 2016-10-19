package nhungltpk00606_lab8.com;

import java.util.Random;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.IconMarginSpan;
import android.view.View;
import android.widget.Button;
import manhinhdieukhienen.com.R;

public class lab8 extends Activity{
	Button btntao, btndong;
	int notiId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8);
		btntao=(Button)findViewById(R.id.btnTaotb);
		btndong=(Button)findViewById(R.id.btnDongtb);
		btntao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				TaoThongbao();
				
			}

			private void TaoThongbao() {
			notiId=hamtaoma();
			Notification.Builder noti=new Notification.Builder(getApplicationContext());
			noti.setSmallIcon(R.drawable.ic_launcher);
			noti.setContentTitle("co thong bao moi"+noti);
			noti.setContentText("cap nhat version");
			Intent intent=new Intent(getApplicationContext(),lab8_thongbao.class);
			intent.putExtra("RequestCode", notiId);
			PendingIntent pendingIntent= PendingIntent.getActivity(getApplicationContext(), notiId, intent, PendingIntent.FLAG_UPDATE_CURRENT);
			noti.setContentIntent(pendingIntent);
			Uri uri=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
			noti.setSound(uri);
			NotificationManager notima=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
			notima.notify(notiId,noti.build());
			}

			private int hamtaoma() {
				Random random=new Random();
				int ma=random.nextInt();
				return ma;
			}
		});
		btndong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Dongthongbao();
			}
			private void Dongthongbao() {
				NotificationManager noti=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				noti.cancelAll();
				
			}
		});
		
	}
	

}
