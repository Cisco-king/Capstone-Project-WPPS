package com.capstone.jmt.mapper;


import com.capstone.jmt.data.*;
import org.apache.ibatis.annotations.Param;
import sun.rmi.runtime.Log;

import java.util.List;


/**
 * Created by Jabito on 02/17/2017.
 */
public interface ShopMapper {


    LoginUser loadUserByEmail(@Param("email") String email);

    List<LoginUser> getAllUsers();

    List<Material> getAllMaterials();

    List<RefUser> getRefUsers();

    void addUser(@Param("newUser") LoginUser loginUser);

    LoginUser loadUserByEmpId(@Param("empId") String empId);

    void incrementId(@Param("id") int id);

    int getLastId(@Param("id") int id);

//    Double getTotalSalesById(@Param("shopId") String shopId);
//
//    Integer getSalesCount(@Param("shopId") String shopId);
//
//    Integer getTotalRatings(@Param("shopId") String shopId);
//
//    Integer getReviewsCount(@Param("shopId") String shopId);
//
//    String getShopRating(@Param("shopId") String shopId);
//
//    Double getTotalSalesToday(@Param("shopId") String staffOf);
//
//    Integer getInventoryCount(@Param("shopId") String shopId);
//
//    void updateRoundStock(@Param("username") String username, @Param("shopId") String staffOf, @Param("stock") Integer roundStock);
//
//    void updateSlimStock(@Param("username") String username, @Param("shopId") String staffOf, @Param("stock") Integer slimStock);
//
//    void updatePrices(@Param("shop") ShopSalesInformation shop);

}
