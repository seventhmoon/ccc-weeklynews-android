package edu.ccc.news.basicsyncadapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import edu.ccc.news.R;

/**
 * Activity for holding EntryListFragment.
 */
public class EntryListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_list);
    }
}
