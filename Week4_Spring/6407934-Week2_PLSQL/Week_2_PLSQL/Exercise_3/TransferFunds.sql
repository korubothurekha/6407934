DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN from_acc INT,
    IN to_acc INT,
    IN amt DECIMAL(10,2)
)
BEGIN
    DECLARE curr_balance DECIMAL(10,2);

    SELECT balance INTO curr_balance FROM accounts WHERE account_id = from_acc;

    IF curr_balance >= amt THEN
        START TRANSACTION;
            UPDATE accounts SET balance = balance - amt WHERE account_id = from_acc;
            UPDATE accounts SET balance = balance + amt WHERE account_id = to_acc;
        COMMIT;
    ELSE
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient funds';
    END IF;
END //

DELIMITER ;
