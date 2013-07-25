package com.buzz.bee.openir;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;



public class irImgButton extends ImageButton {

	String name = null;
	
	irImgButton(Context context){
		
		super(context);
		
	}
	
	
	 public irImgButton(Context context, AttributeSet attrs) {
		  super(context, attrs);
		  // TODO Auto-generated constructor stub
     }

    public irImgButton(Context context, AttributeSet attrs, int defStyle) {
	   super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
     }
	
	public void setName(String newName) {
		name = newName;
	}
	
	String getName() {
		return name;
	}
	
	

}
