public class ZeroSizeExeption extends Exception {

    public ZeroSizeExeption (double zero) {

    }

    @Override
    public void printStackTrace() {
        System.err.println("[Error]: Size should be more 0 Mb ! ");
    }
}
