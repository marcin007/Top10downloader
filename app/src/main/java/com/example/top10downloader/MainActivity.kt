package com.example.top10downloader

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "calling onCreate")
        var downloadResults = DownloadData()
        downloadResults.execute("here RRS link")
        Log.d(TAG, "onCreate done")
    }

    companion object {
        private class DownloadData : AsyncTask<String, Void, String>(){
            private val TAG = "Download Data"
            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Log.d(TAG, "onPostExecute pamaeter is: $result")
            }

            override fun doInBackground(vararg params: String?): String {
                Log.d(TAG, "doInBackground starts in ${params[0]}")
                return "doInBackgound completed"
            }
        }
    }
}
