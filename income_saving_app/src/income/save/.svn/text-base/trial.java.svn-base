package income.save;


import com.kidroid.kichart.model.Aitem;

import com.kidroid.kichart.view.LineView;

import android.app.Activity;

import android.graphics.Color;

import android.os.Bundle;
public class trial extends Activity {

/** Called when the activity is first created. */

LineView lv;

@Override

public void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.trial);

String xaxis[]=new String[4];

xaxis[0]="2012";

xaxis[1]="2013";

xaxis[2]="2014";

xaxis[3]="2015";

String yaxis[]=new String[13];
yaxis[0]="jan";


float line1[]=new float[4];

line1[0]=120;

line1[1]=240;

line1[2]=500;

line1[3]=100;

float line2[]=new float[4];

line2[0]=100;

line2[1]=650;

line2[2]=700;

line2[3]=300;

float line3[]=new float[4];

line3[0]=50;

line3[1]=180;

line3[2]=360;

line3[3]=900;

Aitem items[]=new Aitem[3];

items[0]= new Aitem(Color.BLUE,"Salary",line1);

items[1]= new Aitem(Color.GREEN,"Spendings",line2);

items[2]= new Aitem(Color.YELLOW,"Savings",line3);

lv=new LineView(this);

lv.setTitle("Yearly Spendings");

lv.setAxisValueX(xaxis);

lv.setItems(items);

setContentView(lv);

}

}
