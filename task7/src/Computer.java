public class Computer {
    private String cpu; // процессор
    private int ram;    // оперативная память
    private int hdd;    // жёсткий диск
    private String gpu;  // видеокарта

    // Конструктор
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.gpu = builder.gpu;
    }

    // Метод для вывода информации о компьютере
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + "'" +
        ", RAM=" + ram +
                "GB, HDD=" + hdd +
                "GB, GPU='" + gpu + "'" +
        '}';
    }

    // Статический вложенный класс Builder
    public static class Builder {
        private String cpu;
        private int ram;
        private int hdd;
        private String gpu;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
