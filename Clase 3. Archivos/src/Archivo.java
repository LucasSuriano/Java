import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Archivo {
	
	private String nombreArchivo;

	public Archivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	public static void main(String[]args) {
		
		Archivo arch = new Archivo("archivo");
		
		arch.leerArchivoDeEnteros();
		arch.grabarArchivo();
	}
	
	public void leerArchivoDeEnteros() {
		
		Scanner arch = null;
		
		try {
			arch = new Scanner(new File("src/carpeta archivos/" + this.nombreArchivo + ".in"));
			
			while(arch.hasNext()) {
				int n = arch.nextInt();
				System.out.println(n);
			}
			System.out.println("FIN");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			arch.close();
		}
	}
	
	public void grabarArchivo() {
		
		FileWriter arch = null;
		PrintWriter pw = null;
		
		try {
			arch = new FileWriter("src/carpeta archivos/" + this.nombreArchivo + ".out");
			pw = new PrintWriter(arch);
			
			pw.println("Salida");
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			if(arch != null) {
				try {
					arch.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
