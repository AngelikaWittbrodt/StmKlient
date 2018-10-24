/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stmklient;

/**
 *
 * @author angie
 */
public class StmKlient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String i = "3";
            String result = getBinaryImage(i);
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);

        }
    }

    private static String getBinaryImage(java.lang.String i) {
        org.angelika.encoder.ImageEncoder service = new org.angelika.encoder.ImageEncoder();
        org.angelika.encoder.WebEncoder port = service.getWebEncoderPort();
        return port.getBinaryImage(i);
    }

}
