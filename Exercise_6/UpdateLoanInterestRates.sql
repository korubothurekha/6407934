DECLARE
    CURSOR loan_cursor IS
        SELECT loan_id, amount FROM Loans;

    v_loan_id NUMBER;
    v_amount  NUMBER;
    new_rate  NUMBER;
BEGIN
    OPEN loan_cursor;
    LOOP
        FETCH loan_cursor INTO v_loan_id, v_amount;
        EXIT WHEN loan_cursor%NOTFOUND;

        IF v_amount > 500000 THEN
            new_rate := 9;
        ELSIF v_amount > 100000 THEN
            new_rate := 10;
        ELSE
            new_rate := 12;
        END IF;

        UPDATE Loans
        SET interest_rate = new_rate
        WHERE loan_id = v_loan_id;
    END LOOP;
    CLOSE loan_cursor;

    COMMIT;
END;
