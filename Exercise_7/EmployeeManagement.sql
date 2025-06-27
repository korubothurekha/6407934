CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_salary NUMBER);
    PROCEDURE UpdateEmployee(p_id NUMBER, p_name VARCHAR2);
    FUNCTION GetAnnualSalary(p_id NUMBER) RETURN NUMBER;
END EmployeeManagement;

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_salary NUMBER) IS
    BEGIN
        INSERT INTO Employees(emp_id, name, salary)
        VALUES (p_id, p_name, p_salary);
    END;

    PROCEDURE UpdateEmployee(p_id NUMBER, p_name VARCHAR2) IS
    BEGIN
        UPDATE Employees SET name = p_name WHERE emp_id = p_id;
    END;

    FUNCTION GetAnnualSalary(p_id NUMBER) RETURN NUMBER IS
        v_salary NUMBER;
    BEGIN
        SELECT salary INTO v_salary FROM Employees WHERE emp_id = p_id;
        RETURN v_salary * 12;
    END;

END EmployeeManagement;
