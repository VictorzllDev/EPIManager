package managerepi;

import java.time.format.DateTimeFormatter;

public class ManagerEpi {

    public static void main(String[] args) {
        // Criando um Worker
        Worker worker = new Worker("Corona");

        // Adicionando alguns EPIs
        worker.addEpi("Face Mask", 30);  // Máscara de proteção com validade de 30 dias
        worker.addEpi("Safety Gloves", 90); // Luvas de segurança com validade de 90 dias
        worker.addEpi("Helmet", 365);  // Capacete com validade de 1 ano (365 dias)
        worker.addEpi("Boots", 180);   // Botas com validade de 180 dias
        worker.addEpi("Safety Vest", 60);  // Colete de segurança com validade de 60 dias
        worker.addEpi("Goggles", 120);  // Óculos de proteção com validade de 120 dias

        // Exibindo todos os EPIs em formato de tabela
        System.out.println("\n************************************");
        System.out.println("List of all EPIs:");
        System.out.println("************************************");
        System.out.printf("%-15s %-20s %-15s %-15s\n", "EPI Code", "Name", "Created Date", "Expiration Date");
        System.out.println("--------------------------------------------------------------");

        // Definindo o formato para data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Exibe cada EPI na tabela
        for (Epi epi : worker.getAllEpi()) {
            String createdDate = epi.createdDate.format(formatter);
            String expirationDate = epi.expirationDate.format(formatter);

            // Exibindo as informações do EPI com formatação
            System.out.printf("%-15s %-20s %-15s %-15s\n", epi.getCode(), epi.getName(), createdDate, expirationDate);
        }

        // Separando a exibição dos EPIs do próximo teste
        System.out.println("\n--------------------------------------------------------------");

        // Testando o método clockIn
        System.out.println("Testing clock-in for Worker:");
        worker.clockIn();  // Marca o horário de entrada do Worker

        // Separando o teste de clock-in
        System.out.println("\n--------------------------------------------------------------");
    }
}
