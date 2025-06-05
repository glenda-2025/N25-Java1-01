import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe BeeWorld.
 * 
 * @author Glenda Renata Silva
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,30,35); 
        
        Abelha abelha = new Abelha();
        addObject(abelha,34,199);
        
        Mosca mosca = new Mosca();
        addObject(mosca,30,337);
        
        Mosca mosca2 = new Mosca();
        addObject(mosca2,80,364);
        mosca2.setLocation(83,305);
        
        Mosca mosca3 = new Mosca();
        addObject(mosca3,83,305);
        mosca2.setLocation(85,307);
        
        Mosca mosca4 = new Mosca();
        addObject(mosca4,85,307);
        
        Mosca mosca5 = new Mosca();
        addObject(mosca5,82,357);
        
        Mosca mosca6 = new Mosca();
        addObject(mosca6,148,373);
        
        Mosca mosca7 = new Mosca();
        addObject(mosca7,146,330);
        
        Mosca mosca8 = new Mosca();
        addObject(mosca8,159,292);
        
        Mosca mosca9 = new Mosca();
        addObject(mosca9,212,330);
        mosca2.setLocation(85,305);
        mosca2.setLocation(89,304);
        mosca2.setLocation(224,375);
    }
}
