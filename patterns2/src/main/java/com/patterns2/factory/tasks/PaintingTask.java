package com.patterns2.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean flag;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (!flag) {
            System.out.println("PaintingTask called: " + taskName + ". " + whatToPaint + " in " + color + " color.");
            flag = true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;

    }

    @Override
    public boolean isTaskExecuted() {
        return flag;
    }
}
