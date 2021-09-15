import models.ToDoItem;
import utils.PrintView;

import java.util.LinkedList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        // View command line arguments passed to app
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        List<ToDoItem> toDoList = new LinkedList<>();

        ToDoItem newItem1 = new ToDoItem("Build a to do list");
        toDoList.add(newItem1);

        ToDoItem newItem2 = new ToDoItem("Debug the new to do list");
        toDoList.add(newItem2);

        ToDoItem newItem3 = new ToDoItem("enjoy your new to do list!");
        toDoList.add(newItem3);

        for(int i = 0; i < toDoList.size(); i++) {
            PrintView.printMyView(i + ") " + toDoList.get(i).getToDoText());
        }


    }
}
