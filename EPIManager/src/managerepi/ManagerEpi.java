package managerepi;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ManagerEpi {

    public static void main(String[] args) {
        // Criando um Worker
        Worker worker = new Worker("Corona");

        // Lista de EPIs
        List<Epi> listEpi = new ArrayList<>();

        listEpi.add(new Epi(0,"Face Mask", 30));      // Máscara de proteção com validade de 30 dias
        listEpi.add(new Epi(listEpi.size(), "Safety Gloves", 90));  // Luvas de segurança com validade de 90 dias
        listEpi.add(new Epi(listEpi.size(), "Helmet", 365));        // Capacete com validade de 1 ano (365 dias)
        listEpi.add(new Epi(listEpi.size(), "Boots", 180));         // Botas com validade de 180 dias
        listEpi.add(new Epi(listEpi.size(), "Safety Vest", 60));    // Colete de segurança com validade de 60 dias
        listEpi.add(new Epi(listEpi.size(), "Goggles", 120));

        // add epi no worker
        for (Epi epi : listEpi) {
            worker.addEpi(epi);
        }

        // Exibindo todos os EPIs em formato de tabela
        System.out.println("\n************************************");
        System.out.println("List of all EPIs:");
        System.out.println("************************************");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", "EPI Code", "Name", "Created Date", "Expiration Date", "Updated Date");
        System.out.println("--------------------------------------------------------------");

        // Definindo o formato para data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Exibe cada EPI na tabela
        for (Epi epi : worker.getAllEpi()) {
            String createdDate = epi.createdDate.format(formatter);
            String expirationDate = epi.expirationDate.format(formatter);
            String updatedDate = epi.updatedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));


            // Exibindo as informações do EPI com formatação
            System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", epi.getCode(), epi.getName(), createdDate, expirationDate, updatedDate);
        }

        // Separando a exibição dos EPIs do próximo teste
        System.out.println("\n--------------------------------------------------------------");

        System.out.printf("%-15s %-20s %-15s\n", "EPI Code", "Name", "Updated Date");
        System.out.println("--------------------------------------------------------------");
        worker.updateEpi(worker.getAllEpi().getFirst().code, "novo", 10, EPIUpdateReason.EXPIRED);
        Epi epi = worker.getAllEpi().getFirst();
        System.out.printf("%-15s %-20s %-15s\n", epi.getCode(), epi.getName(), epi.updatedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));


        // Separando a exibição dos EPIs do próximo teste
        System.out.println("\n--------------------------------------------------------------");

        // Testando o método clockIn
        System.out.println("Testing clock-in for Worker:");
        worker.clockIn();  // Marca o horário de entrada do Worker

        // Separando o teste de clock-in
        System.out.println("\n--------------------------------------------------------------");
    }
}
