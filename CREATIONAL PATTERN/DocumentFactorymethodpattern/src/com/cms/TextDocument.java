package com.cms;

public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Text document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Text document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Text document.");
    }
}
