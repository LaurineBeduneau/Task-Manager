case class TaskTag(id: Int, description: String, tags: List[String])

class TaskManagerTag {
  private var tasks = List[TaskTag]()

  def addTask(description: String, tags: List[String]): Unit = {
    val nextId = tasks.size + 1
    val newTask = TaskTag(nextId, description, tags)
    tasks = tasks :+ newTask
    println(s"Tâche ajoutée : [${newTask.id}] ${newTask.description} - Tags : ${newTask.tags.mkString(", ")}")
  }

  def listTasks(): Unit = {
    tasks.foreach(task => println(s"[${task.id}] ${task.description} - Tags : ${task.tags.mkString(", ")}"))
  }
}