/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 *
 * @author yoinr
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    
    private int id;
    private String firstname;
    private String lastname;
    private String gender;
    private Date date_of_birth;
    private double salary;
    private String phone_number;
    private String email;
    private String address;
    private byte[] photo;

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0000");
        return df.format(id)+"  -  "+firstname+"  "+lastname;
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    public static List<Employee> getAll() throws Exception {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM tblemployee";
        Statement s = DataConnection.getDataCon().createStatement();
        ResultSet r = s.executeQuery(sql);
        
        int id;
        String firstname;
        String lastname;
        String gender;
        Date date_of_birth;
        double salary;
        String phone_number;
        String email;
        String address;
        byte[] photo;

        while (r.next()) {
            id = r.getInt("id");
            firstname = r.getString(2);
            lastname = r.getString(3);
            gender = r.getString(4);
            date_of_birth = r.getDate(5);
            salary = r.getDouble(6);
            phone_number = r.getString(7);
            email = r.getString(8);
            address = r.getString(9);
            photo = r.getBytes(10);
            employees.add(new Employee(id, firstname, lastname, gender,
                            date_of_birth, salary, phone_number, email, address, photo));
        }

        r.close();
        s.close();
        return employees;

    }

    public Object[] getRow() {
        DecimalFormat df1 =new DecimalFormat("0000");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        DecimalFormat df2 = new DecimalFormat("$#,##0.00");
        return new Object[]{
            df1.format(id),
            firstname,
            lastname,
            gender.equalsIgnoreCase("M")?"Male":"Female",
            sdf.format(date_of_birth),
            df2.format(salary),
            phone_number,
            email,
            address
        };
    }
}
