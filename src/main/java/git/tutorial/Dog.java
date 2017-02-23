/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author Meireles
 */
public class Dog extends Animal{

    public Dog() {
    }

    @Override
    public void makeSound() {
        System.out.println("au au");
    }
}