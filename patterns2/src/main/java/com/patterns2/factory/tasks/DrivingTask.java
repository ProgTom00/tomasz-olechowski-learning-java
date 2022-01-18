package com.patterns2.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean flag;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (!flag) {
            System.out.println("DrivingTask called: " + taskName + ". Using vehicle " + using + " to " + where + ".");
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
