def find_short(s):
    list1 = s.split()
    l = 0
    current_word = 30
    for i in list1:
        x = len(i)
        if x <current_word:
            l = len(i)
            current_word = len(i)
        
    
    return l # l: shortest word length