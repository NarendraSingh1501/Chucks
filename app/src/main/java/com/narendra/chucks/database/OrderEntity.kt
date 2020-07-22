package com.narendra.chucks.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.narendra.chucks.model.FoodItem

@Entity(tableName = "orders")
data class OrderEntity(
    @PrimaryKey val resId: String,
    @ColumnInfo(name = "food_items") val foodItems: String
)
