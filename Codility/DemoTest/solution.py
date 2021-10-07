# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    A.sort();
    num = int(1);

    for x in A:
        while num == x:
            num += 1
    
    return num
