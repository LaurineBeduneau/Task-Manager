package com.example

import scala.collection.mutable

class TaskManager {
  private val tasks = mutable.ListBuffer[Task]()
  private var nextId = 1

  def addTask(description: String): Unit = {
    val task = Task(nextId, description)
    tasks += task
    nextId += 1
    println(s"Tâche ajoutée : [${task.id}] ${task.description}")
  }

  def listTasks(): Unit = {
    if (tasks.isEmpty) {
      println("Aucune tâche à afficher.")
    } else {
      println("Liste des tâches :")
      tasks.foreach(task => println(s"[${task.id}] ${task.description}"))
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
}