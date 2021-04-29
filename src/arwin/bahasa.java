package arwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Paths;


public class bahasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dataINDONESIA ="dataINDONESIA.txt"; //menyimpan dataINDONESIA.txt ke dalam variabel
		String cINDONESIA= null; //membuat variabel tipe string
		String tINDONESIA= null; //membuat variabel tipe string
		String dataRUSSIAN ="dataRUSSIAN.txt"; //menyimpan dataRUSSIAN.txt ke dalam variabel
		String cRUSSIAN= null; //membuat variabel tipe string
		String tRUSSIAN= null; //membuat variabel tipe string
		String dataSPANISH ="dataSPANISH.txt"; //menyimpan dataSPANISH.txt ke dalam variabel
		String cSPANISH= null; //membuat variabel tipe string
		String tSPANISH= null; //membuat variabel tipe string
		
		try{
			//buat model unigram indonesian
			cINDONESIA = new String(Files.readAllBytes(Paths.get(dataINDONESIA))); //baca file dataINDONESIA.txt
			String kecili = cINDONESIA.toLowerCase(); //mengecilkan semua string
			File dataui = new File("unigramINDONESIA.txt"); //baca file "unigramINDONESIA.txt
			PrintWriter pi = new PrintWriter(new FileWriter(dataui, false)); //simpan data ke file unigramINDONESIA.txt
			pi.println(kecili); //print data
			pi.close(); //tutup
			
			//buat model unigram russian
			cRUSSIAN = new String(Files.readAllBytes(Paths.get(dataRUSSIAN))); //baca file dataRUSSIAN.txt
			String kecilr = cRUSSIAN.toLowerCase(); //mengecilkan semua string
			File dataur = new File("unigramRUSSIAN.txt"); //baca file unigramRUSSIAN.txt
			PrintWriter pr = new PrintWriter(new FileWriter(dataur, false)); //simpan data ke file unigramRUSSIAN.txt
			pr.println(kecilr); //print data
			pr.close(); //tutup
			
			//buat model unigram spanish
			cSPANISH = new String(Files.readAllBytes(Paths.get(dataSPANISH))); //baca file dataSPANISH.txt
			String kecils = cSPANISH.toLowerCase(); //mengecilkan semua string
			File dataus = new File("unigramSPANISH.txt"); //baca file unigramSPANISH.txt
			PrintWriter ps = new PrintWriter(new FileWriter(dataus, false)); //simpan data ke file unigramSPANISH.txt
			ps.println(kecils); //print data
			ps.close(); //tutup
			
			// men set file input menjadi kosong
			File inputnull = new File("input.txt"); //baca file input.txt
			PrintWriter pkalnull = new PrintWriter(new FileWriter(inputnull, false)); //simpan data ke file input.txt
			pkalnull.println(); //print data
			
			// men set file inputPROSES menjadi kosong
			File inputnull2 = new File("inputPROSES.txt"); //baca file inputPROSES.txt
			PrintWriter pkalnull2 = new PrintWriter(new FileWriter(inputnull2, false)); //simpan data ke file inputPROSES.txt
			pkalnull2.println(); //print data
			
			// men set file input_TRIGRAM menjadi kosong
			File inputnull23 = new File("input_TRIGRAM.txt"); //baca file input_TRIGRAM.txt
			PrintWriter pkalnull23 = new PrintWriter(new FileWriter(inputnull23, false)); //simpan data ke file input_TRIGRAM.txt
			pkalnull23.println(); //print data
			
			// men set file input_TRIGRAM_PROSES menjadi kosong
			File inputnull234 = new File("input_TRIGRAM_PROSES.txt"); //baca file input_TRIGRAM_PROSES.txt
			PrintWriter pkalnull234 = new PrintWriter(new FileWriter(inputnull234, false)); //simpan data ke file input_TRIGRAM_PROSES.txt
			pkalnull234.println(); //print data
			
			//split data inputan lalu simpan ke file input
			String kalmat; //buat variabel tipe string
			Scanner kalm = new Scanner(System.in); //buat variabel tipe scanner
			System.out.print("Masukkan kalimat : "); //membuat teks
			kalmat = kalm.nextLine(); //baca line/input
			String kecil2 = kalmat.toLowerCase(); //mengecilkan semua huruf
			String[] fkal = kecil2.split("\\s+"); //split data ke bawah
		
			// membuat perulangan agar semua line yang terdapat di dalam file input.txt terbaca
			for(String hukal : fkal) { //buat perulangan
				File datakal = new File("input.txt"); //baca file input.txt
				PrintWriter pkal = new PrintWriter(new FileWriter(datakal, true)); //simpan data ke file input.txt
				pkal.println(hukal); //print data
				pkal.close(); //tutup
				
				//untuk deteksi 200 string baru, dengan cara mengambil 3 huruf input dari belakang dan menyimpannya ke file input_TRIGRAM.txt,
				//lalu menyamakan dengan string yang ada di file unigramINDONESIA, unigramRUSSIAN, unigramSPANISH dengan fungsi contains.
				//program akan mendeteksi ketika terdapat input dengan 3 huruf dibelakang sama dengan string di file unigram.
				
				//membuat kondisi agar input yang jumlah hurufnya lebih dari 2 bisa terbaca
				if (hukal.length() > 2) { //buat kondisi
					File trig = new File("input_TRIGRAM.txt"); //baca file input_TRIGRAM.txt
					String newworldg = hukal.substring(hukal.length() -3); //ambil 3 huruf input dari belakang pada tiap kata
					PrintWriter pkalgra = new PrintWriter(new FileWriter(trig, true)); //simpan data ke file input_TRIGRAM.txt
					pkalgra.println(newworldg); //print data
					pkalgra.close(); //tutup
				}
			}
			
			File mods2x = new File("input_TRIGRAM.txt"); //baca file input_TRIGRAM.txt
			Scanner scanmods2x = new Scanner(mods2x); //buat variabel tipe scanner
			String getmodi2x = scanmods2x.nextLine(); //baca line
			File modi2 = new File("unigramINDONESIA.txt"); //baca file unigramINDONESIA.txt
			Scanner scanmodi2 = new Scanner(modi2); //buat variabel tipe scanner
			File modr2 = new File("unigramRUSSIAN.txt"); //baca file unigramRUSSIAN.txt
			Scanner scanmodr2 = new Scanner(modr2); //buat variabel tipe scanner
			File mods2 = new File("unigramSPANISH.txt"); //baca file unigramSPANISH.txt
			Scanner scanmods2 = new Scanner(mods2); //buat variabel tipe scanner
			String getmodi2 = scanmodi2.nextLine(); //baca line
			String getmodr2 = scanmodr2.nextLine(); //baca line
			String getmods2 = scanmods2.nextLine(); //baca line
			
			int jumlahBaris  = fkal.length; //mendapatkan jumlah baris
	    	
			//membuat perulangan sebanyak jumlah baris
		    for(int i=0;i<jumlahBaris;i++){ //buat perulangan
		    	
		    	//mencari kata yang sama di antara 2 file dengan menngunakan fungsi contains
		    	boolean i2x =getmodi2.contains(getmodi2x); //cari kata yang sama di antara file input_TRIGRAM.txt dengan unigramINDONESIA.txt 
		    	boolean r2x =getmodr2.contains(getmodi2x); //cari kata yang sama di antara file input_TRIGRAM.txt dengan unigramRUSSIAN.txt
		    	boolean s2x =getmods2.contains(getmodi2x); //cari kata yang sama di antara file input_TRIGRAM.txt dengan unigramSPANISH.txt
		    	String text1 = fkal[i]; //simpan input ke variabel
		    	boolean i2 = getmodi2.contains(text1); //cari kata yang sama di antara input dengan unigramINDONESIA.txt 
				boolean r2 = getmodr2.contains(text1); //cari kata yang sama di antara input dengan unigramRUSSIAN.txt
				boolean s2 = getmods2.contains(text1); //cari kata yang sama di antara input dengan unigramSPANISH.txt
				
					if (i2){ //jika variabel i2 benar, maka
						String indonesia = "indonesian"; //buat variabel berisikan teks indonesian
						File dataindonesia = new File("inputPROSES.txt"); //baca file inputPROSES.txt
						PrintWriter prindonesia = new PrintWriter(new FileWriter(dataindonesia, true)); //simpan data ke file inputPROSES.txt
						prindonesia.println(indonesia); //print data
						prindonesia.close(); // tutup
			
						BufferedReader listi = new BufferedReader (new FileReader("inputPROSES.txt")); //baca file inputPROSES.txt dengan fungsi BufferedReader
					    boolean hasdi = true; //buat variabel tipe boolean bernilai true
					    String linei; //buat variabel tipe string
					    Set<String> linesi = new HashSet<String>(); //cari nilai yang sama/double, dengan fungsi HashSet 
					    while ((linei = listi.readLine()) != null) { //buat perulangan while dengan membaca file inputPROSES.txt
					    	if (linesi.contains(linei)) { //buat kondisi jika ada nilai yang sama di file inputPROSES.txt
					    		hasdi = false; 
					    	}
					    	linesi.add(linei); //membaca semua nilai yang sama di file inputPROSES.txt
					    }
				    	if (hasdi) { //jika variabel hasdi true, maka
				    		File dataindonesiaI = new File("inputHASIL.txt"); //baca file inputHASIL.txt
							PrintWriter prindonesiaI = new PrintWriter(new FileWriter(dataindonesiaI, false)); //simpan data ke file inputHASIL.txt
							prindonesiaI.println(indonesia); //print data
							prindonesiaI.close(); //tutup
							File dataindonesiaI2 = new File("inputHASIL.txt"); //baca file inputHASIL.txt
							Scanner scanmods2I = new Scanner(dataindonesiaI2); //buat variabel tipe scanner
							String getmodi2I = scanmods2I.nextLine(); //baca line
							System.out.println(getmodi2I); //print text yang ada di file inputHASIL.txt ke dalam console
					    }
					} else if (i2x) {  //jika variabel i2x benar, maka
						String indones = "indonesian"; //buat variabel berisikan teks indonesian
						File dataindx = new File("input_TRIGRAM_PROSES.txt"); //baca file input_TRIGRAM_PROSES.txt
						PrintWriter prindx = new PrintWriter(new FileWriter(dataindx, true)); //simpan data ke file input_TRIGRAM_PROSES.txt
						prindx.println(indones);//print data
						prindx.close();// tutup
		
						BufferedReader lists = new BufferedReader (new FileReader("input_TRIGRAM_PROSES.txt"));//baca file input_TRIGRAM_PROSES.txt dengan fungsi BufferedReader
					    boolean hasds = true;//buat variabel tipe boolean bernilai true
					    String lines;//buat variabel tipe string
					    Set<String> liness = new HashSet<String>();//cari nilai yang sama/double, dengan fungsi HashSet 
					    while ((lines = lists.readLine()) != null) {//buat perulangan while dengan membaca file input_TRIGRAM_PROSES.txt
					    	if (liness.contains(lines)) {//buat kondisi jika ada nilai yang sama di file input_TRIGRAM_PROSES.txt
					    		hasds = false;
					    	}
					    	liness.add(lines);  //membaca semua nilai yang sama di file input_TRIGRAM_PROSES.txt
					    }
				    	if (hasds) { //jika variabel hasds true, maka
				    		File dataspanishS = new File("input_TRIGRAM_HASIL.txt");//baca file input_TRIGRAM_HASIL.txt
							PrintWriter prspanishS = new PrintWriter(new FileWriter(dataspanishS, false));//simpan data ke file input_TRIGRAM_HASIL.txt
							prspanishS.println(indones);//print data
							prspanishS.close();//tutup
							File dataspanishS2 = new File("input_TRIGRAM_HASIL.txt");//baca file input_TRIGRAM_HASIL.txt
							Scanner scanmods2S = new Scanner(dataspanishS2);//buat variabel tipe scanner
							String getmodi2S = scanmods2S.nextLine();//baca line
							System.out.println(getmodi2S);//print text yang ada di file  input_TRIGRAM_HASIL.txt ke dalam console
					    } 
					} else if (r2){//jika variabel r2 benar, maka
						String russian = "russian"; //buat variabel berisikan teks russian
						File datarussian = new File("inputPROSES.txt");//baca file inputPROSES.txt
						PrintWriter prrussian = new PrintWriter(new FileWriter(datarussian, true));//simpan data ke file inputPROSES.txt
						prrussian.println(russian);//print data
						prrussian.close();// tutup
			
						BufferedReader listr = new BufferedReader (new FileReader("inputPROSES.txt"));//baca file inputPROSES.txt dengan fungsi BufferedReader
					    boolean hasdr = true;//buat variabel tipe boolean bernilai true
					    String liner;//buat variabel tipe string
					    Set<String> linesr = new HashSet<String>();//cari nilai yang sama/double, dengan fungsi HashSet 
					    while ((liner = listr.readLine()) != null) {//buat perulangan while dengan membaca file inputPROSES.txt
					    	if (linesr.contains(liner)) {//buat kondisi jika ada nilai yang sama di file inputPROSES.txt
					    		hasdr = false;
					    	}
					    	linesr.add(liner);//membaca semua nilai yang sama di file inputPROSES.txt
					    }
					    if (hasdr) {//jika variabel hasdr true, maka
					    	File datarussianR = new File("inputHASIL.txt");//baca file inputHASIL.txt
							PrintWriter prrussianR = new PrintWriter(new FileWriter(datarussianR, false));//simpan data ke file inputHASIL.txt
							prrussianR.println(russian);//print data
							prrussianR.close();//tutup
							File datarussianR2 = new File("inputHASIL.txt");//baca file inputHASIL.txt
							Scanner scanmods2R = new Scanner(datarussianR2);//buat variabel tipe scanner
							String getmodi2R = scanmods2R.nextLine();//baca line
							System.out.println(getmodi2R);//print text yang ada di file  inputHASIL.txt ke dalam console
					    } 
					} else if (r2x){//jika variabel r2x benar, maka
						String russi = "russian";//buat variabel berisikan teks russian
						File datarusx = new File("input_TRIGRAM_PROSES.txt");//baca file input_TRIGRAM_PROSES.txt
						PrintWriter prrusxc = new PrintWriter(new FileWriter(datarusx, true));//simpan data ke file input_TRIGRAM_PROSES.txt
						prrusxc.println(russi);//print data
						prrusxc.close();// tutup
						
						BufferedReader lists = new BufferedReader (new FileReader("input_TRIGRAM_PROSES.txt"));//baca file input_TRIGRAM_PROSES.txt dengan fungsi BufferedReader
					    boolean hasds = true;//buat variabel tipe boolean bernilai true
					    String lines;//buat variabel tipe string
					    Set<String> liness = new HashSet<String>();//cari nilai yang sama/double, dengan fungsi HashSet 
					    while ((lines = lists.readLine()) != null) {//buat perulangan while dengan membaca file input_TRIGRAM_PROSES.txt
					    	if (liness.contains(lines)) {//buat kondisi jika ada nilai yang sama di file input_TRIGRAM_PROSES.txt
					    		hasds = false;
					    	}
					    	liness.add(lines); //membaca semua nilai yang sama di file input_TRIGRAM_PROSES.txt
					    }
				    	if (hasds) {//jika variabel hasds true, maka
				    		File dataspanishS = new File("input_TRIGRAM_HASIL.txt");//baca file input_TRIGRAM_HASIL.txt
							PrintWriter prspanishS = new PrintWriter(new FileWriter(dataspanishS, false));//simpan data ke file input_TRIGRAM_HASIL.txt
							prspanishS.println(russi);//print data
							prspanishS.close();//tutup
							File dataspanishS2 = new File("input_TRIGRAM_HASIL.txt");//baca file input_TRIGRAM_HASIL.txt
							Scanner scanmods2S = new Scanner(dataspanishS2);//buat variabel tipe scanner
							String getmodi2S = scanmods2S.nextLine();//baca line
							System.out.println(getmodi2S);//print text yang ada di file  input_TRIGRAM_HASIL.txt ke dalam console
					    } 
					} else if (s2){//jika variabel s2 benar, maka
						String spanish = "spanish"; //buat variabel berisikan teks spanish
						File dataspanish = new File("inputPROSES.txt");//baca file inputPROSES.txt
						PrintWriter prspanish = new PrintWriter(new FileWriter(dataspanish, true));//simpan data ke file inputPROSES.txt
						prspanish.println(spanish);//print data
						prspanish.close();// tutup
				
						BufferedReader lists = new BufferedReader (new FileReader("inputPROSES.txt"));//baca file inputPROSES.txt dengan fungsi BufferedReader
					    boolean hasds = true;//buat variabel tipe boolean bernilai true
					    String lines;//buat variabel tipe string
					    Set<String> liness = new HashSet<String>();//cari nilai yang sama/double, dengan fungsi HashSet 
					    while ((lines = lists.readLine()) != null) {//buat perulangan while dengan membaca file inputPROSES.txt
					    	if (liness.contains(lines)) {
					    		hasds = false;
					    	}
					    	liness.add(lines); //membaca semua nilai yang sama di file  inputPROSES.txt
					    }
				    	if (hasds) {//jika variabel hasds true, maka
				    		File dataspanishS = new File("inputHASIL.txt");//baca file inputHASIL.txt
							PrintWriter prspanishS = new PrintWriter(new FileWriter(dataspanishS, false));//simpan data ke file inputHASIL.txt
							prspanishS.println(spanish);//print data
							prspanishS.close();//tutup
							File dataspanishS2 = new File("inputHASIL.txt");//baca file inputHASIL.txt
							Scanner scanmods2S = new Scanner(dataspanishS2);//buat variabel tipe scanner
							String getmodi2S = scanmods2S.nextLine();//baca line
							System.out.println(getmodi2S);//print text yang ada di file  inputHASIL.txt ke dalam console
					    } 
					} else if(s2x) {//jika variabel s2x benar, maka
						String spani = "spanish"; //buat variabel berisikan teks spanish
						File dataspax = new File("input_TRIGRAM_PROSES.txt");//baca file input_TRIGRAM_PROSES.txt
						PrintWriter prspaxc = new PrintWriter(new FileWriter(dataspax, true));//simpan data ke file input_TRIGRAM_PROSES.txt
						prspaxc.println(spani);//print data
						prspaxc.close();// tutup
						
						BufferedReader lists = new BufferedReader (new FileReader("input_TRIGRAM_PROSES.txt"));//baca file input_TRIGRAM_PROSES.txt dengan fungsi BufferedReader
					    boolean hasds = true;//buat variabel tipe boolean bernilai true
					    String lines;//buat variabel tipe string
					    Set<String> liness = new HashSet<String>();//cari nilai yang sama/double, dengan fungsi HashSet 
					    while ((lines = lists.readLine()) != null) {//buat perulangan while dengan membaca file input_TRIGRAM_PROSES.txt
					    	if (liness.contains(lines)) {
					    		hasds = false;
					    	}
					    	liness.add(lines); //membaca semua nilai yang sama di file input_TRIGRAM_PROSES.txt
					    }
				    	if (hasds) {//jika variabel hasds true, maka
				    		File dataspanishS = new File("input_TRIGRAM_HASIL.txt");//baca file input_TRIGRAM_HASIL.txt
							PrintWriter prspanishS = new PrintWriter(new FileWriter(dataspanishS, false));//simpan data ke file input_TRIGRAM_HASIL.txt
							prspanishS.println(spani);//print data
							prspanishS.close();//tutup
							File dataspanishS2 = new File("input_TRIGRAM_HASIL.txt");//baca file input_TRIGRAM_HASIL.txt
							Scanner scanmods2S = new Scanner(dataspanishS2);//buat variabel tipe scanner
							String getmodi2S = scanmods2S.nextLine();//baca line
							System.out.println(getmodi2S);//print text yang ada di file input_TRIGRAM_HASIL.txt ke dalam console
					    } 
					}
				
		    }
		    
			//	CATATAN
		    //kenapa pake split karena user hanya melakukan input sekali
			//jadi data harus di split kebawah agar kata per line dapat di fumgsi contains dengan data model unigram
			//setelah di run, file input akan di kosongkan lalu di split 
			//kenapa saat file dikosongkan tidak di close, agar datanya corrupt /tidak ada enter diawal
			//lalu di simpan ke file input dengan nilai true,
			//kenapa true karena data akan di tumpuk(true) bukan di timpa(false)
			//karena jika ditimpa(false) maka hanya akan terbaca line terakhir
			//kenapa hanya line terakhir yag terbaca, karena sebelumnya datanya di split kebawah
		  
		}catch(Exception e)
			{
			//System.out.println("rusak");
			}
		

	}
}


