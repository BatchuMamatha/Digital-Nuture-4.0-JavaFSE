package com.task;

public class TaskNode {
    private Task task;
    private TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }

    // Getters and Setters
    public Task getTask() {
        return task;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode next) {
        this.next = next;
    }
}
