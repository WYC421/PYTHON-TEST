package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Integer pid;
    private String pname;
    private Integer tno;
    private String remarks;
    private String detail;
    private String pdate;
}
