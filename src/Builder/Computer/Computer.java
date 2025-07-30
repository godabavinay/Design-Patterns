package Builder.Computer;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private boolean isSSD;

    private Computer (Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.isSSD = builder.isSSD;
    }

    public void specs() {
        System.out.println("CPU: " + this.CPU);
        System.out.println("RAM: " + this.RAM + "GB");
        if (this.GPU != null) System.out.println("GPU: " + this.GPU);
        if (this.isSSD) System.out.println("Has SSD: " + this.isSSD);
    }

    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private boolean isSSD;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setSSD(boolean isSSD) {
            this.isSSD = isSSD;
            return this;
        }

        public Computer build() {
            if (this.CPU == null || this.RAM == 0) {
                throw new IllegalStateException("CPU and RAM are required");
            }
            return new Computer(this);
        }
    }
}
