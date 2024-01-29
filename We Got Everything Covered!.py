# Importing the sys module to read from standard input
import sys

# Reading the number of test cases
t = int(input())

# Processing each test case
for _ in range(t):
    # Reading n and k for the current test case
    n, k = map(int, input().split())
    ans = ""
    # Generating the string based on n and k
    for i in range(n):
        for j in range(k):
            ans += chr(ord('a') + j)
    # Printing the result for the current test case
    print(ans)

