package com.example.myapplication.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val JetnewsShapes = Shapes(
    small = CutCornerShape(topStart = 8.dp),
    medium = CutCornerShape(topStart = 24.dp),
    large = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
)