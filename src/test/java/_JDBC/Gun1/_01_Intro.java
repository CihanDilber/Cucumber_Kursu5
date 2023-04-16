package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

//    1- bağlantı bilgilerini girdik ve bağlandık
//    2- sorguların çalıştırılacağı ortamı açtık
//    3- sorguyu 2 nolu ortam üzerinde çalıştırdık
//    4- sonuçları gördük

    @Test
    public void test1() throws SQLException {
        String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        // connection aciliyor, fileInputstream gibi , 1. Madde
        Connection connection= DriverManager.getConnection(hostUrl, username, password);  // baglantiya click yaptim

        // sql lerin yazilacagi sayfa, 2. madde
        Statement statement = connection.createStatement();  // sorgulari calistirmak icin sorgu gonderme ortami

        // sorguyu yazdim ve calistirdim
        ResultSet rs=statement.executeQuery("select * from customer");   // sorgu calisti sonuclari nerede? rs de

        // ilk satirimi istiyorsun son satirimi 5. satirimi?
        rs.next();  // siradaki ilk satira gitti

        String firstName =rs.getString("first_name");
        String lastName =rs.getString("last_name");
        System.out.println("1. satirin musteri adi ve soyadi ="+ firstName+" "+lastName);

        rs.next();  // 2. satira

        firstName =rs.getString("first_name");
        lastName =rs.getString("last_name");
        System.out.println("2. satirin musteri adi ve soyadi ="+ firstName+" "+lastName);

        connection.close();


    }
}
