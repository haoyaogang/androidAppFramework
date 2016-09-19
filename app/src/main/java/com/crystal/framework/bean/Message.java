package com.crystal.framework.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by blackcrystaling on 16-9-19.
 */
@DatabaseTable(tableName = "tb_message")
public class Message {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "title")
    private String title;

    @DatabaseField(columnName = "content")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
