public class Sigmoid implements Activator {

    @Override
    public double apply(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }
}






// very negative -> near 0
// 0 -> 0.5
// very positive -> near 1

// returns smth always [0,1]

// S(x) = 1 / (1+e^(-x))
