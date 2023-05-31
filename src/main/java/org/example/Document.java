package org.example;

public class Document {
    private String documentId; // Identificador del documento
    private String documentType; // Tipo de documento
    private String documentContent; // Contenido del documento

    private Document(DocumentBuilder builder) {
        this.documentId = builder.documentId;
        this.documentType = builder.documentType;
        this.documentContent = builder.documentContent;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    // Clase interna Builder
    public static class DocumentBuilder {
        private String documentId;
        private String documentType;
        private String documentContent;

        public DocumentBuilder(String documentId, String documentType) {
            this.documentId = documentId;
            this.documentType = documentType;
        }

        public DocumentBuilder setDocumentContent(String documentContent) {
            this.documentContent = documentContent;
            return this;
        }

        public Document build() {
            return new Document(this);
        }
    }
}