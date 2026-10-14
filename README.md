# Marks Grade & GPA Calculator — Android test app

This is an Android Studio Gradle project wrapping the offline HTML calculator in an Android WebView.

## Storage test
- Enter marks in either S.A or F.A mode and press **Store**.
- Press **Stored data** to see saved records, then **Load** to restore one or **Delete** to remove it.
- Records use WebView `localStorage` and should persist across app restarts on the same installation.
- Clear all marks clears the current form, not saved records.

## Build APK
Open this folder in Android Studio with Android SDK Platform 35 installed, let Gradle sync, then choose **Build > Build APK(s)**. The debug APK is normally written to `app/build/outputs/apk/debug/app-debug.apk`.

Package/application ID: `com.polymathwizard.marks`
Minimum Android version: Android 6.0 (API 23).
