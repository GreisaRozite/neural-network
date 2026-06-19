public class NeuralNetwork {

    private final Layer[] layers;

    public NeuralNetwork(Layer[] layers) {
        this.layers = layers;
    }

    //forward propagation
    public double[] predict(double[] inputs) {
        double[] currentOutputs = inputs;

        for (Layer layer : layers) {
            currentOutputs = layer.forward(currentOutputs);
        }

        return currentOutputs;
    }
}
