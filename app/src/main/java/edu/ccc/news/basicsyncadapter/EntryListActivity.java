package edu.ccc.news.basicsyncadapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import edu.ccc.news.R;

/**
 * Activity for holding EntryListFragment.
 */
public class EntryListActivity extends AppCompactActivity {
//    private SwipeRefreshLayout laySwipe;
//    private SwipeRefreshLayout.OnRefreshListener onSwipeToRefresh = new SwipeRefreshLayout.OnRefreshListener() {
//        @Override
//        public void onRefresh() {
//            laySwipe.setRefreshing(true);
//            new Handler().postDelayed(new Runnable() {
//
//                @Override
//                public void run() {
//                    laySwipe.setRefreshing(false);
//                    Toast.makeText(getApplicationContext(), "Refresh done!", Toast.LENGTH_SHORT).show();
//                }
//            }, 3000);
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_list);

//        laySwipe = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
//        laySwipe.setOnRefreshListener(onSwipeToRefresh);
    }
}
