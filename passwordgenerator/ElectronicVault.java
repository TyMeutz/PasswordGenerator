/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

/**
 *
 * @author ty.meutz
 */
public class ElectronicVault implements InfoInterface{

    char[] password;
    String account;
    
    public ElectronicVault(String Account, char[] Password){

        this.password = Password;
        this.account = Account;
    }

    @Override
    public String getAccount(){
        return account;
    }
    @Override
    public char[] getPassword(){
    return password;
    
    }


}

