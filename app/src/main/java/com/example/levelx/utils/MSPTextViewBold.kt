package com.example.levelx.utils

import android.app.AppComponentFactory
import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import com.example.levelx.R
import java.security.AccessControlContext

class MSPTextViewBold(context: Context, attrs: AttributeSet):AppCompatTextView(context, attrs){
    init {
        applyFont()
    }

    private fun applyFont(){
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        setTypeface(typeface);
    }

}