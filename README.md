# Credit Card Validation

You are asked to implement basic credit card validation. 

## Acceptance Criteria

**Given** a user is attempting to conclude a online purchase **when** a credit card number greater than 16 digits is entered **then** the system indicates the credit card is invalid along with a message "the credit card entered is too long" so that a user understands their mistake and can reenter the credit card number and conclude the transation.

## Luhn's Algorithm

The formula verifies a number against its included check digit, which is usually appended to a partial account number to generate the full account number. This account number must pass the following test:

1. Counting from the check digit, which is the rightmost, and moving left, double the value of every second digit.
1. Sum the digits of the products (e.g., 10 = 1 + 0 = 1, 14 = 1 + 4 = 5) together with the undoubled digits from the original number.
1. If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid according to the Luhn formula; else it is not valid.

Assume an example of an account number "7992739871" that will have a check digit added, making it of the form 7992739871x:

```Account number______:  7___9___9___2___7___3___9___8___7___1___x
Double every other__: 7__18___9___4___7___6___9__16___7___2___x
Sum of digits_______:  7___9___9___4___7___6___9___7___7___2	= 67```

### Obtaining the check digit

The check digit (x) is obtained by computing the sum of digits modulo 10 and then computing 10 less that value modulo 10 (so that's: ((10 - (67 mod 10)) mod 10)). In layman's terms:

1. Compute the sum of the digits (67).
1. Divide by 10, and hold on to the remainder (7).
1. Compute 10 minus the remainder from the previous step (3).
1. The result is your check digit. If the answer is "10", you use 0. (shortcut for computing decimal modulus)

This, makes the full account number read 79927398713.

### Validaing

The account number 79927398713 in turn is validated as follows:

1. Double every second digit, from the rightmost: (1×2) = 2, (8×2) = 16, (3×2) = 6, (2×2) = 4, (9×2) = 18
1. Sum all the individual digits (digits in parentheses are the products from Step 1): 3 + (2) + 7 + (1+6) + 9 + (6) + 7 + (4) + 9 + (1+8) + 7 = 70
1. Take the sum modulo 10: 70 mod 10 = 0; the account number is possibly valid.
