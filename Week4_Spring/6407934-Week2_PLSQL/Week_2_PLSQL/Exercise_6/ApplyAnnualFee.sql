DECLARE
    CURSOR acc_cursor IS
        SELECT account_id, balance FROM Accounts;

    v_account_id NUMBER;
    v_balance    NUMBER;
    annual_fee   CONSTANT NUMBER := 500;
BEGIN
    OPEN acc_cursor;
    LOOP
        FETCH acc_cursor INTO v_account_id, v_balance;
        EXIT WHEN acc_cursor%NOTFOUND;

        UPDATE Accounts
        SET balance = balance - annual_fee
        WHERE account_id = v_account_id;
    END LOOP;
    CLOSE acc_cursor;

    COMMIT;
END;
