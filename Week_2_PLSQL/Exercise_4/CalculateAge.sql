CREATE OR REPLACE FUNCTION calculateAge (
    dob VARCHAR2
) RETURN NUMBER
IS
    result NUMBER;
    dob_date DATE;
BEGIN
    -- Convert input string to date
    dob_date := TO_DATE(dob, 'YYYY-MM-DD');

    -- Calculate age by subtracting years
    result := TRUNC(MONTHS_BETWEEN(SYSDATE, dob_date) / 12);

    RETURN result;
END;
