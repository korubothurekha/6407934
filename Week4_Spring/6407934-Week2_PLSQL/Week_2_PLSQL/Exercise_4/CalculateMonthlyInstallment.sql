CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    loan_amount NUMBER,
    annual_rate NUMBER,
    duration_years NUMBER
) RETURN NUMBER
IS
    r NUMBER; -- Monthly interest rate
    n NUMBER; -- Total months
    emi NUMBER;
BEGIN
    r := annual_rate / (12 * 100);
    n := duration_years * 12;

    IF r = 0 THEN
        emi := loan_amount / n; -- Simple division if interest is 0
    ELSE
        emi := loan_amount * r * POWER(1 + r, n) / (POWER(1 + r, n) - 1);
    END IF;

    RETURN ROUND(emi, 2);
END;
