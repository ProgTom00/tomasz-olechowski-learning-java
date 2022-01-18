package com.patterns2.factory.tasks;

public final class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean flag;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (!flag) {
            System.out.println("ShoppingTask called: " + taskName + ". Buying " + whatToBuy + " in amount of " + quantity);
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
