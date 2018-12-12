/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ty.meutz
 */
public class SuperClass {
    
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    // LinkedList for the ElectronicVault class
    protected static final LinkedList<ElectronicVault> electronicVault = new LinkedList();
    
}
