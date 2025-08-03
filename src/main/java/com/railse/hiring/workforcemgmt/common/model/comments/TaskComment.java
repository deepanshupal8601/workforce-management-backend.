package com.railse.hiring.workforcemgmt.model.comments;

import lombok.Data;

@Data
public class TaskComment {
    private Long id;
    private Long taskId;
    private String commentText;
    private Long createdAt;
    // optional: private Long userId;
}
