public class pattern{
    public static void main(String args[]){
        
        // ******************************************************** Pyramid
        int star=5,line,j;
        for(line=1; line<=star; line++){
            for(j=1; j<=line; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        
        // ******************************************************** Inverted Pyramid

        System.out.println();
        star=5;
        for(line=1; line<=star; line++){
            for(j=star; j>=line; j--){
                System.out.print("*  ");
            }
            System.out.println();
        }

        // ******************************************************** Alphabet pyramid

        System.out.println();
        star=5;
        char ch='A';
        for(line=1; line<=star; line++){
            for(j=1; j<=line; j++){
                System.out.print(ch+"  ");
                ch++;
            }
            System.out.println();
        }
        
        // ******************************************************** Decimal number pyramid

        System.out.println();
        star=5;
        for(line=1; line<=star; line++){
            for(j=1; j<=line; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        // ******************************************************** Hallow rectangle

        System.out.println();
        int row=5, cl=row+2;
        for(int i=0; i<row; i++){
            for(j=0; j<cl; j++){
                if(i==0||j==0||i==row-1||j==cl-1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }

        // ******************************************************** partition triangle

        System.out.println();
        star=5;
        for(int i=0; i<star; i++){
            for(j=0; j<star; j++){
                if(i+j==star-1){
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }
            }System.out.println();
        }

        // ******************************************************** Rotated Pyramid

        System.out.println();
        int n=5;
        int nol=1;
        star=1;
        int sp=n-1;
        while(nol<=n){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }

            //stars
            for(int i=1; i<=star; i++){
                System.out.print("* ");
            }

            //line change
            System.out.println();
            nol++;
            star++;
            sp--;
        }
        

         // ******************************************************** Invert Half-Pyramid of Number

        System.out.println();
        n=5;
        nol=1;
        star=n;
        while(nol<=n){
            //stars
            for(int i=1; i<=star; i++){
                System.out.print(i+" ");
            }

            //line change
            System.out.println();
            nol++;
            star--;
        }

        // ******************************************************** Floyd's Triangle Pattern

        System.out.println();
        n=5;
        nol=1;
        star=1;
        int num=1;
        while(nol<=n){
            //stars
            for(int i=1; i<=star; i++){
                System.out.print(num+" ");
                num++;
            }

            //line change
            System.out.println();
            nol++;
            star++;
        }

        // ******************************************************** 0-1 Triangle Pattern

        System.out.println();
        n=5;
        nol=1;
        star=1;
        num=1;
        while(nol<=n){
            //stars
            for(int i=1; i<=star; i++){
                if((nol+i)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }

            //line change
            System.out.println();
            nol++;
            star++;
        }

        // ******************************************************** Butterfly Pattern

        System.out.println();
        n=5;
        nol=1;
        star=2;
        sp=2*n-2;
        while(nol<=n*2){
            //stars
            for(int i=1; i<=star/2;i++){
                System.out.print("* ");
            }
            //space
            for(int i=1; i<=sp;i++){
                System.out.print("  ");
            }
            //stars
            for(int i=1; i<=star/2;i++){
                System.out.print("* ");
            }

            if(nol<=n){
                star+=2;
                sp-=2;
            }
            if(nol>=n){
                star-=2;
                sp+=2;
            }
            //line change
            System.out.println();
            nol++;

        }

         // ******************************************************** Solid Rhombus Pattern

        System.out.println();
        n=5;
        nol=1;
        star=n;
        sp=n-1;
        while(nol<=n){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            //stars
            for(int i=1; i<=star; i++){
                System.out.print("* ");
            }

            //line change
            System.out.println();
            nol++;
            sp--;
        }

        // ******************************************************** Hollow Rhombus Pattern

        System.out.println();
        n=5;
        nol=1;
        star=n;
        sp=n-1;
        while(nol<=n){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            //hollow square pattern
            if(nol==1||nol==n){
                for(int i=1; i<=star; i++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int i=1; i<=star-2; i++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            nol++;
            sp--;
        }

        // ******************************************************** Dimond Pattern

        System.out.println();
        n=5;
        nol=1;
        star=1;
        sp=n-1;
        while(nol<=n*2){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            //stars
            for(int i=1; i<=star; i++){
                System.out.print("* ");
            }

            if(nol<=n){
                sp--;
                star+=2;
            }
            if(nol>=n){
                sp++;
                star-=2;
            }
            System.out.println();
            nol++;
        }

        // ******************************************************** Number Pyramid Pattern

        System.out.println();
        n=5;
        nol=1;
        star=1;
        sp=n-1;
        while(nol<=n){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            //stars
            for(int i=1; i<=star; i++){
                System.out.print(nol+" ");
            }
            System.out.println();
            nol++;
            sp--;
            star+=2;
        }

        // ********************************************************palindrome Number Pattern

        System.out.println();
        n=5;
        nol=1;
        star=1;
        sp=n-1;
        while(nol<=n){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            //stars
            for(int i=1; i<=star; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            nol++;
            sp--;
            star+=2;
        }

    }
}