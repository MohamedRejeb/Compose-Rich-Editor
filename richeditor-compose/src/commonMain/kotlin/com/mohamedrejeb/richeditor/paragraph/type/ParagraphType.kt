package com.mohamedrejeb.richeditor.paragraph.type

import androidx.compose.ui.text.ParagraphStyle
import com.mohamedrejeb.richeditor.model.RichSpan

interface ParagraphType {

    val style: ParagraphStyle

    val startRichSpan: RichSpan

    fun getNextParagraphType(): ParagraphType

    fun copy(): ParagraphType

    companion object {
        val ParagraphType.startText : String get() = startRichSpan.text
    }
}