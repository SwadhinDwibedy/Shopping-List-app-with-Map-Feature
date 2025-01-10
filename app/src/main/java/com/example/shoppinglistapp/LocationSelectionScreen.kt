package com.example.shoppinglistapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun LocationSelectionScreen(
    location: LocationData,
    onLocationSelected: (LocationData) -> Unit
) {
    // Remember the current user location
    val userLocation = remember {
        mutableStateOf(LatLng(location.latitude, location.longitude))
    }

    // Set the camera position of the map
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(userLocation.value, 10f)
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Google Map to allow selecting location
        GoogleMap(
            modifier = Modifier.weight(1f).padding(top = 16.dp),
            cameraPositionState = cameraPositionState,
            onMapClick = { latLng ->
                userLocation.value = latLng // Update user location when map is clicked
            }
        ) {
            // Marker representing the selected location
            Marker(state = MarkerState(position = userLocation.value))
        }

        // Button to confirm location selection
        Button(
            onClick = {
                // Create a new LocationData with the selected coordinates
                val newLocation = LocationData(
                    userLocation.value.latitude,
                    userLocation.value.longitude
                )
                // Pass the new location back to the caller
                onLocationSelected(newLocation)
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Set Location")
        }
    }
}
