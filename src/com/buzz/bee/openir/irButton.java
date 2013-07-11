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
import android.util.AttributeSet;
import android.widget.Button;

public class irButton extends Button {

	String name = null;
	
	irButton(Context context){
		
		super(context);
		
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
	
	

}
