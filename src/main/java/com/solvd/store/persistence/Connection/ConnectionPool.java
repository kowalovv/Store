package com.solvd.store.persistence.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class ConnectionPool {

    private static volatile BlockingQueue<Connection> pool;
    private static final int poolSize = 5;
    private static final Semaphore semaphore = new Semaphore(poolSize);

    private ConnectionPool() {
    }

    public static BlockingQueue<Connection> getPool() {
        if (pool == null) {
            synchronized (ConnectionPool.class) {
                if (pool == null) {
                    pool = new ArrayBlockingQueue<>(poolSize);
                    for (int i = 0; i < poolSize; i++) {
                        pool.offer(createConnection());
                    }
                }
            }
        }
        return pool;
    }

    public static Connection acquireConnection() throws InterruptedException, SQLException {
        Connection connection = getPool().poll();
        if (connection == null) {
            throw new IllegalStateException("Connection pool is empty");
        }
        semaphore.acquire();
        return connection;
    }

    public static void releaseConnection(Connection connection) {
        if (connection != null) {
            pool.offer(connection);
            semaphore.release();
        }
    }

    private static Connection createConnection() {
        try {
            Config config = new Config();
            String url = config.getUrl();
            String user = config.getUser();
            String password = config.getPasswd();

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating connection", e);
        }
    }
}