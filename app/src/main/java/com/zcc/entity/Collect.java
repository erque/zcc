package com.zcc.entity;

/**
 * Created by heyzqt on 2016/9/6.
 *
 * 我的收藏对象
 */
public class Collect {

    /**
     * 收藏Id
     */
    private int Id;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 商品Id
     */
    private String businessId;

    /**
     * 收藏时间
     */
    private String collect_time;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(String collect_time) {
        this.collect_time = collect_time;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "Id=" + Id +
                ", userId='" + userId + '\'' +
                ", businessId='" + businessId + '\'' +
                ", collect_time='" + collect_time + '\'' +
                '}';
    }
}
