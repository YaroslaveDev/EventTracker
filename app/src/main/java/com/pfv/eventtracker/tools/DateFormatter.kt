package com.pfv.eventtracker.tools

import java.time.format.DateTimeFormatter

fun dateFormatter(pattern: String) = DateTimeFormatter.ofPattern(pattern)