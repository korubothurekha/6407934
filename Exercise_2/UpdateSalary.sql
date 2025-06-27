

BEGIN
    UPDATE employees
    SET salary = salary * 1.1
    WHERE emp_id = 1001;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Employee ID not found.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Salary updated.');
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/
