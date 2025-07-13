

BEGIN
    INSERT INTO customers(customer_id, name)
    VALUES (3001, 'Rekha');

    DBMS_OUTPUT.PUT_LINE('Customer added.');

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Customer already exists.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
