package com.karthikProject.cacheImpl_DepartmentService;


import com.karthikProject.cacheImpl_DepartmentService.Controllers.DepartmentController;
import com.karthikProject.cacheImpl_DepartmentService.Exception.NoDepartmantFoundException;
import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Models.DepartmentDTO;
import com.karthikProject.cacheImpl_DepartmentService.Repositories.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CacheImplDepartmentServiceApplicationTests {
    @Autowired
    DepartmentController departmentController;
    DepartmentRepository departmentRepository;


    Department department;
    @BeforeEach
    void testCreateDepartment(){

        department=Department.builder().id(1).name("Computer Science").empId(new ArrayList<>())
                .build();

    }

    @Test
    @DisplayName("Save department using controller")
    @Transactional
    void testSaveDepartmentController(){
        departmentController.save(this.department);
        DepartmentDTO dept;
        dept=departmentController.getDepartmentById(1);
        assertEquals(1,dept.getId());
    }

    @Test
    @Transactional
    @DisplayName("Get Department by ID")
    void testDepartmentByIDService() throws NoDepartmantFoundException {
        DepartmentDTO dept=departmentController.getDepartmentById(1);
        Assert.notNull(dept,"No Objects found");
    }


    @Test
    @DisplayName("Implementation of No Department Found exception")
    @Transactional
    void testGetDepartment() {
        Exception e =Assertions.assertThrows(NoDepartmantFoundException.class,()->{

            departmentController.getDepartmentById(50000);
        });
        assertEquals("No department found with this ID",e.getMessage());
    }

	@Test
	void contextLoads() {
	}

}
