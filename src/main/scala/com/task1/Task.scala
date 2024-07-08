package com.task1

import java.time.LocalDate

case class TaskOne(id: Int, description: String, dueDate: Option[LocalDate] = None)