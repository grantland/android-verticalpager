package com.grantlandchew.example.verticalpager;

/*
 * Copyright (C) 2011 Grantland Chew
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
 *
 * --
 *
 * Based on http://code.google.com/p/deezapps-widgets/
 *
 * Copyright (C) 2010 Deez Apps!
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
 *
 * --
 *
 * Based on http://android.git.kernel.org/?p=platform/packages/apps/Launcher.git;a=blob;f=src/com/android/launcher/Workspace.java
 *
 * Copyright (C) 2008 The Android Open Source Project
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

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.grantlandchew.view.VerticalPager;

/**
 * @author Grantland Chew
 * @since Feb 13, 2011
 */
public class TestActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final VerticalPager pager = (VerticalPager) findViewById(R.id.pager);

        pager.addOnScrollListener(new VerticalPager.OnScrollListener() {
            public void onScroll(int scrollX) {
                //Log.d("TestActivity", "scrollX=" + scrollX);
            }

            public void onViewScrollFinished(int currentPage) {
                //Log.d("TestActivity", "viewIndex=" + currentPage);
            }
        });

        Button b = (Button) findViewById(R.id.up);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pager.scrollUp();
            }
        });
        b = (Button) findViewById(R.id.down);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pager.scrollDown();
            }
        });


    }
}
