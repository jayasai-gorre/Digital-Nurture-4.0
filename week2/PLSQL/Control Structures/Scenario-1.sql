-- Create the Customers table
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    InterestRate NUMBER
);

-- Insert customer records
INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (101, 'Anil', 70, 6);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (102, 'Ramesh', 63, 5);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (103, 'Karthik', 55, 4);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (104, 'Suresh', 66, 7);

INSERT INTO Customers (CustomerID, Name, Age, InterestRate)
VALUES (105, 'Raj', 42, 4);

COMMIT;

-- Enable DBMS_OUTPUT
SET SERVEROUTPUT ON;

-- PL/SQL block to update InterestRate for senior customers
DECLARE
    CURSOR senior_customers IS
        SELECT CustomerID, InterestRate
        FROM Customers
        WHERE Age >= 65;

    v_adjustedRate NUMBER;

BEGIN
    FOR cust_rec IN senior_customers LOOP   
        v_adjustedRate := cust_rec.InterestRate - 0.5;

        UPDATE Customers
        SET InterestRate = v_adjustedRate
        WHERE CustomerID = cust_rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('CustomerID: ' || cust_rec.CustomerID || 
                             ' | New InterestRate: ' || v_adjustedRate);
    END LOOP;

    COMMIT;
END;
/
