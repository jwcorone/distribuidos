/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacliente;

public class XmppTest {
    
    public static void main(String[] args) throws Exception {
        
        String username = "cliente_tres";
        String password = "tres";
        
        XmppManager xmppManager = new XmppManager("localhost", 5222);
        
        xmppManager.init();
        xmppManager.performLogin(username, password);
        xmppManager.setStatus(true, "Hello everyone");
        
        /*
        String buddyJID = "cliente_uno@dev-laptop/Spark";
        String buddyName = "otromas"; 
        xmppManager.createEntry(buddyJID, buddyName);
        */
        xmppManager.sendMessage("Hello mate", "cliente_uno@dev-laptop");
        
        boolean isRunning = true;
        
        while (isRunning) {
            Thread.sleep(50);
        }
        
        xmppManager.destroy();
        
    }

}