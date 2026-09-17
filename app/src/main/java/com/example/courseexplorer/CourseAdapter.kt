
package com.example.courseexplorer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CourseAdapter(
    context: Context,
    private val courses: List<Course>
) : ArrayAdapter<Course>(context, 0, courses) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_course, parent, false)

        val course = getItem(position) ?: return view

        val imageView = view.findViewById<ImageView>(R.id.ivCourse)
        val nameTextView = view.findViewById<TextView>(R.id.tvCourseName)
        val descriptionTextView =
            view.findViewById<TextView>(R.id.tvCourseDescription)

        imageView.setImageResource(course.imageResId)
        nameTextView.text = course.name
        descriptionTextView.text = course.description

        return view
    }
}