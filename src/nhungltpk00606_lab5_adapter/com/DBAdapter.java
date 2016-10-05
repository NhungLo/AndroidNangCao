package nhungltpk00606_lab5_adapter.com;

import java.util.List;


import manhinhdieukhienen.com.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import nhungltpk00606_lab5.com.*;
import nhungltpk00606_lab5_model.com.DBModel;

public class DBAdapter extends ArrayAdapter<DBModel>{
	Activity context;
	int resourse;
	List<DBModel>object;
	public DBAdapter(Activity context, int resource, List<DBModel>object) {
		super(context, resource, object);
		this.context=context;
		this.object=object;
		this.resourse=resource;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
	 LayoutInflater inflater=this.context.getLayoutInflater();
	 View row=inflater.inflate(this.resourse, null);
	 TextView txtTen=(TextView)row.findViewById(R.id.txtTendb);
	 TextView txtPhone=(TextView)row.findViewById(R.id.txtSdt);
	 ImageButton btnCall=(ImageButton)row.findViewById(R.id.btnCall);
	 ImageButton btnSMS=(ImageButton)row.findViewById(R.id.btnSMS);
	 ImageButton btnplzz=(ImageButton)row.findViewById(R.id.btnplz);
	 ImageButton btnDetail=(ImageButton)row.findViewById(R.id.btnDetaill);
	 
	 TextView txtTen2=(TextView)row.findViewById(R.id.txtTendb2);
	 TextView txtPhone2=(TextView)row.findViewById(R.id.txtSdt2);
	 ImageButton btnCall2=(ImageButton)row.findViewById(R.id.btnCall2);
	 ImageButton btnSMS2=(ImageButton)row.findViewById(R.id.btnSMS2);
	 ImageButton btnplzz2=(ImageButton)row.findViewById(R.id.btnplz2);
	 ImageButton btnDetail2=(ImageButton)row.findViewById(R.id.btnDetaill2);
	 
	 
	 TextView txtTen3=(TextView)row.findViewById(R.id.txtTendb3);
	 TextView txtPhone3=(TextView)row.findViewById(R.id.txtSdt3);
	 ImageButton btnCall3=(ImageButton)row.findViewById(R.id.btnCall3);
	 ImageButton btnSMS3=(ImageButton)row.findViewById(R.id.btnSMS3);
	 ImageButton btnplzz3=(ImageButton)row.findViewById(R.id.btnplz3);
	 ImageButton btnDetail3=(ImageButton)row.findViewById(R.id.btnDetaill3);
	 
	 TextView txtTen4=(TextView)row.findViewById(R.id.txtTendb4);
	 TextView txtPhone4=(TextView)row.findViewById(R.id.txtSdt4);
	 ImageButton btnCall4=(ImageButton)row.findViewById(R.id.btnCall4);
	 ImageButton btnSMS4=(ImageButton)row.findViewById(R.id.btnSMS4);
	 ImageButton btnplzz4=(ImageButton)row.findViewById(R.id.btnplz4);
	 ImageButton btnDetail4=(ImageButton)row.findViewById(R.id.btnDetaill4);
	 
	 TextView txtTen5=(TextView)row.findViewById(R.id.txtTendb5);
	 TextView txtPhone5=(TextView)row.findViewById(R.id.txtSdt5);
	 ImageButton btnCall5=(ImageButton)row.findViewById(R.id.btnCall5);
	 ImageButton btnSMS5=(ImageButton)row.findViewById(R.id.btnSMS5);
	 ImageButton btnplzz5=(ImageButton)row.findViewById(R.id.btnplz5);
	 ImageButton btnDetail5=(ImageButton)row.findViewById(R.id.btnDetaill5);
	 
	 DBModel dbmodel=this.object.get(position);
	 txtTen.setText(dbmodel.getTen());
	 txtPhone.setText(dbmodel.getPhone());
	 txtTen2.setText(dbmodel.getTen());
	 txtPhone2.setText(dbmodel.getPhone());
	 txtTen3.setText(dbmodel.getTen());
	 txtPhone3.setText(dbmodel.getPhone());
	 txtTen4.setText(dbmodel.getTen());
	 txtPhone4.setText(dbmodel.getPhone());
	 txtTen5.setText(dbmodel.getTen());
	 txtPhone5.setText(dbmodel.getPhone());
	 return row;
}
}
