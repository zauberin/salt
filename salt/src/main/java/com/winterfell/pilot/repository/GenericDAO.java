package com.winterfell.pilot.repository;

import java.util.List;

public interface GenericDAO<E, K> {

    public K getTime();
    public void register(E vo);
    public E get(K empNo);
    public List<E> getList();

}
