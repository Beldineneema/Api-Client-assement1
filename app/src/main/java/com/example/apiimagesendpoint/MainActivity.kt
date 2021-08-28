package com.example.apiimagesendpoint

import android.icu.text.DateFormat.RELATIVE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes

class MainActivity : ApiClient() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class ApiClient(

            @get:findByInput

            @get:IdRes()
            val inputDir: FileCollection,

            @get:OutputDirectory
            val outputDir: File
        ) : CommandLineArgumentProvider {
            inner class PathSensitivit {

            }

            inner class File {

            }
            // Specifies each directory as a command line argument for the processor.
            // The Android plugin uses this method to pass the arguments to the
            // annotation processor.

            override fun apiClient(): Iterable<String> {
                // Use the form '-Akey[=value]' to pass your options to the Java compiler.
                return listOf("-AinputDir=${inputDir.singleFile.absolutePath}",
                    "-AoutputDir=${outputDir.absolutePath}")
            }
    }
}