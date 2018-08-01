package c.verbswithexample.multipledevicescreenlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /* Screen size
    *   Screen density [dpi - dots per inch]
    *   screen orientation [ landscape & portrait ]
    *   screen resolution [ half hd or full hd ]
    *   pixels [px]
    *   density-independent pixel [dp, dip]
    *   scale-independent pixel [sp]
    * */

    /* screen size
    * small 2 to 3.7
    * normal 3.7 to 4.3
    * large 4 to 7
    * xlarage 7 to 10.0
    *
    * screen resolution
    *   half hd 720 * 1280 pixels
    *   full hd 1080 to 1920 pixels
    *   quarter hd or ultra hd
    * */

    /*screen density
    *  dpi dots per inch
    *  low [ldpi] 120dpi mean 1 inch mean 120 dots
    *  medium [mdpi] 160dpi mean 1 inch
    *  high [hdpi] 240 dpi mean 1 inch
    *  Extra high [xhdpi] 320 dip 1 inch
    *  xx high [xxhdpi] 480 dpi 1 inch
    *  xxx high [xxxhdpi] 640 dpi 1 inch
    *
    *  dots per inch (dpi)
    *   quantity of pixels within a give physical area
    *   mdpi : medium density of pixels per inch
    *   hdpi : high density of pixels per inch
    * */

    /* pixel [px]
    * one physical dot on screen represents a pixel
    * density-independent pixel [dp or dip both are same]
    * pixel unit that is independent of density of the device screen
    * used to define layout or views dimension
    * scale-independent pixel [sp]
    * similar to dp but used for textview size
    * */

    /* formula
    *  px = dp * (dpi  160)
    *
    *  for ldpi [120dpi], 1dp = ?
    *  px = 1dp * (120dpi / 160)
    *  px = 0.75px
    *
    *
    * for mdpi [160dpi] , 1dp = ?
    *
    *  px = 1dp * (160dpi / 160)
    *  px = 1px
    *
    *
    * for hdpi [240dpi] , 1dp = ?
    *
    *  px = 1dp * (240dpi / 160)
    *  px = 1.5px
    *
    * for xhdpi [320dpi] , 1dp = ?
    *
    *  px = 1dp * (320dpi / 160)
    *  px = 2px
    *
    *  for xxhdpi [480dpi] 1 dp = 3px
    *  for xxxhdp [640dpi] 1 dp = 4px
    * */

    /*
    *  text size micro 12sp
    *  text size small 14sp
    *  text size medium 18sp
    *  text size large 22sp
    * */

    /*
    * drawable-mdpi     // bitmap for medium-density
    * drawable-hdpi     // bitmap for high-density
    * drawable-xhdpi    // bitmap for extra-high-density
    * drawable-xxhdpi   // bitmap for extra-extra-high-density
    * drawable-xxxhdpi
    * */

    /*
    * layout/mylayout.xml               // layout for normal screen size (default)
    * layout-large/mylayout.xml         // layout for large screen size
    * layout-xlarge/mylayout.xml        // layout for extra-large screen size
    * layout-xlarge-land/mylayout.xml   // layout for extra-large in landscape orientation screen size
    *   layout-sw600dp/mylayout.xml     // for 7 tablets (600dp wide and bigger )
    *   layout-sw720dp/mylayout.xml     // for 10 tablets (720dp wide and bigger )
    *
    *   layout-w720dp/mylayout.xml     // multi-pane (any screen with 600dp available width or more)
    *
    *   sw                                      w                       h
    *   smallest possible width/height          available width         available height
    *
    *       portrait                            landscape
    *   device a    360dp * 640dp               640dp * 360dp
    *   device a    480dp * 853dp               853dp * 480p
    *   device a    600dp * 960dp               960dp * 6000dp
    *
    *   layout-sw360dp  // for all devices that are at least 360dp wide or bigger
    *                   //  >= [device a, device b, device c]
    *
    *   layout-sw600dp  // for all devices that are at least 600dp wide or bigger
    *                   // sw >= 600dp device c only
    *
    *   layout-w480dp   // for all device that have 480dp width or more
    *                   // w >= 480dp [device b, device c in portait]
    *                   // w >= 480dp [device a , device b, device c in landscape]
    *
    *   layout-h480dp   // for all devices tht have 480dp height or more
    *                       h >= 480dp [device a, device b, device c in portrait]
    *                       h >= 480dp [device b, device c, in landscape]
    *
    * */


    /*
    * sw, h and w are available in android 3.2 [api-13] and above version
    * for lower api levels such as api 7 layout aliases
    * compatibility for lower apis
    * reduces layout maintenance overhead
    * */

    /*
    * for smartphone -> layout and layout-land
    *
    * for tablets of 7 screen size -> layout-sw600dp-port
    * for tablets of 7 screen size -> layout-sw600dp-land
    *
    * for tablets of 10 screen size -> layout-sw720dp-port
    * for tablets of 10 screen size -> layout-sw720dp-land
    *
    * using layout aliases for smartphone
    *   layout and values       -> for all api
    *   values-sw600dp-port     -> 3.2 onwords [api 13+]
    *   values-sw600dp-land     -> 3.2 onwords [api 13+]
    *
    *   provide backward compatibility
    *   values-xlarge-port     -> 3.2 below [api 7+]
    *   values-xlarge-land     -> 3.2 below [api 7+]
    *
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
