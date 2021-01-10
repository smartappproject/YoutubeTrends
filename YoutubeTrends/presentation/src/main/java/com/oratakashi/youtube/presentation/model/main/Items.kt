package com.oratakashi.youtube.presentation.model.main

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Items(
    val id: String = "",
    val publishedAt: String = "",
    val channelId: String = "",
    val title: String = "",
    val description: String = "",
    val channelTitle: String = "",
    val categoryId: String = "",
    val urlMedium: String = "",
    val urlStandard: String = "",
    val viewCount: String = "",
    val likeCount: String = "",
    val dislikeCount: String = "",
    val favoriteCount: String = "",
    val commentCount: String = ""
) : Parcelable
