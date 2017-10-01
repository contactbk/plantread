package com.bala.excelgen.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by Balaji on 1/10/2017.
 */
@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable>
extends Repository<T,ID> {
    /*
      1.Saves the given entity.
      2.Returns the entity identified by the given id.
      3.Returns all entities.
      4.Returns the number of entities.
      5.Deletes the given entity.
      6.Indicates whether an entity with the given id exists.
     */
    <S extends T> S save(S entity);

    Iterable<T> findAll();

    T findOne(ID primaryKey);

    Long count();

    void delete(T entity);

    boolean exists(ID primaryKey);
}