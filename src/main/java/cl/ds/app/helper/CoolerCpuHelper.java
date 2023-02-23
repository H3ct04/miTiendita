package main.java.cl.ds.app.helper;

import main.java.cl.ds.app.models.CoolerCpu;

public class CoolerCpuHelper {

    public static void main(String[] args) {

        System.out.println(crearCpuVacio());
        System.out.println(crearCpuParametros());



    }

    private static CoolerCpu cpu;



    private static CoolerCpu crearCpuVacio(){
        cpu = new CoolerCpu();
        cpu.setAltura("1.5");
        cpu.setFabricante("Intel");
        cpu.setPeso("31");
        cpu.setRgb("si");
        cpu.setRpm("2200");
        cpu.setTipo("Agua");
        cpu.setRuido("22");
        cpu.setFlujoDeAire("55");
        return cpu;

    }

    private static CoolerCpu crearCpuParametros(){
        cpu = new CoolerCpu(
                "amd",
                "liquido",
                "45",
                "2222",
                "20",
                "12",
                "10",
                "no"
                
        );

        return cpu;

    }

}
