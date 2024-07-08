package com.example

import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    val taskManager = new TaskManager()

    var continue = true
    while (continue) {
      println("\n=== Gestionnaire de Tâches ===")
      println("1. Ajouter une tâche")
      println("2. Lister les tâches")
      println("3. Supprimer une tâche")
      println("4. Quitter")
      print("Choisissez une option : ")

      readLine() match {
        case "1" =>
          print("Entrez la description de la tâche : ")
          val description = readLine()
          taskManager.addTask(description)
        case "2" =>
          taskManager.listTasks()
        case "3" =>
          print("Entrez l'ID de la tâche à supprimer : ")
          val id = readLine().toInt
          taskManager.removeTask(id)
        case "4" =>
          continue = false
        case _ =>
          println("Option invalide. Veuillez réessayer.")
      }
    }
  }
}