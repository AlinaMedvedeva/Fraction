package fr;

public class Fraction {
    private int num;
    private int denum;

    //конструктор с параметрами, сделанный интелиджей
    public Fraction(int num, int denum) {
        this.num = num;
        if(denum != 0)
            this.denum = denum;
        else this.denum = 1;
    }

    //конструктор ВСЕГДА называется, как класс
    public Fraction(){
        num = 1;
        denum = 1;
    }
    //1-ый способ вывода объекта на экран
    @Override
    public String toString(){
        return num + "/" + denum;
    }
    //2-ой способ
    public void print(){
        System.out.println(num + "/" + denum);
    }

    public void multyOnKoeff(int koeff){
        num *= koeff;
        if(koeff != 0)
            denum *= koeff;
    }
    public Fraction multyOnFrac(Fraction secondf){
     Fraction result = new Fraction();
     result.num = num * secondf.num;
     result.denum = denum*secondf.denum;
     return result;
    }

    public Fraction slozh(Fraction sec)
    {
        Fraction result = new Fraction();
        int zn = znam(denum, sec.denum);
        int k1 = zn/denum, k2 = zn/sec.denum;
        result.denum = zn;
        result.num = num*k1 + sec.num*k2;
        return result;
    }

    public Fraction vyuch(Fraction sec)
    {
        Fraction result = new Fraction();
        int zn = znam(denum, sec.denum);
        int k1 = zn/denum, k2 = zn/sec.denum;
        result.denum = zn;
        result.num = num*k1 - sec.num*k2;
        return result;
    }

    public int znam(int denum, int sd)
    {
        int b, m, zn;
        if(denum > sd)
        {
            b = denum;
            m = sd;
        }
        else
        {
            b = sd;
            m = denum;
        }
        if(b%m != 0)
            zn = b*m;
        else
            zn = b;
        return zn;
    }
    //геттеры и сеттеры

    //public int getNum() {
       // return num;
    //}

    //public void setNum(int num) {
      //  this.num = num;
    //}

    //public int getDenum() {
      //  return denum;
    //}

    //public void setDenum(int denum) {
    //    if (denum != 0)
      //      this.denum = denum;
    //}


}
