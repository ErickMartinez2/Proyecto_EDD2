package proyecto_edd2;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {

    public void exportarExcel(File file, int size, ArrayList<Campo> campos) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Hoja1");
                for (int f = 0; f < size; f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < size; c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(campos.get(c).getNombre());
                        }
                    }
                }
                Scanner sc = new Scanner(file);
                sc.useDelimiter("&");
                sc.next();
                sc.useDelimiter(";");
                sc.next();
                ArrayList<String> lista = new ArrayList();
                int cont = 0;
                int filaInicio = 1;
                while (sc.hasNext()) {
                    if (cont == size * 10) {
                        for (int i = 0; i < 10; i++) {
                            Row fila = hoja.createRow(filaInicio);
                            filaInicio++;
                            for (int c = 0; c < size; c++) {
                                Cell celda = fila.createCell(c);
                                if (c < lista.size()) {
                                    celda.setCellValue(lista.get(c));
                                }
                            }
                            for (int j = 0; j < size; j++) {
                                if (!lista.isEmpty()) {
                                    lista.remove(0);
                                }
                            }
                        }
                        cont = 0;
                        lista = new ArrayList();
                    } else {
                        lista.add(sc.next());
                        cont++;
                    }
                    if (!sc.hasNext()) {
                        for (int i = 0; i < cont / size; i++) {
                            Row fila = hoja.createRow(filaInicio);
                            filaInicio++;
                            for (int c = 0; c < size; c++) {
                                Cell celda = fila.createCell(c);
                                if (c < lista.size()) {
                                    celda.setCellValue(lista.get(c));
                                }
                            }
                            for (int j = 0; j < size; j++) {
                                if (!lista.isEmpty()) {
                                    lista.remove(0);
                                }
                            }
                        }
                        cont = 0;
                        lista = new ArrayList();
                    }
                }

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
}
