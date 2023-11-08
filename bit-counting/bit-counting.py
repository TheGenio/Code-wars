def count_bits(n):
    n = bin(n)
    count = 0
    for i in n[2:]:
        if int(i) == 1:
            count +=1
            
    
    return count