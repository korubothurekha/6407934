
DECLARE
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance FROM accounts WHERE account_id = 101;

    IF v_balance < 500 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance.');
    ELSE
        UPDATE accounts SET balance = balance - 500 WHERE account_id = 101;
        UPDATE accounts SET balance = balance + 500 WHERE account_id = 202;
        DBMS_OUTPUT.PUT_LINE('Transfer successful.');
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error during transfer: ' || SQLERRM);
END;
/
