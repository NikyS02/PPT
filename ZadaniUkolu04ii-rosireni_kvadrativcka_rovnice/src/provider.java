//V textovém souboru budou (jsou) uložena data ve formátu:
//
//a1;b1;c1;x1
//a2;b2;c2;x1;x2;x3
//...
//...
//an;bn;cn;x1;x2
//
//Úkolem je načíst data z textového souboru, provést výpočtu a vygenerovat výstupní soubor ve formátu:
//
//a1;b1;c1;x1:y1
//a2;b2;c2;x1:y1;x2:y2;x3:y3
//...
//...
//an;bn;cn;x1:y1;x2:y2

//Chybové stavy:
//a) Špatný formát dat ve vstupním souboru:
//
//a2;b2;c2
//
//        a2;b2
//
//2,5;PPT;1,4;x1:y1;x2:y2;x3:y3
//
//b) soubor neexistuje
//
//c) oprávnění, nedostatek místa na disku (nedostatek systémových prostředků)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class provider {
//Provider:
	public Double[][] NacteniDat_DataKvadratickeRovnice() {
        Double[][] input = new Double[0][];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\schonova-git\\PPT\\ZadaniUkolu04ii-rosireni_kvadrativcka_rovnice\\src\\input.csv"))) {
            int rows = 0;
            while (br.readLine() != null) rows++;

            input = new Double[rows][];
            String line;

            br.close();

            BufferedReader bdr = new BufferedReader(new FileReader("C:\\schonova-git\\PPT\\ZadaniUkolu04ii-rosireni_kvadrativcka_rovnice\\src\\input.csv"));
            int row = 0;
            // todo: nečte první hodnotu ze souboru
            while ((line = bdr.readLine()) != null) {
                String[] parts = line.split(";");
                Double[] rowData = new Double[parts.length];

                for (int i = 0; i < parts.length; i++) {
                    rowData[i] = Double.parseDouble(parts[i]);
                }
                input[row++] = rowData;
            }
            bdr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    private void VystupData_DataKvadratickeRovnice() {
       /* try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
        } catch (Exception e) {
            System.out.println("Do souboru se nepovedlo zapsat.");
        }*/
    }
    public void execute() {
        NacteniDat_DataKvadratickeRovnice();
        //		pořízení dat (načtení dat)

//		realizace výpočtů:  KvadratickaRovnice(a,b,c) + SpoctiYKvr


//		výstup dat (zápis dat)
        VystupData_DataKvadratickeRovnice();
    }

}
