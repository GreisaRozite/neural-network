public class Layer {

    private final Neuron[] neurons;

    public Layer(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public double[] forward(double[] inputs) {
        double[] outputs = new double[neurons.length]; // empty array
        for (int i = 0; i < neurons.length; i++) {
            outputs[i] = neurons[i].fireOut(inputs);
        }
        return outputs;
    }

    public int size() {
        return neurons.length;
    } // getter function bcos neurons is private
}
