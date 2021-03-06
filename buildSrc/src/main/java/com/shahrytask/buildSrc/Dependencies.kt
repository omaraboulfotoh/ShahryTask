@file:Suppress("PackageDirectoryMismatch")

object Dependencies {

    //Support
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"

    //UI
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val swipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayoutVersion}"
    const val animationLib = "com.daimajia.androidanimations:library:${Versions.animation}"
    //Testing
    const val junit4 = "junit:junit:${Versions.junit4Version}"
    const val junitExtensions = "androidx.test.ext:junit:${Versions.junitExtensionsVersion}"
    const val junitExtensionsKtx = "androidx.test.ext:junit-ktx:${Versions.junitExtensionsVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val mockk = "io.mockk:mockk:${Versions.mockkVersion}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectricVersion}"
    const val androidArchCoreTest =
        "androidx.arch.core:core-testing:${Versions.androidArchCoreTest}"
    const val truth = "com.google.truth:truth:${Versions.truthVersion}"


    //DI
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.daggerHiltVersion}"
    const val daggerHiltCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltVersion}"

    //Networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitMoshiConverter =
        "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
    const val sandwish = "com.github.skydoves:sandwich:${Versions.sandwishVersion}"

    //Json
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshiVersion}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"

    //Threading
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesCoreAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesVersion}"

    //Code Style
    const val ktlint = "com.pinterest:ktlint:${Versions.ktlintVersion}"

    //Jetpack Compose
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val composeAnimation = "androidx.compose.animation:animation:${Versions.composeVersion}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeActivity =
        "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
    const val composeViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModelVersion}"
    const val composeLiveData =
        "androidx.compose.runtime:runtime-livedata:${Versions.composeVersion}"
    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val composeConstraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:${Versions.composeConstraintLayoutVersion}"
    const val composeNavigation =
        "androidx.navigation:navigation-compose:${Versions.composeNavigationVersion}"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val accompanistSwipeRefresh =
        "com.google.accompanist:accompanist-swiperefresh:${Versions.accompanistSwipeRefresh}"
    const val lottieCompose = "com.airbnb.android:lottie-compose:${Versions.lottieVersion}"

    //Navigation
    const val navigationComponent =
        "androidx.navigation:navigation-ui-ktx:${Versions.composeNavigationVersion}"
    const val navigationComponentFrag =
        "androidx.navigation:navigation-fragment-ktx:${Versions.composeNavigationVersion}"


    const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy}"

    //Data (Room - DataStore)
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomKtx="androidx.room:room-ktx:${Versions.roomVersion}"
    const val datastore = "androidx.datastore:datastore:${Versions.datastoreVersion}"
    const val datastorePrefers =
        "androidx.datastore:datastore-preferences:${Versions.datastoreVersion}"
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"

    //Lifecycle
    val lifecycle_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeycycleVersion}"
    val lifecycle_liveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeycycleVersion}"
    val lifecycle_runtime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeycycleVersion_runtime}"


    //Firebase
    val firebase_bom = "com.google.firebase:firebase-bom:${Versions.firebaseBomVersion}"
    val firebaseAuth = "com.google.firebase:firebase-auth-ktx"
    val firebaseDyamicLinks ="com.google.firebase:firebase-dynamic-links-ktx"
    val firebaseMessaging="com.google.firebase:firebase-messaging-ktx"

}
