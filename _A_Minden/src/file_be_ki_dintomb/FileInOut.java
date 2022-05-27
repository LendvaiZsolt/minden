package file_be_ki_dintomb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileInOut {

	public static void main(String[] args) throws IOException {
		ArrayList<String> nevsorki = new ArrayList<String>();
		File file = new File("nevsor.txt");

		nevsorki.add("Zsolt");
		nevsorki.add("Judit");
		nevsorki.add("Beni");
		nevsorki.add("Dani");
		nevsorki.add("Lóci");

		kiiras(file, nevsorki);

		ArrayList<String> nevsorbe = beolvasas(file);
		lista(nevsorbe);
	}

	private static ArrayList<String> beolvasas(File file) {
		ArrayList<String> nevsorbe = new ArrayList<String>();
		String line;

		try (FileReader filereader = new FileReader(file); BufferedReader bufread = new BufferedReader(filereader)) {
			while ((line = bufread.readLine()) != null) {
				nevsorbe.add(line);
			}
		} catch (IOException e) {
			System.out.println("Hát ez nem jött be.");
		}
		return nevsorbe;

	}

	private static void kiiras(File file, ArrayList<String> nevsor) {

		try (FileWriter fileWriter = new FileWriter(file)) {
			for (String nev : nevsor) {
				fileWriter.write(nev + "\n");
			}
			fileWriter.flush();
		} catch (IOException e) {
			System.out.println("Hát ez nem jó így, hiba van a beolvasás közben.");
		}

	}

	public static void lista(ArrayList<String> nevsor) {
		for (String str : nevsor) {
			System.out.println(str);
		}
	}

}
