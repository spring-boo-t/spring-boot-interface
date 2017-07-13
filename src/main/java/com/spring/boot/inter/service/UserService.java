/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author liyj
 * @date 2017年7月11日 下午2:31:20
 * @since V1.0.0
 */
package com.spring.boot.inter.service;

import java.util.List;
import com.spring.boot.entity.UserEntity;

/**
 * TODO
 *
 * @author liyj
 * @date 2017年7月11日 下午2:31:20
 *
 */
public interface UserService {
    
    /*
     * insert
     */
    void insert(UserEntity entity);
    
    /*
     * deleteEntity
     */
    void deleteEntity(UserEntity entity);
    
    /*
     * deleteById
     */
    void deleteById(String id);
    
    /*
     * updateEntity
     */
    void updateEntity(UserEntity entity);
    
    /*
     * updateById
     */
    void updateById(String id);
    
    /*
     * getOne
     */
    UserEntity getOne(String id);
    
    /*
     * getList
     */
    List<UserEntity> getList();
}
