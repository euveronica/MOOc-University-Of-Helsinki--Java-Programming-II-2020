/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class LiquidContainers2 {
    public static void main(String[] args) {
        Container container = new Container();
System.out.println(container);

container.add(50);
System.out.println(container);
System.out.println(container.contains());

container.remove(60);
System.out.println(container);

container.add(200);
System.out.println(container);
    }
    
}
