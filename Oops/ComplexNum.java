class complex{
    int realPart;
    int imagPart;
    public complex(int r, int i){
        realPart=r;
        imagPart=i;
    }

    public static complex add(complex num1, complex num2){
        return new complex((num1.realPart + num2.realPart), (num1.imagPart + num2.imagPart));
    }

    public static complex diff(complex num1, complex num2){
        return new complex((num1.realPart - num2.realPart), (num1.imagPart - num2.imagPart));
    }

    public static complex prod(complex num1, complex num2){
        return new complex(((num1.realPart * num2.realPart)-(num1.imagPart * num2.imagPart)) , ((num1.realPart * num2.imagPart) + (num1.imagPart * num2.realPart)));
    }

    public void printCmpNum(){
        if(realPart==0 && imagPart!=0){
            System.out.println(imagPart+"i");
        }else if(imagPart==0 && realPart!=0){
            System.out.println(realPart);
        }else{
            System.out.println(realPart+"+"+imagPart+"i");
        }
    }
}

public class ComplexNum{
    public static void main(String arg[]){
        complex num1 = new complex(4,5);
        complex num2 = new complex(9,4);

        complex obj1 = complex.add(num1,num2);
        complex obj2 = complex.diff(num1,num2);
        complex obj3 = complex.prod(num1,num2);

        System.out.print("Addition: ");obj1.printCmpNum();
        System.out.print("Difference: ");obj2.printCmpNum();
        System.out.print("Product: ");obj3.printCmpNum();
    }
}