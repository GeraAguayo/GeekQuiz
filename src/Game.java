import javax.swing.JOptionPane;

public class Game {
    int x;
    int points = 0;
    int errorCount = 0;

    public void startGame(){

        //Question1
        String[]question1 = {"Universal Serial Bus", "Universal Strange Bug","Sistema de conexion de archivos", "Una salada banda"};
        x = JOptionPane.showOptionDialog(null,"¿Que significa USB? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question1,"");
        if(x == 0){
            //The player answer correctly
            points = points+ 1;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question2
        String[]question2 = {"Memoria de acceso rapido", "Memoria de acceso aleatorio","Requisito minimo para jugar juegos AAA", "Memoria de almacenamiento secundario"};
        x = JOptionPane.showOptionDialog(null,"¿Que significa memoria RAM? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question2,"");
        if(x == 1){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 3
        String[]question3 = {"Un muro de fuego", "Un antivirus para la web", "Un programa que controla el acceso a la red","Un conector de nodos web"};
        x = JOptionPane.showOptionDialog(null,"¿Que es un Firewall? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question3,"");
        if(x == 2){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 4
        String[]question4 = {"Un sistema operativo", "Un kernel", "Un conjunto de software que forman una distro","Ubuntu"};
        x = JOptionPane.showOptionDialog(null,"¿Que es Linux? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question4,"");
        if(x == 1){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 5
        String[]question5 = {"Una arquitectura de procesador", "Los M1 de apple", "Una empresa asiatica","Un tipo de Bios"};
        x = JOptionPane.showOptionDialog(null,"¿Que es ARM? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question5,"");
        if(x == 0){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 6
        String[]question6 = {"Bill Gates y Microsoft", "Steve Jobs y Apple", "El equipo de investigacion de Xerox Parc","Shigueru Miyamoto"};
        x = JOptionPane.showOptionDialog(null,"¿Quienes fueron los creadores de las interfaces graficas? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question6,"");
        if(x == 2){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 7
        String[]question7 = {"Corren Doom de 1993", "Corren Crysis", "Se hace un benchamark","Usan el hardware en el desierto"};
        x = JOptionPane.showOptionDialog(null,"¿Que se usa regularmente para testear la potencia de un hardware? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question7,"");
        if(x == 2){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 8
        String[]question8 = {"16 bits", "45 bits", "100 bits","8 bits"};
        x = JOptionPane.showOptionDialog(null,"¿Cuantos bits tiene un Byte? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question8,"");
        if(x == 3){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 9
        String[]question9 = {"COBOL", "Java", "C","FORTRAN"};
        x = JOptionPane.showOptionDialog(null,"¿Cual fue el primer lenguaje de programacion? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question9,"");
        if(x == 3){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }

        //Question 10
        String[]question10 = {"Ensamblador", "COBOL", "Lenguaje de maquina"};
        x = JOptionPane.showOptionDialog(null,"¿Cual de estos no es un lenguaje de bajo nivel? ","Geek Quiz",0,JOptionPane.QUESTION_MESSAGE, null,question10,"");
        if(x == 1){
            //The player answer correctly
            points++;
            System.out.println("Correcto");
        }
        else{
            //The player answer wrong
            errorCount++;
            System.out.println("Mal");
        }




        //Final results (Test code)
        JOptionPane.showMessageDialog(null,"Puntuacion final:" +
                "\n" +
                "Aciertos: "+points+
                "\n" +
                "Errores: "+errorCount);




    }
}
