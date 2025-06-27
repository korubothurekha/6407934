CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    curr_balance NUMBER;
BEGIN
    IF :NEW.type = 'deposit' AND :NEW.amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Deposit amount must be positive');
    ELSIF :NEW.type = 'withdrawal' THEN
        SELECT balance INTO curr_balance FROM Accounts WHERE account_id = :NEW.account_id;

        IF :NEW.amount > curr_balance THEN
            RAISE_APPLICATION_ERROR(-20002, 'Insufficient funds for withdrawal');
        END IF;
    END IF;
END;
