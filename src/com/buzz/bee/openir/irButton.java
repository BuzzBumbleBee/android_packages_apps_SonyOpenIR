/*
 * Copyright (C) 2013 Shane Francis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.buzz.bee.openir;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Button;

public class irButton extends Button {

	String name = null;
	int icon = -99999;

	irButton(Context context){
		
		super(context);
		
	}
	
	public void setIcon(int res) {
		icon = res;
		
	}
	
	
	 public irButton(Context context, AttributeSet attrs) {
		  super(context, attrs);
		  // TODO Auto-generated constructor stub
     }

    public irButton(Context context, AttributeSet attrs, int defStyle) {
	   super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
     }
	
	public void setName(String newName) {
		name = newName;
	}
	
	String getName() {
		return name;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {  
	    super.onDraw(canvas);
	    
	    if (icon != -99999) {
	    
	    	Resources res = getResources();
	    	Bitmap bitmap = BitmapFactory.decodeResource(res, icon);
	    	   
	    	Rect rectangle = new Rect(20,20,canvas.getWidth()-20,canvas.getHeight()-20);
	    
	    	canvas.drawBitmap(bitmap, null, rectangle, new Paint());
	    }
	}

}

