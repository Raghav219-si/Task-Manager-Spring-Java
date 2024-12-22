package com.scaler.task_manager_spring_java.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class TaskEntity {
    private int id;
    private String title;
    private String description;
    private Date deadline;
    private boolean completed;

//    public void setId(int id){
//        this.id = id;
//    }
//    public void setTitle(String title){
//        this.title = title;
//    }
//
//    public void setDescription(String description){
//        this.description = description;
//    }
//
//    public void setDeadline(Date deadline){
//        this.deadline = deadline;
//    }
//    public void setStatus(boolean status){
//        this.status = status;
//    }
//
//    public int getId(){
//        return this.id;
//    }
//    public String getTitle(){
//        return this.title;
//    }
//    public String getDescription(){
//        return this.description;
//    }
//    public Date getDeadline(){
//        return this.deadline;
//    }
//    public boolean getStatus(){
//        return this.status;
//    }
}
