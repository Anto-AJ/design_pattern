package com.cms;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = DocumentFactory.getFactory("word");
        Document document = factory.createDocument();
        document.open();
        document.save();
        document.close();

        factory = DocumentFactory.getFactory("pdf");
        document = factory.createDocument();
        document.open();
        document.save();
        document.close();
    }
}
