public class SurfaceArea{
    
    public static double surfaceCircle(double r){
        return 3.14*r*r;
    }
    
    public static double surfaceRectangle(double L, double W){
        return L*W;
        // L = length, W = width
    }
    
    public static double surfaceTriangle(double b, double h){
        return 0.5*b*h;
        // b= base, h = height;
    }
    
    public static void main(String[] args){
        System.out.println("Surface Area circle:" + surfaceCircle(5));
        System.out.println("Surface Area rectangle:" + surfaceRectangle(4, 5));
        System.out.println("Surface Area triangle:" + surfaceTriangle(3,4));
    }
}

