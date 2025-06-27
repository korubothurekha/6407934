
DECLARE
    CURSOR cust_cursor IS
        SELECT customer_id
        FROM customers
        WHERE age > 60;

BEGIN
    FOR cust_rec IN cust_cursor LOOP
        UPDATE loans
        SET interest_rate = interest_rate - 1
        WHERE customer_id = cust_rec.customer_id;

    END LOOP;

    COMMIT;
END;
/
