/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My PC
 */
public class kh implements GiaoTiep{
    private int maK;
    private String ten,dc,sdt,loai;
    
    public kh(){
        
    }
    public kh(int maK , String ten, String dc, String sdt, String loai){
        this.maK = maK;
        this.ten = ten;
        this.dc = dc;
        this.sdt = sdt;
        this.loai = loai;
    }

    public int getMaK() {
        return maK;
    }

    public String getTen() {
        return ten;
    }

    public String getDc() {
        return dc;
    }

    public String getSdt() {
        return sdt;
    }

    public String getLoai() {
        return loai;
    }
    
    @Override
    public Object[] toObject(){
        return new Object[]{
            maK , ten , dc , sdt , loai
        };
    }
}
