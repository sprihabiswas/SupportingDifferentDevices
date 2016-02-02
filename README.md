# SupportingDifferentDevices
- How to use basic platform features that leverage alternative resources and other features so your app can provide an optimized user experience on a variety of Android-compatible devices, using a single application package (APK).
- Part of the series Mastering Android

# Supporting Different Languages
- How to support multiple languages with alternative string resources.

To add support for more languages, create additional values directories inside res/ that include a hyphen and the ISO language code at the end of the directory name. For example, values-es/ is the directory containing simple resourcess for the Locales with the language code "es". Android loads the appropriate resources according to the locale settings of the device at run time. 

# Supporting Different Screens
- How to optimize the user experience for different screen sizes and densities.

Android categorizes device screens using two general properties: size and density.
There are four generalized sizes: small, normal, large, xlarge. And four generalized densities: low (ldpi), medium (mdpi), high (hdpi), extra high (xhdpi)

To declare different layouts and bitmaps you'd like to use for different screens, you must place these alternative resources in separate directories, similar to how you do for different language strings.
Also be aware that the screens orientation (landscape or portrait) is considered a variation of screen size, so many apps should revise the layout to optimize the user experience in each orientation.

(Android 3.2 and above supports an advanced method of defining screen sizes that allows you to specify resources for screen sizes based on the minimum width and height in terms of density-independent pixels. This lesson does not cover this new technique.)

# Supporting Different Platform Versions
- How to use APIs available in new versions of Android while continuing to support older versions of Android.

As new versions of Android are released, some style and behaviors may change. To allow your app to take advantage of these changes and ensure that your app fits the style of each user's device, you should set the targetSdkVersion value to match the latest Android version available.


Android provides user experience themes that give apps the look and feel of the underlying operating system. These themes can be applied to your app within the manifest file. By using these built in styles and themes, your app will naturally follow the latest look and feel of Android with each new release.
