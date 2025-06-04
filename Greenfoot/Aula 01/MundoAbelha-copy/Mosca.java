import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a Classe Mosca
 * 
 * @author Glenda Renata 
 * @version 2025-06-03
 */
public class Mosca extends Actor
{
    /**
     * Act - Método responsável pelas ações das moscas quando
     * os botões ACT ou Run são pressionados
     */
    public void act()
    {
        // Add your action code here.
        move(1); 
        turn(-1);
    }
}
