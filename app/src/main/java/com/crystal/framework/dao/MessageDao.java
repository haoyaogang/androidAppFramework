package com.crystal.framework.dao;

import com.crystal.framework.bean.Message;

/**
 * Created by blackcrystaling on 16-9-19.
 */
public class MessageDao extends AbstractDao<Message> {
    public MessageDao(Class<Message> clazz) {
        super(clazz);
    }
}
