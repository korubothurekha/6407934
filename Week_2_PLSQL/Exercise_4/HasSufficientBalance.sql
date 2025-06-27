CREATE OR REPLACE FUNCTION HasSufficientBalance (
    acc_id NUMBER,
    amt NUMBER
) RETURN BOOLEAN
IS
    curr_balance NUMBER;
BEGIN
    SELECT balance INTO curr_balance FROM accounts WHERE account_id = acc_id;

    IF curr_balance >= amt THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE; -- If account doesn't exist
END;
