package com.example.app

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.urltobitmap.app.Utility.BitmapConvertor
import io.reactivex.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BitmapConvertor.UrltoBitmap(CompositeDisposable(),object : BitmapConvertor.BitmapCallBack{
            override fun onSuccess(bitmap: Bitmap?) {

            }

            override fun onProgress(Status: String?) {
                when(Status){
                    "start"->{

                    }
                    "end"->{

                    }
                }
            }

            override fun onFailure(throwable: Throwable?) {

            }

        },"Here your image url")
    }
}