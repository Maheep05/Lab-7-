# Course Explorer

## 1. Project Overview

**Course Explorer** is an Android application developed using Kotlin and
Android Studio. The application displays a list of courses and allows
users to select a course to view its details through an Android
Fragment.

This project demonstrates:

-   Android project structure
-   XML-based user interface design
-   Kotlin data classes
-   Custom ListView adapters
-   Fragment implementation
-   Passing data using Bundles
-   Debugging with normal and conditional breakpoints
-   Functional testing using test cases

## 2. Objective

The objective of this project is to create a simple course-exploration
application that displays available courses and shows detailed
information about a selected course using a Fragment.

## 3. Technologies Used

-   **IDE:** Android Studio
-   **Programming Language:** Kotlin
-   **UI Design:** XML
-   **Platform:** Android
-   **Architecture Components:** Activities and Fragments
-   **UI Components:** ConstraintLayout, ListView, TextView, ImageView
-   **Debugging Tool:** Android Studio Debugger

## 4. Application Features

1.  Displays a list of courses.
2.  Shows a course image, name, and description.
3.  Allows the user to select a course.
4.  Displays the selected course details in `DetailFragment`.
5.  Transfers course information using a `Bundle`.
6.  Supports debugging using breakpoints.
7.  Uses a conditional breakpoint that triggers when **Android
    Development** is selected.

## 5. Project Structure

``` text
CourseExplorer/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/courseexplorer/
│           │   ├── MainActivity.kt
│           │   ├── Course.kt
│           │   ├── CourseAdapter.kt
│           │   └── DetailFragment.kt
│           │
│           └── res/
│               ├── layout/
│               │   ├── activity_main.xml
│               │   ├── item_course.xml
│               │   └── fragment_detail.xml
│               │
│               └── values/
│                   └── strings.xml
│
└── README.md
```

## 6. Important Files

### `MainActivity.kt`

-   Loads the main activity layout.
-   Creates the course list.
-   Connects the `CourseAdapter` to the `ListView`.
-   Detects when a course is selected.
-   Opens `DetailFragment` with the selected course information.

### `Course.kt`

Contains the data class used to represent a course.

``` kotlin
data class Course(
    val name: String,
    val description: String,
    val imageResId: Int
)
```

### `CourseAdapter.kt`

Connects course data to the custom course item layout. It displays the
course image, name, and description in each ListView row.

### `DetailFragment.kt`

Displays the selected course's name and description. The information is
received through Fragment arguments using a `Bundle`.

### `activity_main.xml`

Contains the application title, course ListView, and Fragment container.

### `item_course.xml`

Defines the appearance of an individual course item.

### `fragment_detail.xml`

Defines the layout used to display course details.

## 7. Application Workflow

``` text
Launch Application
       |
       v
Display Course List
       |
       v
User Selects a Course
       |
       v
Create DetailFragment
       |
       v
Pass Course Data Using Bundle
       |
       v
Display Course Details
```

## 8. Debugging Implementation

### Normal Breakpoint

A normal breakpoint was added inside `DetailFragment.kt`, near the line
where the course name is retrieved.

Example:

``` kotlin
val courseName = arguments?.getString("course_name")
    ?: "No course selected"
```

When the application reaches this line in Debug Mode, execution pauses.
The following information can be inspected:

-   Local variables
-   Call stack
-   Current execution line
-   Fragment lifecycle flow

### Conditional Breakpoint

A conditional breakpoint was configured in `MainActivity.kt` using the
following condition:

``` kotlin
selectedCourse.name == "Android Development"
```

The debugger pauses only when the selected course is **Android
Development**.

## 9. Test Cases

### Test Case 1: Display Course List

  Item              Description
  ----------------- -------------------------------------------------
  Test Case ID      TC01
  Objective         Verify that the course list is displayed
  Steps             Launch the application and view the course list
  Expected Result   Four courses are displayed
  Actual Result     To be filled after testing
  Status            To be filled

**Screenshot:** Add the course list screenshot here.

### Test Case 2: Select a Course

  -----------------------------------------------------------------------
  Item                                Description
  ----------------------------------- -----------------------------------
  Test Case ID                        TC02

  Objective                           Verify that selected course details
                                      are displayed

  Steps                               Select Python Programming from the
                                      list

  Expected Result                     The Fragment displays the course
                                      name and description

  Actual Result                       To be filled after testing

  Status                              To be filled
  -----------------------------------------------------------------------

**Screenshot:** Add the course details screenshot here.

### Test Case 3: Conditional Breakpoint

  Item              Description
  ----------------- --------------------------------------------------------------
  Test Case ID      TC03
  Objective         Verify the conditional breakpoint
  Steps             Select different courses and then select Android Development
  Expected Result   Debugger pauses only for Android Development
  Actual Result     To be filled after testing
  Status            To be filled

**Screenshot:** Add the conditional breakpoint screenshot here.

## 10. Output Screenshots

Add the following screenshots to document the output:

1.  Course list screen
2.  Selected course details
3.  Normal breakpoint in `DetailFragment.kt`
4.  Conditional breakpoint for Android Development

Replace the placeholders below with the actual image paths:

``` markdown
![Course List](screenshots/course_list.png)

![Course Details](screenshots/course_details.png)

![Normal Breakpoint](screenshots/normal_breakpoint.png)

![Conditional Breakpoint](screenshots/conditional_breakpoint.png)
```

## 11. Learning Outcomes

After completing this project, the following concepts were practiced:

-   Understanding Android Studio project structure
-   Creating Android layouts using XML
-   Using Kotlin data classes
-   Displaying data using a custom adapter
-   Implementing and managing Fragments
-   Passing data between an Activity and Fragment
-   Using Android Studio Debug Mode
-   Creating normal and conditional breakpoints
-   Preparing functional test cases and documenting results

## 12. Conclusion

The Course Explorer application successfully demonstrates how an Android
application can display a list of courses and show the details of a
selected course using a Fragment. The project also demonstrates
debugging techniques and functional testing in Android Studio.

The application can be extended in the future by adding:

-   A back button
-   Course search functionality
-   Multiple Fragment layouts for tablets
-   Course images from external resources
-   A database for storing courses
-   Navigation using the Navigation Component
