package org.example.repository;

import org.example.model.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class DepartmentJDBCDaoTest {

    DepartmentJDBCDao departmentJDBCDao = new DepartmentJDBCDao();

    @Test
    public void getDepartmentTest() throws SQLException {
        List<Department> departments = departmentJDBCDao.getDepartments();
        assertEquals(0, departments.size());
    }


}
