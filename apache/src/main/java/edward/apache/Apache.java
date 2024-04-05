
package edward.apache;
import edward.apache.service.math;

public class Apache {

    public static void main(String[] args) {
        edward.apache.service.math m=new math();
        double x = m.calcDiscriminante(1, 2, 1);
        
        System.out.println(x);
    }
}
