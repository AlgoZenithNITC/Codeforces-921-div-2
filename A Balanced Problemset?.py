def solve():
    n, x = map(int, input().split())
    ans = 1
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            z1 = n // i
            if z1 >= x:
                ans = max(ans, i)
            if i >= x:
                ans = max(ans, z1)
    print(ans)

def main():
    t = int(input())
    for _ in range(t):
        solve()

if __name__ == "__main__":
    main()

