/*
 * Copyright (C) 2017 AICP
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


package com.aicp.extras.fragments;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.preference.Preference;

import com.aicp.extras.BaseSettingsFragment;
import com.aicp.extras.R;
import com.aicp.extras.preference.MasterSwitchPreference;

public class StatusBar extends BaseSettingsFragment {

    MasterSwitchPreference mBatteryBar;

    @Override
    protected int getPreferenceResource() {
        return R.xml.status_bar;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBatteryBar = (MasterSwitchPreference)
                findPreference(Settings.System.STATUSBAR_BATTERY_BAR);
    }

    @Override
    public void onResume() {
        super.onResume();

        mBatteryBar.reloadValue();
    }
}
