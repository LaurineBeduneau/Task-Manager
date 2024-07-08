package com.task1

import scala.collection.mutable
import java.time.LocalDate
import java.time.format.DateTimeParseException

case class Task(id: Int, description: String, dueDate: Option[LocalDate] = None)

class TaskManager {
  private val tasks = mutable.ListBuffer[Task]()
  private var nextId = 1

  def addTask(description: String, dueDate: Option[LocalDate] = None): Unit = {
    val task = Task(nextId, description, dueDate)
    tasks += task
    nextId += 1
    println(s"Tâche ajoutée : [${task.id}] ${task.description} - Échéance : ${dueDate.getOrElse("Pas de date d'échéance")}")
  }

  def listTasks(): Unit = {
    if (tasks.isEmpty) {
      println("Aucune tâche à afficher.")
    } else {
      println("Liste des tâches :")
      tasks.foreach(task => {
        val dueDateString = task.dueDate.map(_.toString).getOrElse("Pas de date d'échéance")
        println(s"[${task.id}] ${task.description} - Échéance : $dueDateString")
      })
    }
  }

  def removeTask(id: Int): Unit = {
    val index = tasks.indexWhere(_.id == id)
    if (index != -1) {
      val removedTask = tasks.remove(index)
      println(s"Tâche supprimée : [${removedTask.id}] ${removedTask.description}")
    } else {
      println(s"Aucune tâche trouvée avec l'ID : $id")
    }
  }

  // Ajout des fonctionnalités de gestion des dates d'échéance

  def addTaskWithDueDate(description: String, dueDateInput: String): Unit = {
    val dueDate = parseDueDate(dueDateInput)
    addTask(description, dueDate)
  }

  private def parseDueDate(dueDateInput: String): Option[LocalDate] = {
    if (dueDateInput.isEmpty) {
      None
    } else {
      try {
        Some(LocalDate.parse(dueDateInput))
      } catch {
        case e: DateTimeParseException =>
          println("Format de date invalide. Aucune date d'échéance définie.")
          None
      }
    }
  }
}