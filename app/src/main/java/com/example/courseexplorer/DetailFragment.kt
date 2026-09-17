
package com.example.courseexplorer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(
            R.layout.fragment_detail,
            container,
            false
        )
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val titleTextView = view.findViewById<TextView>(
            R.id.tvDetailTitle
        )

        val descriptionTextView = view.findViewById<TextView>(
            R.id.tvDetailDescription
        )

        val courseName = arguments?.getString("course_name")
            ?: "No course selected"

        val courseDescription = arguments?.getString(
            "course_description"
        ) ?: "No description available"

        titleTextView.text = courseName
        descriptionTextView.text = courseDescription
    }

    companion object {

        fun newInstance(course: Course): DetailFragment {

            val fragment = DetailFragment()

            val bundle = Bundle().apply {
                putString("course_name", course.name)
                putString(
                    "course_description",
                    course.description
                )
            }

            fragment.arguments = bundle

            return fragment
        }
    }
}