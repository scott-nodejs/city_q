package com.cityq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("tb_raiders")
@Data
public class Raiders implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private int uid;
    private String title;
    private String description;
    private String thumb;
    private int readCount;
    private int sourceType;
    private String publishTime;
    private String cityName;
    private String jumbUrl;
    private int createTime;
    private int updateTime;
}
