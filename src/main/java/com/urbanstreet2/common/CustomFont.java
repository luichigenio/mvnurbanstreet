/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.urbanstreet2.common;
  import java.awt.Font;
import java.io.InputStream;
import java.util.ArrayList;
/**
 *
 * @author LAGV
 */
public  class CustomFont {
  


    private static ArrayList<Font> fonts = new ArrayList<>();;

    public void setFonts() {
        try {
            //fuente 0 Ligth
            InputStream is =  getClass().getResourceAsStream("../../../fonts/AkzidenzGrotesk-LightCond.otf");
            fonts.add(Font.createFont(Font.TRUETYPE_FONT, is));
            //fuente 1 Medium
            is =  getClass().getResourceAsStream("../../../fonts/Akzidenz Grotesk (R) Condensed Medium.ttf");
            //fuente Italic
            fonts.add(Font.createFont(Font.TRUETYPE_FONT, is));
            is =  getClass().getResourceAsStream("../../../fonts/Akzidenz Grotesk (R) Condensed Medium Italic.ttf");
            fonts.add(Font.createFont(Font.TRUETYPE_FONT, is));
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(" No se cargon todas la fuente");
            fonts.add(new Font("Arial", Font.PLAIN, 14));            
        }
  }

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
 */
    public Font getFont( int estilo, float tamanio, int pos)
    {
        
        Font tfont = fonts.get(pos).deriveFont(estilo, tamanio);
        return tfont;
    }
    
    

}

