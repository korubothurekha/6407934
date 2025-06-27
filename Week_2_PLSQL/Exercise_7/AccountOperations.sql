CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(p_acc_id NUMBER, p_cust_id NUMBER, p_balance NUMBER);
    PROCEDURE CloseAccount(p_acc_id NUMBER);
    FUNCTION GetTotalCustomerBalance(p_cust_id NUMBER) RETURN NUMBER;
END AccountOperations;

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(p_acc_id NUMBER, p_cust_id NUMBER, p_balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts(account_id, customer_id, balance)
        VALUES (p_acc_id, p_cust_id, p_balance);
    END;

    PROCEDURE CloseAccount(p_acc_id NUMBER) IS
    BEGIN
        DELETE FROM Accounts WHERE account_id = p_acc_id;
    END;

    FUNCTION GetTotalCustomerBalance(p_cust_id NUMBER) RETURN NUMBER IS
        v_total NUMBER;
    BEGIN
        SELECT SUM(balance) INTO v_total FROM Accounts WHERE customer_id = p_cust_id;
        RETURN NVL(v_total, 0);
    END;

END AccountOperations;
