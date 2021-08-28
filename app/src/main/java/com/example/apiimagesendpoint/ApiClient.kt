package com.example.apiimagesendpoint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ApiClient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_client)
    }
    object ApiClient {
        var retrofit = ApiClient.buildApiClient<T>
            .baseUrl("<your base url goes here>")
            .addConverterFactory(.create())
            .build()
        fun <T> buildApiClient(apiInterface: Class<T>) : T{
            return retrofit.create(apiInterface)
}