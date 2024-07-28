package com.cms;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public static DocumentFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "word":
                return new WordDocumentFactory();
            case "pdf":
                return new PdfDocumentFactory();
            case "text":
                return new TextDocumentFactory();
            default:
                throw new IllegalArgumentException("Unknown document type");
        }
    }
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class TextDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
