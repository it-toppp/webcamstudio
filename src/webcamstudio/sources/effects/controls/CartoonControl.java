/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CartoonControl.java
 *
 * Created on 2010-01-15, 02:27:51
 */

package webcamstudio.sources.effects.controls;

import webcamstudio.sources.effects.Cartoon;

/**
 *
 * @author pballeux
 */
public class CartoonControl extends javax.swing.JPanel {
    Cartoon effect = null;
    /** Creates new form CartoonControl
     * @param effect */
    public CartoonControl(Cartoon effect) {
        initComponents();
        this.effect = effect;
        slideColorSplit.setValue(effect.getSplitColor());
        slideScale.setValue(effect.getScale());
        slideContourSize.setValue(effect.getContourSize());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        slideScale = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        slideContourSize = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        slideColorSplit = new javax.swing.JSlider();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("webcamstudio/Languages"); // NOI18N
        jLabel1.setText(bundle.getString("CARTOONSTROKE")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        slideScale.setMaximum(255);
        slideScale.setMinimum(1);
        slideScale.setMinorTickSpacing(25);
        slideScale.setPaintLabels(true);
        slideScale.setPaintTicks(true);
        slideScale.setValue(5);
        slideScale.setName("slideScale"); // NOI18N
        slideScale.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideScaleStateChanged(evt);
            }
        });

        jLabel2.setText(bundle.getString("CARTOONCONTOURSIZE")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        slideContourSize.setMaximum(255);
        slideContourSize.setMinorTickSpacing(25);
        slideContourSize.setPaintLabels(true);
        slideContourSize.setPaintTicks(true);
        slideContourSize.setName("slideContourSize"); // NOI18N
        slideContourSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideContourSizeStateChanged(evt);
            }
        });

        jLabel3.setText(bundle.getString("CARTOONCOLORSPLITTER")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        slideColorSplit.setMaximum(255);
        slideColorSplit.setMinimum(1);
        slideColorSplit.setMinorTickSpacing(25);
        slideColorSplit.setPaintLabels(true);
        slideColorSplit.setPaintTicks(true);
        slideColorSplit.setName("slideColorSplit"); // NOI18N
        slideColorSplit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideColorSplitStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(slideColorSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slideContourSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slideScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slideScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(slideContourSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slideColorSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void slideScaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideScaleStateChanged
        effect.setScale(slideScale.getValue());
    }//GEN-LAST:event_slideScaleStateChanged

    private void slideContourSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideContourSizeStateChanged
        effect.setContourSize(slideContourSize.getValue());
    }//GEN-LAST:event_slideContourSizeStateChanged

    private void slideColorSplitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideColorSplitStateChanged
        effect.setSplitColor(slideColorSplit.getValue());
    }//GEN-LAST:event_slideColorSplitStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider slideColorSplit;
    private javax.swing.JSlider slideContourSize;
    private javax.swing.JSlider slideScale;
    // End of variables declaration//GEN-END:variables

}
