package org.example.exceptiongame;


class Service {
    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void execute() throws Exception {
        // Simulate some business logic
        System.out.println("Executing service logic.");
        if (Math.random() > 0.5) {
            throw new Exception("Something went wrong!");
        }
    }
}
