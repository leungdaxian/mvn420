package org.lyx.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class FoodInfo implements Serializable {
    private int foodId;
    private String foodName;
    private String remark;
    private int foodPrice;
    private String description;
    private String foodImage;

//    @Override
//    public String toString() {
//        return "Food{" +
//                "foodId=" + foodId +
//                ", foodName='" + foodName + '\'' +
//                ", remark='" + remark + '\'' +
//                ", foodPrice=" + foodPrice +
//                ", description='" + description + '\'' +
//                ", foodImage='" + foodImage + '\'' +
//                '}';
//    }

    public FoodInfo(String foodName, String remark) {
        this.foodName = foodName;
        this.remark = remark;
    }

    public FoodInfo(int foodId, String foodName, String remark, int foodPrice, String description, String foodImage) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.remark = remark;
        this.foodPrice = foodPrice;
        this.description = description;
        this.foodImage = foodImage;
    }

    public FoodInfo(String foodName, String remark, int foodPrice, String description, String foodImage) {
        this.foodName = foodName;
        this.remark = remark;
        this.foodPrice = foodPrice;
        this.description = description;
        this.foodImage = foodImage;
    }

    public FoodInfo(String foodName, String remark, int foodPrice, String description) {
        this.foodName = foodName;
        this.remark = remark;
        this.foodPrice = foodPrice;
        this.description = description;
    }

    public FoodInfo(int foodId, String foodName, String remark, int foodPrice, String description) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.remark = remark;
        this.foodPrice = foodPrice;
        this.description = description;
    }

    public FoodInfo() {
    }

//    public int getFoodId() {
//        return foodId;
//    }
//
//    public void setFoodId(int foodId) {
//        this.foodId = foodId;
//    }
//
//    public String getFoodName() {
//        return foodName;
//    }
//
//    public void setFoodName(String foodName) {
//        this.foodName = foodName;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
//
//    public int getFoodPrice() {
//        return foodPrice;
//    }
//
//    public void setFoodPrice(int foodPrice) {
//        this.foodPrice = foodPrice;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getFoodImage() {
//        return foodImage;
//    }
//
//    public void setFoodImage(String foodImage) {
//        this.foodImage = foodImage;
//    }
}
