

DECLARE
    CURSOR vip_cursor IS
        SELECT customer_id
        FROM customers
        WHERE balance > 10000;

BEGIN
    FOR vip_rec IN vip_cursor LOOP
        UPDATE customers
        SET is_vip = 'Y'
        WHERE customer_id = vip_rec.customer_id;
    END LOOP;

    COMMIT;
END;
/
