package com.cityq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("tb_trade")
@Data
public class Trade implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private int uid;
    private String tradeThumb;
    private String tradeName;
    private String tradeDesc;
    private String tradeUrl;
    private String tradeRank;
    private String tradeCommentCount;
    private String tradeStar;
    private int createTime;
    private int updateTime;
}
