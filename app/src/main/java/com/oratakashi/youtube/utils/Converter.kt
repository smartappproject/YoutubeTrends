package com.oratakashi.youtube.utils

import android.util.Log
import java.text.DecimalFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

object Converter {
    @Throws(ParseException::class)
    fun dateFormat(date: String, input: String, output: String): String {
        var format = SimpleDateFormat(input, Locale.getDefault())

        var newDate: Date? = format.parse(date)

        format = SimpleDateFormat(output, Locale.getDefault())

        return format.format(newDate!!)
    }

    fun numberConvert(number: Number): String? {
        Log.d("numberConvert", "number : $number")
        val suffix = charArrayOf(' ', 'K', 'M', 'B', 'T', 'P', 'E')
        val numValue: Long = number.toLong()
        val value = floor(log10(numValue.toDouble())).toInt()
        val base = value / 3
        return if (value >= 3 && base < suffix.size) {
            DecimalFormat("#0.0").format(
                numValue / 10.0.pow(base * 3.toDouble())
            ) + suffix[base]
        } else {
            DecimalFormat("#,##0").format(numValue)
        }
    }
}