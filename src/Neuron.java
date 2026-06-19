public class Neuron {

    private final double[] weights;
    private final double bias;
    private final Activator activator;

    public Neuron(double[] weights, double bias, Activator activationFunction) {
        this.weights = weights;
        this.bias = bias;
        this.activator = activationFunction;
    }

    public double fireOut(double[] inputs) {
        if (inputs.length != weights.length) {
            throw new IllegalArgumentException(
                    "Expected " + weights.length + " inputs but got " + inputs.length);
        }

        double weightedSum = 0.0; // initial value

        for (int i = 0; i < inputs.length; i++) {
            weightedSum += inputs[i] * weights[i];
        }

        weightedSum += bias; // adds the bias

        return activator.apply(weightedSum);
    }
}
