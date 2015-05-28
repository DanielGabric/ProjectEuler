//Just calculus
public class ProjectEuler317 {
    public static void main(String[] args) {
        double g = 9.81;
        double V = 20;
        double Y = 100;
        double Ymax = Y+(20*20)/(2*g);
        double t = (-V/Math.sqrt(2*((Y*g)/(V*V)+1)) - Math.sqrt((V*V)/(2*((Y*g)/(V*V)+1))+2*g*Y))/-g;
        double theta = Math.asin(1/Math.sqrt(2*((Y*g)/(V*V)+1)));
        double x = 20*Math.cos(theta)*t;
        double A = -Ymax/(x*x);
        double volume = (Math.PI/A)*(Ymax*Ymax/2 - (Ymax)*(Ymax));
        System.out.println(volume);
    }
} 
