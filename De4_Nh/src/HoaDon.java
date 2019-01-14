/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My PC
 */
public class HoaDon implements GiaoTiep{
    private kh k;
    private dv d;
    private int sl;
    
    public HoaDon(){
        
    }
    public HoaDon(kh k , dv d , int sl){
        this.k = k;
        this.d = d;
        this.sl = sl;
    }

    public kh getK() {
        return k;
    }

    public dv getD() {
        return d;
    }

    public int getSl() {
        return sl;
    }
    
    @Override
    public Object[] toObject(){
        return new Object[]{
            k.getMaK() , k.getTen() , d.getMaD() ,d.getTen() , sl
        };
    }
}
