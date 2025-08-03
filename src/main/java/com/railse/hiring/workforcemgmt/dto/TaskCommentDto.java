package com.railse.hiring.workforcemgmt.dto;
import lombok.Data;

@Data
public class TaskCommentDto {
    private Long id;
    private Long taskId;
    private String commentText;
    private Long createdAt;

}
