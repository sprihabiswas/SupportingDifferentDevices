package skillbooting.supportingdifferentdevices;

import android.app.ActionBar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //You can use the locale qualifier (or any configuration qualifer) on any resource type,
    // such as if you want to provide localized versions of your bitmap drawable. For more information, see Localization.


    /**
     * Android automatically scales your layout in order to properly fit the screen.
     * Thus, your layouts for different screen sizes don't need to worry about the absolute size of UI elements
     * but instead focus on the layout structure that affects the user experience (such as the size or position of important views
     * relative to sibling views).
     */

    /**
     * MyProject/
     res/
     layout/              # default (portrait)
     main.xml
     layout-land/         # landscape
     main.xml
     layout-large/        # large (portrait)
     main.xml
     layout-large-land/   # large landscape
     main.xml
     */

    /**You should always provide bitmap resources that are properly scaled to each of the generalized density buckets: low, medium, high and extra-high density. This helps you achieve good graphical quality and performance on all screen densities.

     To generate these images, you should start with your raw resource in vector format and generate the images for each density using the following size scale:

     xhdpi: 2.0
     hdpi: 1.5
     mdpi: 1.0 (baseline)
     ldpi: 0.75

     This means that if you generate a 200x200 image for xhdpi devices, you should generate the same resource in 150x150 for hdpi, 100x100 for mdpi, and 75x75 for ldpi devices.

     Then, place the files in the appropriate drawable resource directory:

     MyProject/
     res/
     drawable-xhdpi/
     awesomeimage.png
     drawable-hdpi/
     awesomeimage.png
     drawable-mdpi/
     awesomeimage.png
     drawable-ldpi/
     awesomeimage.png
     Any time you reference @drawable/awesomeimage, the system selects the appropriate bitmap based on the screen's density.

     Low-density (ldpi) resources aren’t always necessary. When you provide hdpi assets, the system scales them down by one half to properly fit ldpi screens.*/

    private void setUpActionBar() {
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            ActionBar actionBar = getActionBar();
            if(actionBar!=null)
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    /**
     * When parsing XML resources, Android ignores XML attributes that aren’t supported by the current device.
     * So you can safely use XML attributes that are only supported by newer versions without worrying about older versions
     * breaking when they encounter that code. For example, if you set the targetSdkVersion="11",
     * your app includes the ActionBar by default on Android 3.0 and higher. To then add menu items to the action bar,
     * you need to set android:showAsAction="ifRoom" in your menu resource XML. It's safe to do this in a cross-version XML file,
     * because the older versions of Android simply ignore the showAsAction attribute (that is, you do not need a separate version
     * in res/menu-v11/).
     */

    /**Android provides user experience themes that give apps the look and feel of the underlying operating system.
     * These themes can be applied to your app within the manifest file. By using these built in styles and themes,
     * your app will naturally follow the latest look and feel of Android with each new release.
     *
     */
}
