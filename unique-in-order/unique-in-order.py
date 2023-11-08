def unique_in_order(iterable):
    x = ""
    list1 = []
    for i in iterable:
        if i == x:
            pass
        elif i != x:
            list1.append(i)
            x = i
            
    return list1