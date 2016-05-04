
***** THIS IS THE README FILE FOR QUESTION 10.16 *****

# How To Run

Step 1: Go to the base directory "401410081".
Step 2: Use "make p2" to compile the source files for this problem.
Step 3: Execute the program with "make run2".

# Details

For this question, most of the files remain unchanged.

The following section describes the differences from the codes in the textbook.

1) Employee.java

In the base class "Employee", some amendments are required to conform to the "Payable" interface.

This code snippet: "implements Payable" is added to the class Declaration of "Employee".

Also, the method "getPaymentAmount()" is added.

However, we can simply call "earnings()" in "getPaymentAmount()".

That is, everytime "getPaymentAmount()" is called with respect to any of the "concrete employees", the corresponding "earnings()" function will be invoked, which ensures the correct calculation of the amount of money.

2) PayableInterfaceTest.java

In this testing source file, the array "payableObjects" needs enlarging because there are 6 objects to be stored inside: 2 invoices, 4 employees of the 4 concrete employee classes each.

Similarly to the code in the textbook, "instanceof" is used to check if encountering "BasePlusCommissionEmployee". If so, the base salary will be increased by 10%.

The rest of the file remains generally the same.