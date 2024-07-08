import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{Button, ListView, TextField}
import scalafx.Includes._

object TaskManagerGUI extends JFXApp {

  val taskManager = new TaskManager()
  val taskListView = new ListView[String]()
  val descriptionField = new TextField()

  stage = new JFXApp.PrimaryStage {
    title = "Gestionnaire de Tâches"
    scene = new Scene(400, 400) {
      val addButton = new Button("Ajouter")
      addButton.setOnAction { _ =>
        val description = descriptionField.text.value
        taskManager.addTask(description)
        updateTaskList()
      }

      val listLabel = new scalafx.scene.control.Label("Liste des Tâches:")
      taskListView.items = taskManager.getTaskDescriptions()

      content = new scalafx.scene.layout.VBox {
        children = Seq(descriptionField, addButton, listLabel, taskListView)
        spacing = 10
        padding = scalafx.geometry.Insets(10)
      }
    }
  }

  def updateTaskList(): Unit = {
    taskListView.items = taskManager.getTaskDescriptions()
  }
}