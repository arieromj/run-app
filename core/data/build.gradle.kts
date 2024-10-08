plugins {
    alias(libs.plugins.runapp.android.library)
    alias(libs.plugins.runapp.jvm.ktor)
}

android {
    namespace = "com.jmdev.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}