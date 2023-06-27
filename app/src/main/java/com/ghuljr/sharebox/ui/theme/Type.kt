package com.ghuljr.sharebox.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ghuljr.sharebox.R

private val fontFamily = FontFamily(
    Font(R.font.mplus_rounded_black, FontWeight.Black),
    Font(R.font.mplus_rounded_bold, FontWeight.Bold),
    Font(R.font.mplus_rounded_extra_bold, FontWeight.ExtraBold),
    Font(R.font.mplus_rounded_light, FontWeight.Light),
    Font(R.font.mplus_rounded_medium, FontWeight.Medium),
    Font(R.font.mplus_rounded_regular, FontWeight.Normal),
    Font(R.font.mplus_rounded_thin, FontWeight.Thin)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 64.sp,
        fontSize = 57.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 52.sp,
        fontSize = 45.sp
    ),
    displaySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 44.sp,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 40.sp,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 36.sp,
        fontSize = 28.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 32.sp,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 28.sp,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 16.sp,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 16.sp,
        fontSize = 11.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp,
        fontSize = 12.sp
    ),
)