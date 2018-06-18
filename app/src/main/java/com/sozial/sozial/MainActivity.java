package com.sozial.sozial;

<<<<<<< HEAD
        import android.content.Intent;
        import android.net.Uri;
        import android.support.design.widget.TabLayout;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;

        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;
        import android.support.v4.view.ViewPager;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.ViewGroup;

        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.widget.TextView;
        import android.widget.Toast;

        import layout.BlankFragment;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

=======
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Vibrator;

import android.widget.TextView;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class MainActivity extends AppCompatActivity  {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

>>>>>>> refs/heads/master
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private WebView mWebView;
    private static final String website="https://www.instagram.com/accounts/signup/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(3);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }


    @Override
    public void onBackPressed() {
        int i = mViewPager.getCurrentItem();
        final WebView mWebView = (WebView)findViewById(R.id.webView1);
        final WebView mWebView1 = (WebView)findViewById(R.id.webView2);
        final WebView mWebView2 = (WebView)findViewById(R.id.webView3);
        System.out.println(i);
        switch (i){
            case 0:
                if(mWebView.canGoBack()  ) {
                    mWebView.goBack();
                } else {
                    super.onBackPressed();
                }
                    break;
           case 1 :
                if(mWebView1.canGoBack()  ) {
                    mWebView1.goBack();
                } else {
                    super.onBackPressed();
                }
                break;

            case 2 :
                if(mWebView2.canGoBack()  ) {
                    mWebView2.goBack();
                } else {
                    super.onBackPressed();
                }
                break;



<<<<<<< HEAD
        }
=======
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three/////////////////////////////
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
       mViewPager = (ViewPager) findViewById(R.id.main_content);
       mViewPager.setAdapter(mSectionsPagerAdapter);

     TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
     tabLayout.setupWithViewPager(mViewPager);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
>>>>>>> refs/heads/master

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            if(getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
                return rootView;
            }
            else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2){
                View rootView = inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
                return rootView;


            }
            else {

            }

            View rootView = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
            return rootView;
        }
    }
}

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return MainActivity.PlaceholderFragment.newInstance(position + 1);
    }

<<<<<<< HEAD


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
=======
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
>>>>>>> refs/heads/master
    }
    public int x = 0;
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:

                return "Facebook";
            case 1:

<<<<<<< HEAD
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            if(getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
               final WebView mWebView = (WebView) rootView.findViewById(R.id.webView1);
                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                mWebView.loadUrl("https://www.facebook.com/");
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.setWebViewClient(new MyAppWebViewClient());
                // Force links and redirects to open in the WebView instead of in a browser
                mWebView.setWebViewClient(new WebViewClient());

                mWebView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mWebView.setWebViewClient(new WebViewClient());

                        return false;
                    }
                });


                return rootView;
            }
            else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2){
                View rootView = inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
                final  WebView mWebView1 = (WebView) rootView.findViewById(R.id.webView2);
                WebSettings webSettings = mWebView1.getSettings();
                webSettings.setJavaScriptEnabled(true);
                mWebView1.loadUrl("https://www.instagram.com/");
                mWebView1.setWebViewClient(new WebViewClient());
                mWebView1.setWebViewClient(new MyAppWebViewClient());
                // Force links and redirects to open in the WebView instead of in a browser
                mWebView1.setWebViewClient(new WebViewClient());
                // Stop local links and redirects from opening in browser instead of WebView
                mWebView1.setWebViewClient(new MyAppWebViewClient());
                mWebView1.setWebViewClient(new MyAppWebViewClient());
                mWebView1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {





                        if(mWebView1.getUrl().equals(website)){


                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/signup/"));
                            view.getContext().startActivity(intent);
                            System.out.println("utsgdfffftftftftfkguguyfyuyfftftftfftftftftftftftftftftftftftfftftftftftftftftftftffff");
                        }
                        else{
                            mWebView1.setWebViewClient(new WebViewClient());
                        }
                        return false;
                    }
                });
                return rootView;


            }
            else {

            }

            View rootView = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);

            final WebView mWebView2 = (WebView) rootView.findViewById(R.id.webView3);
            WebSettings webSettings = mWebView2.getSettings();
            webSettings.setJavaScriptEnabled(true);
            mWebView2.loadUrl("https://mobile.twitter.com/");
            mWebView2.setWebViewClient(new WebViewClient());
            mWebView2.setWebViewClient(new MyAppWebViewClient());
            // Force links and redirects to open in the WebView instead of in a browser
            mWebView2.setWebViewClient(new WebViewClient());
            // Stop local links and redirects from opening in browser instead of WebView
            mWebView2.setWebViewClient(new MyAppWebViewClient());
            mWebView2.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    mWebView2.setWebViewClient(new WebViewClient());
                    return false;
                }
            });

            return rootView;
        }




    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Facebook";
                case 1:
                    return "Instagram";
                case 2:
                    return "Twitter";
            }
            return null;
        }
    }
}


=======
                return "Instgram";
            case 2:

                return "Twitter ";
        }
        return null;

    }
}
>>>>>>> refs/heads/master


