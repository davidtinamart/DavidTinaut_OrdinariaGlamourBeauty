package org.example;

public class Main {
    public static void main(String[] args) {
        // Instancia document1 con Builder

        Document documento1 = new Document.DocumentBuilder("Documento1", "Legal")
                .setDocumentContent("Legal document content")
                .build();

        //Instancia documento2 con Builder

        Document documento2 = new Document.DocumentBuilder("Documento1", "Financial")
                .setDocumentContent("Financial document content")
                .build();

        System.out.println("Documento 1:");
        System.out.println("ID: " + documento1.getDocumentId());
        System.out.println("Tipo: " + documento1.getDocumentType());
        System.out.println("Contenido: " + documento1.getDocumentContent());

        System.out.println("\nDocumento 2:");
        System.out.println("ID: " + documento2.getDocumentId());
        System.out.println("Tipo: " + documento2.getDocumentType());
        System.out.println("Contenido: " + documento2.getDocumentContent());
    }
}
