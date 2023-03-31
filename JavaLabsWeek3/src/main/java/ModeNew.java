class Mode {

    public static void main(String[] args) {
        // Initialise the dataset from commandline args:
        int n = args.length;
        int[] dataset = new int[n];

        for (int i = 0; i < n; i++) {
            dataset[i] = Integer.parseInt(args[i]);
        }
            
        // Initialise the 'count's'
        int[] counts = new int[10];

        // Do some counting:
        for (int i = 0; i < n; i++) {
            counts[dataset[i]]++;
        }
            
        // Print out the results:
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + i + "s: " + counts[i] + "]");
            
            // Print dots if necessary
            if (counts[i] > 0) {
                System.out.print(" ");
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print(".");
                }
            }
            
            System.out.print("\n");
        }

        // Find the largest value:
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Mode: " + maxIndex);

    }

}
