
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My PC
 */
public class IOFile {
    public static ArrayList<kh> docKH (String f){
        ArrayList<kh> listKH = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File(f));
            while(in.hasNext()){
                try {
                    int maK = Integer.parseInt(in.nextLine());
                    if(maK<10000 || maK>99999 ) throw new Exception();
                    String ten = in.nextLine();
                    String dc = in.nextLine();
                    String sdt = in.nextLine();
                    String loai = in.nextLine();
                    kh k = new kh(maK, ten, dc, sdt, loai);
                    listKH.add(k);
                } catch (Exception e) {
                }
            }
           
        } catch (FileNotFoundException e) {
        }
        return listKH;
    }
    
    public static ArrayList<dv> docDV (String f){
        ArrayList<dv> listDV = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File(f));
            while(in.hasNext()){
                try {
                    int maD = Integer.parseInt(in.nextLine());
                    if(maD<100 || maD>999 ) throw new Exception();
                    String tenD = in.nextLine();
                    String gia = in.nextLine();
                    String dv = in.nextLine();
                    dv d = new dv(maD, tenD, gia, dv);
                    listDV.add(d);
                } catch (Exception e) {
                }
            }
           
        } catch (FileNotFoundException e) {
        }
        return listDV;
    }
    
    public static ArrayList<HoaDon> docHD (String f){
        ArrayList<HoaDon> listHD = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File(f));
            while(in.hasNext()){
                try {
                    int maK = Integer.parseInt(in.nextLine());
                    String ten = in.nextLine();
                    String dc = in.nextLine();
                    String sdt = in.nextLine();
                    String loai = in.nextLine();
                    kh k = new kh(maK, ten, dc, sdt, loai);
                    
                    int maD = Integer.parseInt(in.nextLine());
                    String tenD = in.nextLine();
                    String gia = in.nextLine();
                    String dv = in.nextLine();
                    dv d = new dv(maD, tenD, gia, dv);
                    
                    int sl = Integer.parseInt(in.nextLine());
                    
                    HoaDon hd = new HoaDon(k, d, sl);
                    listHD.add(hd);
                } catch (NumberFormatException e) {
                }
            }
           
        } catch (FileNotFoundException e) {
        }
        return listHD;
    }
    
    public static void ghiHD (ArrayList<HoaDon> listHD , String f){
        try{
            PrintWriter pw = new PrintWriter(new File(f));
            for(HoaDon hd : listHD){
                kh k = hd.getK();
                pw.println(k.getMaK());
                pw.println(k.getTen());
                pw.println(k.getDc());
                pw.println(k.getSdt());
                pw.println(k.getLoai());
                
                dv d = hd.getD();
                pw.println(d.getMaD());
                pw.println(d.getTen());
                pw.println(d.getGia());
                pw.println(d.getDv());
                
                pw.println(hd.getSl());
            }
            pw.close();
        }catch(FileNotFoundException e){
        }
    }
}
