import java.io.*;

//Come cercare un file?
public class Runner {
    public static void main(String[] args) {
        File file = new File("corso38.txt");
        if (file.exists()) {
            System.out.println("Il File Corso38 esiste");

        } else {
            System.out.println("Il File Corso38 non esiste");

            //Creo il file "corso38.txt da File, New, File
        }
        System.out.println(file.getPath()); // Mi stampa il nome del file
        System.out.println(file.getAbsolutePath()); //Mi stampa il persorso del file
        System.out.println(file.isFile()); //Mi dice se è un file
        //Se metto src in "pathname", cioè Cartella, mi darà falso, ma il file esiste

        file.delete(); //Mi elimina il file

        // COME SCRIVERE DENTRO IL MIO FILE e lo CREA, se NON LO TROVA
        try {
            FileWriter writer = new FileWriter("corso38_2.txt"); //Mi suggerisce di creare try/catch
            writer.write("Ciao sono Daniele \n Stò seguendo il corso di Java \n Lezione n°38");
            writer.append("\n Figo!"); //Se voglio aggiungere righe, altrimenti mi sostituisce
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // COME LEGGO IL TESTO DEL MIO FILE

        try {
            FileReader reader = new FileReader("corso38_2.txt");//Mi suggerisce di creare try/catch
            int data = reader.read();
            while(data != -1){ // Legge finchè non è -1, che vuol diree senza caratteri
                System.out.print((char)data); //Devo mettere char, perchè lui legge solo il codice lettera
                // e print (no println), se no non mi va a capo
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}