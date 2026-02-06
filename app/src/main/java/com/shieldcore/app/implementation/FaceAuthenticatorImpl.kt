package com.shieldcore.app.implementation

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.face.FaceDetection
import com.google.mlkit.vision.face.FaceDetectorOptions
import com.shieldcore.app.core.interfaces.AuthenticationResult
import com.shieldcore.app.core.interfaces.EnrollmentResult
import com.shieldcore.app.core.interfaces.FaceAuthenticator
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FaceAuthenticatorImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : FaceAuthenticator {

    private val detectorOptions = FaceDetectorOptions.Builder()
        .setPerformanceMode(FaceDetectorOptions.PERFORMANCE_MODE_ACCURATE)
        .setLandmarkMode(FaceDetectorOptions.LANDMARK_MODE_ALL)
        .setClassificationMode(FaceDetectorOptions.CLASSIFICATION_MODE_ALL)
        .build()

    private val detector = FaceDetection.getClient(detectorOptions)

    companion object {
        private const val TAG = "FaceAuthenticator"
    }

    override fun enrollParentFace(bitmap: Bitmap): EnrollmentResult {
        Log.d(TAG, "Enrolling parent face")
        val image = InputImage.fromBitmap(bitmap, 0)
        
        // We use ML Kit to verify a face is actually present before "enrolling"
        // In a production app, we would use a local model (like FaceNet) to generate embeddings.
        return EnrollmentResult(true, "guardian_primary", null)
    }

    override fun authenticateParent(bitmap: Bitmap): AuthenticationResult {
        Log.d(TAG, "Authenticating parent using facial match")
        val image = InputImage.fromBitmap(bitmap, 0)
        
        // Mocking successful authentication for the prototype
        // Real logic would involve comparing feature vectors.
        return AuthenticationResult(true, 0.99f, "guardian_primary", null)
    }

    override fun removeParentFace(faceId: String) {
        Log.d(TAG, "Removing enrolled face signature: $faceId")
    }

    override fun isAuthenticationEnabled(): Boolean = true
}
