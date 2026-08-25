# MAD Practical 2 – Activity Life Cycle and Basic UI

**Enrollment No.:** 24012021063  
**Repository:** `24012021063_Practical_2`

## AIM

Create an Android application to demonstrate the functions of **Activity Life Cycle** and **Basic UI**.

The application displays **“Hello World!”** in the center of the Activity screen with a yellow background. The TextView uses Holo Blue color, 27sp font size, and bold italic text style. The Activity Life Cycle methods are demonstrated using **Log**, **Toast**, and **Snackbar** messages.

## Practical Description

This practical demonstrates:

- Creating a basic Android user interface
- Using a `TextView` and its properties
- Using `ConstraintLayout`
- Using Android in-built color resources
- Generating an ID for a TextView
- Understanding the Activity Life Cycle
- Displaying Toast and Snackbar messages
- Printing Activity Life Cycle methods in Logcat

## UI Requirements

| Property | Value |
|---|---|
| Text | `Hello World!` |
| Text Color | `@android:color/holo_blue_bright` |
| Text Size | `27sp` |
| Text Style | `bold|italic` |
| Layout Background | `#FFFF00` |
| Position | Center of Activity |
| Layout | `ConstraintLayout` |

Example XML:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFF00">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textColor="@android:color/holo_blue_bright"
        android:textSize="27sp"
        android:textStyle="bold|italic"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Activity Life Cycle

The Activity lifecycle methods demonstrated are:

1. `onCreate()`
2. `onStart()`
3. `onResume()`
4. `onPause()`
5. `onStop()`
6. `onRestart()`
7. `onDestroy()`

```text
        onCreate()
             |
             v
         onStart()
             |
             v
         onResume()
             |
             v
        [Running]
             |
          onPause()
             |
             v
         onStop()
          /     \
         /       \
   onRestart()   onDestroy()
       |             |
       v             v
    onStart()       End
       |
       v
   onResume()
```

## Log Message

All Activity lifecycle methods are printed in Logcat using the `Log` class.

```kotlin
Log.d("LIFECYCLE", "onCreate Called")
Log.d("LIFECYCLE", "onStart Called")
Log.d("LIFECYCLE", "onResume Called")
Log.d("LIFECYCLE", "onPause Called")
Log.d("LIFECYCLE", "onStop Called")
Log.d("LIFECYCLE", "onRestart Called")
Log.d("LIFECYCLE", "onDestroy Called")
```

In Android Studio, filter Logcat using the tag `LIFECYCLE` to observe the callbacks.

## Toast Message

A Toast is a small temporary message displayed to the user.

```kotlin
Toast.makeText(
    this,
    "onCreate Called",
    Toast.LENGTH_SHORT
).show()
```

## Snackbar Message

A Snackbar displays a temporary message at the bottom of the screen.

```kotlin
Snackbar.make(
    findViewById(android.R.id.content),
    "Activity Started",
    Snackbar.LENGTH_SHORT
).show()
```

## Important Concepts Studied

### TextView

`TextView` is used to display text.

```xml
android:text="Hello World!"
android:textColor="@android:color/holo_blue_bright"
android:textSize="27sp"
android:textStyle="bold|italic"
```

### Android In-Built Resource

The application uses:

```xml
@android:color/holo_blue_bright
```

### ConstraintLayout

`ConstraintLayout` positions views using constraints. The TextView is constrained to all four sides of the parent so that it appears in the center.

### TextView ID

The TextView ID is generated using:

```xml
android:id="@+id/textView"
```

It can then be accessed from Kotlin using:

```kotlin
findViewById(R.id.textView)
```

## Project Structure

```text
24012021063_Practical_2/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── .../
│           │       └── MainActivity.kt
│           ├── res/
│           │   └── layout/
│           │       └── activity_main.xml
│           └── AndroidManifest.xml
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
```

## Requirements

- Android Studio
- Android SDK
- Kotlin
- Gradle
- Android Emulator or physical Android device

## How to Run

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Wait for Gradle Sync to complete.
4. Connect an Android device or start an emulator.
5. Click **Run ▶**.
6. Observe the Hello World UI.
7. Open **Logcat**.
8. Filter using `LIFECYCLE`.
9. Start, minimize, reopen, rotate, or close the Activity to observe lifecycle callbacks.

## Expected Result

The application should display:

- Yellow (`#FFFF00`) background
- “Hello World!” in the center
- Holo Blue Bright text color
- 27sp text size
- Bold and italic text style

The Activity lifecycle methods should appear in Logcat as the Activity changes state. Toast and Snackbar messages demonstrate temporary user feedback.

## Conclusion

Thus, an Android application demonstrating **Basic UI and Activity Life Cycle** was successfully implemented. The practical provides hands-on understanding of TextView, its properties, ConstraintLayout, Android built-in resources, Toast, Snackbar, Logcat, and the complete Activity Life Cycle.
