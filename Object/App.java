package object;

import java.util.ArrayList;
import java.util.List;

// import object.Computer;
// import object.Desktop;
// import object.Laptop;


public class App {

    public static void main (String[] args) {

        Computer computer = new Computer();
        computer.setCPU("5GHz 8 core");
        computer.setModel("Asus 8000");
        computer.setRAM(32);
        computer.setYear(2024);

        computer.start();
        computer.displaySpec();
        computer.shutdown();

        Computer computer2 = new Computer();
        computer2.start();
        computer2.displaySpec();
        computer2.shutdown();

        Laptop laptop01 = new Laptop();
        laptop01.setCPU("10Ghz 123 core");
        laptop01.setModel("Asus 1200");
        laptop01.setRAM(64);
        laptop01.setYear(2024);
        laptop01.setBattery("11.1V 3S LIPO");
        laptop01.setWeight(3);
        laptop01.setOperatingSystem("Windows");
        laptop01.setScreenSize("15.4.inch OLED");

        Desktop desktop01 = new Desktop("4GHz 8 core", "Alibaba", 16, 2024, 
        "Ubuntu", 5, true);
        desktop01.start();
        desktop01.displaySpec();
        desktop01.shutdown();


        List<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(computer);
        machines.add(computer2);
        machines.add(laptop01);

        for (int i = 0; i < machines.size(); i++) {
            //System.out.printf("%d : %s", i +1, machines.get(i));
            System.out.println("Machine " + i + " : ");
            machines.get(i).displaySpec();
        }


    }
    
}
