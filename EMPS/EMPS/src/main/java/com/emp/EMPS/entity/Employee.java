package com.emp.EMPS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "EMP_System")
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) 
        private int Id;
        private String name;
        private String address;
        private String email;
        private Integer phoneNo;
        private int salary;

        public Employee(){
                super();
        }

        public int getId() {
                return Id;
            }
            
            public void setId(int Id) {
                this.Id = Id;
            }
            
            public String getName() {
                return name;
            }
            
            public void setName(String name) {
                this.name = name;
            }
            
            public String getAddress() {
                return address;
            }
            
            public void setAddress(String address) {
                this.address = address;
            }
            
            public String getEmail() {
                return email;
            }
            
            public void setEmail(String email) {
                this.email = email;
            }
            
            public Integer getPhoneNo() {
                return phoneNo;
            }
            
            public void setPhoneNo(Integer phoneNo) {
                this.phoneNo = phoneNo;
            }
            
            public int getSalary() {
                return salary;
            }
            
            public void setSalary(int salary) {
                this.salary = salary;
            }

            public String tooString(){
                return "Employee [id="+ Id +",name="+name+",email="+email+",phoneNo="+phoneNo+",salary="+salary+"]";
            }





}
