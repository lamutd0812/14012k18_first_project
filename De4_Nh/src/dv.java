/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My PC
 */
public class dv implements GiaoTiep{
    private int maD;
    private String ten,gia,dv;
    
    public dv(){
        
    }
    public dv(int maD , String ten, String gia, String dv){
        this.maD= maD;
        this.ten = ten;
        this.gia = gia;
        this.dv = dv;
    }

    public int getMaD() {
        return maD;
    }

    public String getTen() {
        return ten;
    }

    public String getGia() {
        return gia;
    }

    public String getDv() {
        return dv;
    }
    
    @Override
    public Object[] toObject(){
        return new Object[]{
            maD , ten , gia , dv
        };
    }
}
