import java.time.LocalDate

case class Task(id: Int, description: String, dueDate: Option[LocalDate])

class TaskManager {
  private var tasks = List[Task]()

  def addTask(description: String, dueDate: Option[LocalDate]): Unit = {
    val nextId = tasks.size + 1
    val newTask = Task(nextId, description, dueDate)
    tasks = tasks :+ newTask
    println(s"Tâche ajoutée : [${newTask.id}] ${newTask.description}")
  }

  def listTasks(): Unit = {
    tasks.foreach(task => {
      val dueDateString = task.dueDate.map(_.toString).getOrElse("Pas de date d'échéance")
      println(s"[${task.id}] ${task.description} - Échéance : $dueDateString")
    })
  }
}