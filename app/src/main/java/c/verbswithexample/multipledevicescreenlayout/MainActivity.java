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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
