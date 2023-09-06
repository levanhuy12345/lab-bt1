package View;


import Common.Library;
import Controller.SortNumber;
import Model.Element;
import View.Menu;
import java.awt.print.Book;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
 public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setSize_array(library.getInt("Enter number you want array", 1, 1000));
        element.setArray(library.createArray(element.getSize_array()));
        new SortNumber(element).run();
    }
}
