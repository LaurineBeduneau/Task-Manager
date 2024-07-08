case class Task(id: Int, description: String, tags: List[String])

class TaskManager {
  private var tasks = List[Task]()

  def addTask(description: String, tags: List[String]): Unit = {
    val nextId = tasks.size + 1
    val newTask = Task(nextId, description, tags)
    tasks = tasks :+ newTask
    println(s"Tâche ajoutée : [${newTask.id}] ${newTask.description} - Tags : ${newTask.tags.mkString(", ")}")
  }

  def listTasks(): Unit = {
    tasks.foreach(task => println(s"[${task.id}] ${task.description} - Tags : ${task.tags.mkString(", ")}"))
  }
}