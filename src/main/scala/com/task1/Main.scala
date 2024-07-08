package com.task1

import scala.io.StdIn.readLine
import java.time.LocalDate
import java.time.format.DateTimeParseException

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

          print("Entrez la date d'échéance (YYYY-MM-DD) ou appuyez sur Entrée pour aucune : ")
          val dueDateInput = readLine()
          taskManager.addTaskWithDueDate(description, dueDateInput)

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