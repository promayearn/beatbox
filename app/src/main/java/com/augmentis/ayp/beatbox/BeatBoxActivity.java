package com.augmentis.ayp.beatbox;

import android.support.v4.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment onCreateFragment() {
        return BeatBoxFragment.newInstance();
    }
}
