public class Main {
    public static void main(String[] args) {
        // Создание объекта Computer с помощью Builder
        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam(32)
                .setHdd(1000)
                .setGpu("NVIDIA GeForce RTX 3080")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam(16)
                .setHdd(256)
                .setGpu("Integrated")
                .build();

        // Вывод информации о созданных компьютерах
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}