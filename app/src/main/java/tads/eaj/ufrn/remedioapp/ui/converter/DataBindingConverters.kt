package tads.eaj.ufrn.remedioapp.ui.converter

import android.text.TextUtils
import androidx.databinding.InverseMethod

class DataBindingConverters {
    companion object {
        @InverseMethod("convertIntegerToString")
        @JvmStatic
        fun convertStringToInteger(value: String): Float {
            if (TextUtils.isEmpty(value) || !TextUtils.isDigitsOnly(value)) {
                return 0f
            }
            return value.toFloat()
        }

        @JvmStatic
        fun convertIntegerToString(value: Float?): String {
            return value?.toString() ?: ""
        }
    }
}