package jp.juggler.subwaytooter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

class Pref {
	
	
	static SharedPreferences pref( Context context ){
		return PreferenceManager.getDefaultSharedPreferences( context );
	}
	
	private static final String KEY_BACK_TO_COLUMN_LIST = "BackToColumnList"; // 使わなくなった
	
	static final int RAT_REFRESH_SCROLL = 0;
	static final int RAT_REFRESH__DONT_SCROLL = 1;
	static final int RAT_DONT_REFRESH = 2;
	
	static final String KEY_DONT_CONFIRM_BEFORE_CLOSE_COLUMN = "DontConfirmBeforeCloseColumn";
	static final String KEY_BACK_BUTTON_ACTION = "back_button_action";
	static final String KEY_PRIOR_LOCAL_URL = "prior_local_url";
	static final String KEY_DISABLE_FAST_SCROLLER = "disable_fast_scroller";
	static final String KEY_UI_THEME = "ui_theme";
	static final String KEY_SIMPLE_LIST = "simple_list";
	static final String KEY_NOTIFICATION_SOUND = "notification_sound";
	static final String KEY_NOTIFICATION_VIBRATION = "notification_vibration";
	static final String KEY_NOTIFICATION_LED = "notification_led";
	static final String KEY_EXIT_APP_WHEN_CLOSE_PROTECTED_COLUMN = "ExitAppWhenCloseProtectedColumn";
	static final String KEY_RESIZE_IMAGE = "resize_image";
	static final String KEY_SHOW_FOLLOW_BUTTON_IN_BUTTON_BAR = "ShowFollowButtonInButtonBar";
	static final String KEY_REFRESH_AFTER_TOOT = "refresh_after_toot";
	
}
