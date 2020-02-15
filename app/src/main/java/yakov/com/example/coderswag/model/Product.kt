package yakov.com.example.coderswag.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Product(val title: String, val price: String, val image: String) : Parcelable