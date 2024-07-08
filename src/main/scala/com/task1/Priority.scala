object Priority extends Enumeration {
  type Priority = Value
  val Low, Medium, High = Value
}

case class Task(id: Int, description: String, priority: Priority.Priority)

class TaskManager {
  private var tasks = List[Task]()

  def addTask(description: String, priority: Priority.Priority): Unit = {
    val nextId = tasks.size + 1
    val newTask = Task(nextId, description, priority)
    tasks = tasks :+ newTask
    println(s"Tâche ajoutée : [${newTask.id}] ${newTask.description} - Priorité : ${newTask.priority}")
  }

  def listTasks(): Unit = {
    tasks.foreach(task => println(s"[${task.id}] ${task.description} - Priorité : ${task.priority}"))
  }
}