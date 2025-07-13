public class Main {
    public static void main(String[] args) {
        // Basic Computer with required fields only
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB")
                .build();

        // Gaming Computer with all features
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11")
                .build();

        // Office Computer with selected optional features
        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Ubuntu")
                .build();

        // Show configurations
        basicComputer.showConfiguration();
        gamingComputer.showConfiguration();
        officeComputer.showConfiguration();
    }
}
