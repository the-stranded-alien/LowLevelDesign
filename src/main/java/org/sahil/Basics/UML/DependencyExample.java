package org.sahil.Basics.UML;

// Document class (provides content to be printed)
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Printer class (depends on Document to print)
class Printer {
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }
}

// Main class demonstrating Dependency Relationship
public class DependencyExample {
    public static void main(String[] args) {
        Document document = new Document("Hello World");
        Printer printer = new Printer();
        // Printer depends on Document to print its content
        printer.print(document);
    }
}
