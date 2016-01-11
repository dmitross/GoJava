public class NegativeSizeException extends Exception {

    public NegativeSizeException(double size) {
    }

    @Override
    public void printStackTrace() {

        System.err.println("[Error]: Size should be >= 0 !");
    }
}
