def solve():
    n, k, m = map(int, input().split())
    s = input()
    st = set()
    ans = ""
    for i in range(m):
        st.add(s[i])
        if len(st) == k:
            ans += s[i]
            st.clear()
    if len(ans) >= n:
        print("YES")
        return
    else:
        print("NO")
        miss = None
        for i in range(k):
            ch = chr(ord('a') + i)
            if ch not in st:
                miss = ch
        while len(ans) < n:
            ans += miss
        print(ans)
        return

t = int(input())
for _ in range(t):
    solve()

