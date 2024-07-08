package com.example

import org.scalatest.funsuite.AnyFunSuite

class TaskManagerTest extends AnyFunSuite {

  test("addTask should add a task to the list") {
    val taskManager = new TaskManager()
    taskManager.addTask("Test task")

    assert(taskManager.listTasks().contains("[1] Test task"))
  }

  test("removeTask should remove a task from the list") {
    val taskManager = new TaskManager()
    taskManager.addTask("Test task")
    taskManager.removeTask(1)

    assert(!taskManager.listTasks().contains("[1] Test task"))
  }
}