DECLARE
    CURSOR txn_cursor IS
        SELECT customer_id, transaction_id, amount, transaction_date
        FROM Transactions
        WHERE TRUNC(transaction_date, 'MM') = TRUNC(SYSDATE, 'MM');

    v_customer_id     NUMBER;
    v_transaction_id  NUMBER;
    v_amount          NUMBER;
    v_transaction_date DATE;
BEGIN
    OPEN txn_cursor;
    LOOP
        FETCH txn_cursor INTO v_customer_id, v_transaction_id, v_amount, v_transaction_date;
        EXIT WHEN txn_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer: ' || v_customer_id || 
                             ', Txn ID: ' || v_transaction_id || 
                             ', Amount: ' || v_amount || 
                             ', Date: ' || v_transaction_date);
    END LOOP;
    CLOSE txn_cursor;
END;
