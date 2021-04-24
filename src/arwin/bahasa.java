package arwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Paths;


public class bahasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//split text
		String dataINDONESIA ="dataINDONESIA.txt";
		String cINDONESIA= null;
		String dataRUSSIAN ="dataRUSSIAN.txt";
		String cRUSSIAN= null;
		String dataSPANISH ="dataSPANISH.txt";
		String cSPANISH= null;
		try{

			//buat model unigram indonesia
			cINDONESIA = new String(Files.readAllBytes(Paths.get(dataINDONESIA))); //baca file
			String kecili = cINDONESIA.toLowerCase();
			File dataui = new File("unigramINDONESIA.txt");
			PrintWriter pi = new PrintWriter(new FileWriter(dataui, false));
			pi.println(kecili);
			pi.close();
			//buat model unigram russian
			cRUSSIAN = new String(Files.readAllBytes(Paths.get(dataRUSSIAN))); //baca file
			String kecilr = cRUSSIAN.toLowerCase();
			File dataur = new File("unigramRUSSIAN.txt");
			PrintWriter pr = new PrintWriter(new FileWriter(dataur, false));
			pr.println(kecilr);
			pr.close();
			//buat model unigram spanish
			cSPANISH = new String(Files.readAllBytes(Paths.get(dataSPANISH))); //baca file
			String kecils = cSPANISH.toLowerCase();
			File dataus = new File("unigramSPANISH.txt");
			PrintWriter ps = new PrintWriter(new FileWriter(dataus, false));
			ps.println(kecils);
			ps.close();
			
			//kenapa saya pake split karena user hanya melakukan input sekali
			//jadi data harus di split kebawah agar kata per line dapat di contains dg data model unigram
			//setelah di run, file input akan di kosongkan lalu di split 
			//kenapa logika pengosongan file tidak saya close, agar datanya corrupt /tidak ada enter diawal
			//lalu di simpan ke file input dengan true,
			//kenapa true karena data akan di tumpuk(true) bukan di timpa(false)
			//karena jika ditimpa(false) maka hanya akan terbaca line terakhir
			//kenapa hanya line terakhir yag terbaca, karena sebelumnya datanya di split kebawah
			
			// men set file input menjadi kosong
			File inputnull = new File("input.txt");
			PrintWriter pkalnull = new PrintWriter(new FileWriter(inputnull, false));
			pkalnull.println(); //	pkalnull.close();
			// men set file inputPROSES menjadi kosong
			File inputnull2 = new File("inputPROSES.txt");
			PrintWriter pkalnull2 = new PrintWriter(new FileWriter(inputnull2, false));
			pkalnull2.println(); //	pkalnull.close();
						
			//split data inputan lalu simpan ke file input
			String kalmat;
			Scanner kalm = new Scanner(System.in);
			System.out.print("Masukkan kalimat : ");
			kalmat = kalm.nextLine();
			String kecil2 = kalmat.toLowerCase();
			String[] fkal = kecil2.split("\\s+"); //split data dan masukan ke array
			for(String hukal : fkal) {
				File datakal = new File("input.txt");
				PrintWriter pkal = new PrintWriter(new FileWriter(datakal, true));
				pkal.println(hukal);
				pkal.close();
			}
			
			File modi2 = new File("unigramINDONESIA.txt");
			Scanner scanmodi2 = new Scanner(modi2);
			File modr2 = new File("unigramRUSSIAN.txt");
			Scanner scanmodr2 = new Scanner(modr2);
			File mods2 = new File("unigramSPANISH.txt");
			Scanner scanmods2 = new Scanner(mods2);
			String getmodi2 = scanmodi2.nextLine();
			String getmodr2 = scanmodr2.nextLine();
			String getmods2 = scanmods2.nextLine();
			int jumlahBaris  = fkal.length; // Menghitung jumlah baris
		    for(int i=0;i<jumlahBaris;i++){
		    	String text1 = fkal[i];
		    	boolean i2 = getmodi2.contains(text1);
				boolean r2 = getmodr2.contains(text1);
				boolean s2 = getmods2.contains(text1); 
					if (i2){
						String indonesia = "indonesia"; 
						File dataindonesia = new File("inputPROSES.txt");
						PrintWriter prindonesia = new PrintWriter(new FileWriter(dataindonesia, true));
						prindonesia.println(indonesia);
						prindonesia.close();
						
						BufferedReader list = new BufferedReader (new FileReader("inputPROSES.txt"));
					    boolean hasd = true;
					    String line;
					    Set<String> lines = new HashSet<String>();
					    while ((line = list.readLine()) != null) {
					    	if (lines.contains(line)) {
					    		hasd = false;
					    	}
					    	lines.add(line);
					    }
					    if (hasd) {
					    	System.out.println("indonesian");
					    } 
					} else if (r2){
						String russian = "russian"; 
						File datarussian = new File("inputPROSES.txt");
						PrintWriter prrussian = new PrintWriter(new FileWriter(datarussian, true));
						prrussian.println(russian);
						prrussian.close();
						
						BufferedReader list = new BufferedReader (new FileReader("inputPROSES.txt"));
					    boolean hasd = true;
					    String line;
					    Set<String> lines = new HashSet<String>();
					    while ((line = list.readLine()) != null) {
					    	if (lines.contains(line)) {
					    		hasd = false;
					    	}
					    	lines.add(line);
					    }
					    if (hasd) {
					    	System.out.println("russian");
					    } 
					}else if (s2){
						String spanish = "spanish"; 
						File dataspanish = new File("inputPROSES.txt");
						PrintWriter prspanish = new PrintWriter(new FileWriter(dataspanish, true));
						prspanish.println(spanish);
						prspanish.close();
						//System.out.println("spanish");
						
						BufferedReader list = new BufferedReader (new FileReader("inputPROSES.txt"));
					    boolean hasd = true;
					    String line;
					    Set<String> lines = new HashSet<String>();
					    while ((line = list.readLine()) != null) {
					    	if (lines.contains(line)) {
					    		hasd = false;
					    	}
					    	lines.add(line);
					    }
					    if (hasd) {
					    	System.out.println("spanish");
					    }
					}
		    }
			
		}catch(Exception e)
			{
			//System.out.println("rusak");
			}
		

	}
}


