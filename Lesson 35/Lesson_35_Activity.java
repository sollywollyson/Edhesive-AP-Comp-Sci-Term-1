class Lesson_35_Activity {

    /**
     * Returns a random int between min and max inclusive. Must have two int
     * parameters.
     * 
     * personally, this does a terrible job of explaining what the parameter wants.
     *
     * @param max
     * @param min
     * @return int
     */
    public static int randomize(int fParam, int sParam)
    {
        boolean mode = fParam > sParam;
        int max = mode ? fParam : sParam;
        int min = mode ? sParam : fParam;

        return (int) (Math.random() * (max - min)) + min;
    }

    /**
     * Returns a random int between 0 and max inclusive. Must have one int
     * parameter.
     * 
     * @param max
     * @return int
     */
    public static int randomize(int max)
    {
        return (int) (Math.random() * max);
    }

    /**
     * Returns a random double between min and max. Must have two double parameters.
     * 
     * @param max
     * @param min
     * @return double
     */
    public static double randomize(double fParam, double sParam)
    {
        boolean mode = fParam > sParam;
        double max = mode ? fParam : sParam;
        double min = mode ? sParam : fParam;

        return (int) (Math.random() * (max - min)) + min;
    }

    /**
     * Returns a random double between 0 and max. Must have one double parameter.
     * 
     * @param max
     * @return double
     */
    public static double randomize(double max)
    {
        return Math.random() * max;
    }

    public static void main(String[] args)
    {
        // tests
    }
}