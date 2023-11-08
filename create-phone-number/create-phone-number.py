def create_phone_number(array):
    string1 = ""
    for i in array:
        string1 += str(i)
        
    x = "(" + string1[0:3] + ")" + " " + string1[3:6] + "-" + string1[6:]
    
    return x