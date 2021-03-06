/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package webcamstudio.sources.effects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import webcamstudio.sources.effects.controls.BlockControl;

/**
 *
 * @author pballeux (modified by karl)
 */
public class Block extends Effect{
    private final com.jhlabs.image.BlockFilter filter = new com.jhlabs.image.BlockFilter();
    private int blockSize = 3;
    @Override
    public void applyEffect(BufferedImage img) {
        filter.setBlockSize(blockSize+1);
        int w = img.getWidth();
        int h = img.getHeight();
        Graphics2D buffer = img.createGraphics();
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_INTERPOLATION, 
                           java.awt.RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_RENDERING,
                           java.awt.RenderingHints.VALUE_RENDER_SPEED);
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                           java.awt.RenderingHints.VALUE_ANTIALIAS_OFF);
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING,
                           java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_FRACTIONALMETRICS,
                           java.awt.RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_COLOR_RENDERING,
                           java.awt.RenderingHints.VALUE_COLOR_RENDER_SPEED);
        buffer.setRenderingHint(java.awt.RenderingHints.KEY_DITHERING,
                           java.awt.RenderingHints.VALUE_DITHER_DISABLE);
        BufferedImage temp = filter.filter(img, null);
        buffer.setBackground(new java.awt.Color(0,0,0,0));
        buffer.clearRect(0,0,w,h);
        buffer.drawImage(temp, 0, 0, null);
//        System.out.println("W:"+w+" H:"+h);
        buffer.dispose();
    }

   public void setSize(int value){
       blockSize=value;
   }
   public int getSize(){
       return blockSize;
   }
    @Override
    public boolean needApply(){
        return needApply=true;
    }
    @Override
    public JPanel getControl() {
        return new BlockControl(this);
    }

    @Override
    public void resetFX() {
        blockSize = 3;
    }

}
