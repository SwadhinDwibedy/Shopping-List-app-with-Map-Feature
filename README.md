Shopping List App with Map Feature

Description

A Kotlin-based Shopping List App developed using Jetpack Compose, now featuring an integrated map functionality powered by the Google Maps API. Users can view shopping item locations on an interactive map, enhancing the shopping experience.

Features:

Shopping List: Add, edit, and delete shopping items.
Map Integration: View locations associated with shopping items on an interactive Google Map.
Google Maps API: Easily navigate to different shopping spots.

Getting Started
To run this project locally, follow these steps:
Prerequisites:
Android Studio: Make sure you have the latest version of Android Studio.
Google Maps API Key: You need to enable the Google Maps API and get your API key from Google Cloud Console.
Kotlin: This project is built using Kotlin.

Installation:
Clone the repository:
bash

Copy code
git clone https://github.com/your-username/ShoppingListApp.git
Open the project in Android Studio.

Add your Google Maps API key in AndroidManifest.xml:

xml
Copy code
<meta-data
    android:name="com.google.android.geo.API_KEY"
    android:value="@string/google_maps_key" />
Sync the project and run it on an emulator or physical device.

Built With
Kotlin – Programming language used for the app.
Jetpack Compose – UI toolkit for building native UIs in Android.
Google Maps API – Provides interactive maps for displaying locations.

Contributing
Feel free to fork this repository, submit issues, or make pull requests for improvements.

License
This project is licensed under the MIT License - see the LICENSE file for details.
