public class Main {

    public static void main(String[] args) {

        Activator sigmoid = new Sigmoid();

        Neuron hiddenNeuron1 = new Neuron(new double[]{2.5, -2.3}, 0.1, sigmoid);
        Neuron hiddenNeuron2 = new Neuron(new double[]{-2.2, 2.8}, 0.05, sigmoid);
        Layer hiddenLayer1 = new Layer(new Neuron[]{hiddenNeuron1, hiddenNeuron2});

        Neuron h2_n1 = new Neuron(new double[]{3.5, -2.2}, -0.2, sigmoid);
        Neuron h2_n2 = new Neuron(new double[]{-3.1, 4.6}, 0.1, sigmoid);
        Neuron h2_n3 = new Neuron(new double[]{2.3, 2.4}, 0.0, sigmoid);
        Layer hiddenLayer2 = new Layer(new Neuron[]{h2_n1, h2_n2, h2_n3});

        Neuron outputNeuron = new Neuron(new double[]{5.7, -4.9, 3.5}, -2.9, sigmoid);
        Layer outputLayer = new Layer(new Neuron[]{outputNeuron});

        NeuralNetwork network = new NeuralNetwork(new Layer[]{hiddenLayer1, hiddenLayer2, outputLayer});

        double[][] sampleInputs = {
                {1.0, 0.0},
                {0.0, 1.0},
                {1.0, 1.0},
                {0.0, 0.0}
        };

        System.out.println("Forward propagation demo:");
        for (double[] inputs : sampleInputs) {
            double[] result = network.predict(inputs);
            System.out.println("Input: [" + inputs[0] + ", " + inputs[1] + "] -> Output: " + result[0]);
        }
    }
}
 