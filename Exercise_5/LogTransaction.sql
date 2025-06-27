CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog(transaction_id, action, log_time)
    VALUES (:NEW.transaction_id, 'INSERT', SYSDATE);
END;
