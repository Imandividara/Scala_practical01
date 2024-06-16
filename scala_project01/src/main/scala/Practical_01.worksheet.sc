//1
def Area(r:Double):Double={
    math.Pi*r*r
}
Area(5)



//2
def temperature(c:Double):Double={
    c*1.8000 + 32.00
}
temperature(35)



//3
def volume(r:Double):Double={
    4/3*math.Pi*r*r*r
}
volume(5)



//4
def bookP(n:Int):Double={
    n*24.95
}
def discount(p:Double):Double={
    p*0.4
}
def price(n:Int):Double={
    bookP(n)-discount(bookP(n))
}
def ship(n:Int):Double={
    if(n<50){
        n*3
    }
    else{
        0.75*(n-50)+(50*3)
    }
}
def finalP(n:Int):Double={
    price(n)+ship(n)
}
finalP(60)



//5
def easyP(x:Int):Int={
    x*8
}
def Tempo(x:Int):Int={
    x*7
}
easyP(2)+Tempo(3)+easyP(2)