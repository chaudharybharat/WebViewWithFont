package com.bharat.webviewfontcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var repsonstr="<p><span style=\"font-family:PlayfairDisplay-Bold\"><strong>For a plant-based alternative:</strong></span></p> <p><span style=\"font-family:WonderUnitSans-Regular\">Replace the eggs with 3 chia or flaxseed eggs.</span></p> <p><span style=\"font-family:PlayfairDisplay-Bold\"><strong>For a dairy-free alternative:</strong></span></p> <p><span style=\"font-family:WonderUnitSans-Regular\">Replace the Greek yoghurt with coconut yoghurt.</span></p> <p><span style=\"font-family:PlayfairDisplay-Bold\"><strong>Use a gluten-free bread, or if you tolerate gluten - opt for sourdough, rye or seeded varieties.</strong></span></p>"
       var note= "<style type=\"text/css\">\n" +
                "  @font-face { \n" +
                "    font-family: 'PlayfairDisplay-Bold';\n" +
                "    src: url('file:///android_asset/fonts/playfairdisplaybold.ttf') format('truetype');\n" +
                //  "    font-weight: normal;\n" +
                //  "    font-style: normal;\n" +
                "  }\n" +
                "  @font-face { \n" +
                "    font-family: 'WonderUnitSans-Regular';\n" +
                "    src: url('file:///android_asset/fonts/wonderunitsansregular.ttf') format('opentype');\n" +
                // "    font-weight: normal;\n" +
                //  "    font-style: normal;\n" +
                "  }\n" +
                "  @font-face { \n" +
                "    font-family: 'talic';\n" +
                "    src: url('file:///android_asset/fonts/wondernnitsansregularitalic.ttf') format('opentype');\n" +
                "    font-weight: normal;\n" +
                "    font-style: normal;\n" +
                "  }\n" +
                "</style>\n" +
                "\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  </head>\n" +
                "  <body>\n" +repsonstr+
                "  </body>\n" +
                "</html>"



        webView.loadDataWithBaseURL(
            "file:///android_asset/fonts",
            note,
            "text/html; charset=UTF-8", null, "about:blank"
        )
    }
}
