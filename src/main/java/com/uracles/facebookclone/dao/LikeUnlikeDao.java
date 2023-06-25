package com.uracles.facebookclone.dao;

import com.uracles.facebookclone.utils.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;

//public class LikeUnlikeDao {
//    public static int likePost(int postId, int userId){
//        int status=0;
//        try{
//            Connection databaseconnection = ConnectDatabase.connectionToDatabase();
//            PreparedStatement ps = databaseconnection.prepareStatement(
//                    "insert into LikeUnlikeTable (post_Id,user_Id) values (?,?)");
//            ps.setInt(1, postId);
//            ps.setInt(2, userId);
//
//            status=ps.executeUpdate();
//
//            databaseconnection.close();
//        }catch(Exception ex){ex.printStackTrace();}
//
//        return status;
//    }
//
//    public static int unlikePost(int id){
//        int status=0;
//        try{
//            Connection databaseconnection = ConnectDatabase.connectionToDatabase();
//            PreparedStatement ps= databaseconnection.prepareStatement(
//                    "delete from LikeUnlikeTable where like_Id=?");
//            ps.setInt(1,id);
//            status=ps.executeUpdate();
//
//            databaseconnection.close();
//        }catch(Exception e){e.printStackTrace();}
//
//        return status;
//    }
//}
