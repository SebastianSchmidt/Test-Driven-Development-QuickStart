package io.github.sebastianschmidt.test_driven_development.quick_start;

public class EntryPoint {

    public static void main(final String[] args) {
        new EntryPoint().execute();
    }

    public void execute() {
        final HelloWorld instance = new HelloWorld();
        System.out.println(instance.getMessage());
    }

}
