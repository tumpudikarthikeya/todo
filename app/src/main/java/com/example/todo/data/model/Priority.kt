package com.example.todo.data.model

import androidx.compose.ui.graphics.Color
import com.example.todo.ui.theme.HighPriorityColor
import com.example.todo.ui.theme.LowPriorityCoLor
import com.example.todo.ui.theme.MediumPriorityColor
import com.example.todo.ui.theme.NonePriorityColor

enum class Priority(val color : Color) {
    High(HighPriorityColor),
    Medium(MediumPriorityColor),
    Low(LowPriorityCoLor),
    None(NonePriorityColor)
}