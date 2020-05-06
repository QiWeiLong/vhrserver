package com.qwl.qwlvhr.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Menu implements Serializable {
    private Long id;
    private String url;
    private String path;
    private Object component;
    private String name;
    private String iconCls;
    private Long parentId;
    private Boolean enabled;
    private Meta meta;
    private List<Menu> children;



}
