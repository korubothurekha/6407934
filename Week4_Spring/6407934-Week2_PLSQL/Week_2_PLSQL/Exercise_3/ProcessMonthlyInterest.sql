DELIMITER //

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'savings';
END //

DELIMITER ;
