package com.eagleciam.android10.UNALupita.presentation.view.activity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Toshiba on 11/28/2017.
 */

public class UserAuthenticationActivity extends BaseActivity {

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, UserAuthenticationActivity.class);
    }




}
