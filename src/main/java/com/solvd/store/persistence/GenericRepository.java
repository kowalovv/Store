package com.solvd.store.persistence;

import java.sql.SQLException;
import java.util.List;

public interface GenericRepository <T, V>{

    List<T> getAll() throws SQLException;

    void update(T entity, V id) throws SQLException;

    void remove(V id) throws SQLException;

    T getEntityById (V id) throws SQLException;
}
