package com.ananya.tod0application

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "To_Do")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String
)