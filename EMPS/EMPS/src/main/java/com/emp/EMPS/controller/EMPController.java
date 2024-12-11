package com.emp.EMPS.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.emp.EMPS.entity.Employee;
import com.emp.EMPS.service.EmpService;


import jakarta.servlet.http.HttpSession;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EMPController{
        @Autowired
        private EmpService service;

        @GetMapping("/")
        public String home(Model m){
               List<Employee> emp =service.getAllEmp();
               m.addAttribute("emp", emp);
               return "index";
        }
        
        @GetMapping("/AddEmp")
        public String EmpForm(){
                return "addEMP";
        }
        @PostMapping("/register")
public String empRegister(@ModelAttribute Employee e, HttpSession session) {
    service.addEMP(e); // Save the employee using EmpService
    session.setAttribute("msg", "Employee registered successfully!");
    
    return "redirect:/";
}
@GetMapping("/edit/{Id}")
public String edit(@PathVariable int Id, Model m){
        Employee e = service.getEmpById(Id);
            m.addAttribute("emp", e);


        return "edit";

}
@PostMapping("/update")
public String updateEmp(@ModelAttribute Employee e, HttpSession session) {
    service.addEMP(e);
    session.setAttribute("msg", "Emp Data Update Successfully..");
    return "redirect:/";
}


@GetMapping("/delete/{Id}")
public String deleteEmp(@PathVariable int Id, HttpSession session) {
    service.deleteEmp(Id);
    session.setAttribute("msg", "Emp Data Deleted Successfully..");
    return "redirect:/";
}


}