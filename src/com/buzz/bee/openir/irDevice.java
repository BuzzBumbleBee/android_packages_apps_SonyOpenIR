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

import android.app.Activity;

public class irDevice {
	
	private irButton[] deviceButtons;
	private int deviceType; //1 TV / 2 PVR / 3 AMP / 4 DVD
	public Activity activity;
	private String deviceName;
	private int buttonCount;
	
	irDevice(int type, String name, Activity _activity){
		
		this.activity = _activity;
		deviceName = name;
		deviceType = type;
		
		if (deviceType == 1) {
			mapKeyTV();
		}
	}
	
	public irButton[] getButtonMap() {
		return deviceButtons;
	}
	
	public String getName() {
		return deviceName;
	}
	
	public int getType() {
		return deviceType;
	}
	
	public int getButtonCount() {
		return buttonCount;
	}
	
	private void mapKeyTV() {
		deviceButtons = new irButton[35];
		deviceButtons[0] = (irButton) this.activity.findViewById(R.id.powerbtn);
		deviceButtons[0].setName("powerbtn");
		deviceButtons[1] = (irButton) this.activity.findViewById(R.id.volupbtn);
		deviceButtons[1].setName("volupbtn");		
		deviceButtons[2] = (irButton) this.activity.findViewById(R.id.voldwnbtn);
		deviceButtons[2].setName("voldwnbtn");		
		deviceButtons[3] = (irButton) this.activity.findViewById(R.id.chipbtn);
		deviceButtons[3].setName("chipbtn");		
		deviceButtons[4] = (irButton) this.activity.findViewById(R.id.chdwnbtn);
		deviceButtons[4].setName("chdwnbtn");
		deviceButtons[5] = (irButton) this.activity.findViewById(R.id.d0btn);
		deviceButtons[5].setName("d0btn");
		deviceButtons[6] = (irButton) this.activity.findViewById(R.id.d1btn);
		deviceButtons[6].setName("d1btn");
		deviceButtons[7] = (irButton) this.activity.findViewById(R.id.d2btn);
		deviceButtons[7].setName("d2btn");
		deviceButtons[8] = (irButton) this.activity.findViewById(R.id.d3btn);
		deviceButtons[8].setName("d3btn");
		deviceButtons[9] = (irButton) this.activity.findViewById(R.id.d4btn);
		deviceButtons[9].setName("d4btn");
		deviceButtons[10] = (irButton) this.activity.findViewById(R.id.d5btn);
		deviceButtons[10].setName("d5btn");
		deviceButtons[11] = (irButton) this.activity.findViewById(R.id.d6btn);
		deviceButtons[11].setName("d6btn");
		deviceButtons[12] = (irButton) this.activity.findViewById(R.id.d7btn);
		deviceButtons[12].setName("d7btn");
		deviceButtons[13] = (irButton) this.activity.findViewById(R.id.d8btn);
		deviceButtons[13].setName("d8btn");
		deviceButtons[14] = (irButton) this.activity.findViewById(R.id.d9btn);
		deviceButtons[14].setName("d9btn");
		deviceButtons[15] = (irButton) this.activity.findViewById(R.id.arrowupbtn);
		deviceButtons[15].setName("arrowupbtn");
		deviceButtons[15].setIcon(R.drawable.arrowu);
		deviceButtons[16] = (irButton) this.activity.findViewById(R.id.arrowdwnBtn);
		deviceButtons[16].setName("arrordwnbtn");
		deviceButtons[16].setIcon(R.drawable.arrowd);
		deviceButtons[17] = (irButton) this.activity.findViewById(R.id.arrowleftbtn);
		deviceButtons[17].setName("arrowleftbtn");
		deviceButtons[17].setIcon(R.drawable.arrowl);
		deviceButtons[18] = (irButton) this.activity.findViewById(R.id.arrowrightbtn);
		deviceButtons[18].setName("arrowrightbtn");
		deviceButtons[18].setIcon(R.drawable.arrowr);
		deviceButtons[19] = (irButton) this.activity.findViewById(R.id.selectbtn);
		deviceButtons[19].setName("selectbtn");
		deviceButtons[20] = (irButton) this.activity.findViewById(R.id.backbtn);
		deviceButtons[20].setName("backbtn");
		deviceButtons[21] = (irButton) this.activity.findViewById(R.id.inputbtn);
		deviceButtons[21].setName("inputbtn");
		deviceButtons[22] = (irButton) this.activity.findViewById(R.id.mutebtn);
		deviceButtons[22].setName("key_mutebtn");
		deviceButtons[23] = (irButton) this.activity.findViewById(R.id.menubtn);
		deviceButtons[23].setName("menubtn");
		deviceButtons[24] = (irButton) this.activity.findViewById(R.id.guidebtn);
		deviceButtons[24].setName("guidebtn");
		deviceButtons[25] = (irButton) this.activity.findViewById(R.id.playbtn);
		deviceButtons[25].setName("playbtn");
		deviceButtons[25].setIcon(R.drawable.arrowr);
		deviceButtons[26] = (irButton) this.activity.findViewById(R.id.stopBtn);
		deviceButtons[26].setName("stopbtn");
		deviceButtons[26].setIcon(R.drawable.stop);
		deviceButtons[27] = (irButton) this.activity.findViewById(R.id.paueBtn);
		deviceButtons[27].setName("pausebtn");
		deviceButtons[27].setIcon(R.drawable.pause);
		deviceButtons[28] = (irButton) this.activity.findViewById(R.id.rewindBtn);
		deviceButtons[28].setName("rew_btn");
		deviceButtons[28].setIcon(R.drawable.rewind);
		deviceButtons[29] = (irButton) this.activity.findViewById(R.id.fastfBtn);
		deviceButtons[29].setName("ff_btn");
		deviceButtons[29].setIcon(R.drawable.fastf);
		deviceButtons[30] = (irButton) this.activity.findViewById(R.id.recBtn);
		deviceButtons[30].setName("recordBtn");
		deviceButtons[30].setIcon(R.drawable.record);
		deviceButtons[31] = (irButton) this.activity.findViewById(R.id.redBtn);
		deviceButtons[31].setName("redBtn");
		deviceButtons[31].setIcon(R.drawable.redbtn);
		deviceButtons[32] = (irButton) this.activity.findViewById(R.id.greenBtn);
		deviceButtons[32].setName("greenBtn");
		deviceButtons[32].setIcon(R.drawable.greenbtn);
		deviceButtons[33] = (irButton) this.activity.findViewById(R.id.yellowBtn);
		deviceButtons[33].setName("yellowBtn");
		deviceButtons[33].setIcon(R.drawable.yellowbtn);
		deviceButtons[34] = (irButton) this.activity.findViewById(R.id.blueBtn);
		deviceButtons[34].setName("blueBtn");
		deviceButtons[34].setIcon(R.drawable.stop);
		buttonCount = 35;
		
		
	}

}
