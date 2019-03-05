///**
// * kalau mau pakai ini tinggal aktifin saja, file ini sama file kotlin sama saja,
// * saya buat ini karena ingin tahu perbedaannya antara kedua file, dan ternyata
// * sama saja, jadi terserah anda mau pakai java atau kotlin.
// */
//
//package com.nativeapp.admin.firstexerciseandroidnative;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
///**
// * @author Bobby Akyong
// * */
//public class SplashActivity extends Activity {
//
//    Handler handler;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splashscreen);
//
//        handler=new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        },3000);
//    }
//}