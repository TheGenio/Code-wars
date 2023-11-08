def order(sentence):
    str1 = ""
    list1 = sentence.split()
    
    for i in range (1,10):
        for x in list1:
            if str(i) in x: 
                str1 = str1 + " " + x 
    
    return str1.strip()