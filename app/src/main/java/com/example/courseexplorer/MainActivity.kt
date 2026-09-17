
package com.example.courseexplorer

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Connect ListView from activity_main.xml
        val listViewCourses = findViewById<ListView>(
            R.id.listViewCourses
        )

        // Create course data
        val courses = listOf(
            Course(
                "Android Development",
                "Learn Android basics",
                android.R.drawable.ic_menu_manage
            ),
            Course(
                "Java Programming",
                "Learn Java basics",
                android.R.drawable.ic_menu_info_details
            ),
            Course(
                "Python Programming",
                "Learn Python programming",
                android.R.drawable.ic_menu_edit
            ),
            Course(
                "Machine Learning",
                "Learn ML concepts",
                android.R.drawable.ic_menu_search
            )
        )

        // Create and connect the adapter
        val adapter = CourseAdapter(this, courses)

        listViewCourses.adapter = adapter

        // Handle course selection

        listViewCourses.setOnItemClickListener {
                _, _, position, _ ->

            val selectedCourse = courses[position]

            val detailFragment = DetailFragment.newInstance(
                selectedCourse
            )

            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.detail_container,
                    detailFragment
                )
                .commit()
        }
    }
}