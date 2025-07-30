package Builder.Computer;

public class main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("i7 13700k")
                .setGPU("RTX 5070")
                .setRAM(32)
                .setSSD(true)
                .build();

        Computer budgerPC = new Computer.Builder()
                .setCPU("i3 10300s")
                .setRAM(4)
                .build();

        System.out.println("Gaming PC specs");
        gamingPC.specs();
        System.out.println();
        System.out.println("Budget PC specs");
        budgerPC.specs();
    }
}
