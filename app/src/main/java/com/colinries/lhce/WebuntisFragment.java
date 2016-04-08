package com.colinries.lhce;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WebuntisFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WebuntisFragment extends Fragment {

    private static RelativeLayout layout;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public WebuntisFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WebuntisFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WebuntisFragment newInstance(String param1, String param2) {
        WebuntisFragment fragment = new WebuntisFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = (RelativeLayout) inflater.inflate(R.layout.fragment_webuntis, container, false);

        WebView webview = (WebView) layout.findViewById(R.id.webview);
        webview.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webview.getSettings().setAppCacheEnabled(true);
        webview.getSettings().setAppCachePath("/data/data/com.colinries.lhce/cache");
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://ssl.education.lu/WebUntis/?school=lhce#Timetable?type=1&formatId=2");

        return layout;
    }

}
