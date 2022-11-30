/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;

import model.Task;

/**
 *
 * @author jairo
 */
public class TarefasDialogScreen extends javax.swing.JDialog {

    
    
    TaskController taskController;
    Project project; // vai ser instanciado o obj project, o qual a tarefa pertence
    
    // contrutor
    public TarefasDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        taskController = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTarefas = new javax.swing.JPanel();
        jLabeltitulo = new javax.swing.JLabel();
        botaoAddTarefa = new javax.swing.JLabel();
        jPanelPropriedadesTarefas = new javax.swing.JPanel();
        jLabelNomeTarefa = new javax.swing.JLabel();
        jTextFieldNomeTarefa = new javax.swing.JTextField();
        jLabelDescricaoTarefa = new javax.swing.JLabel();
        jScrollPaneDescricaoTarefa = new javax.swing.JScrollPane();
        jTextAreaDescricaoTarefa = new javax.swing.JTextArea();
        jLabelPrazo = new javax.swing.JLabel();
        jFormattedTextFieldPrazo = new javax.swing.JFormattedTextField();
        jLabelNotas = new javax.swing.JLabel();
        jScrollPaneNotas = new javax.swing.JScrollPane();
        jTextAreaNotasTarefas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTarefas.setBackground(new java.awt.Color(0, 153, 51));

        jLabeltitulo.setText("Tarefas");

        botaoAddTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoAddTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        botaoAddTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAddTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTarefasLayout = new javax.swing.GroupLayout(jPanelTarefas);
        jPanelTarefas.setLayout(jPanelTarefasLayout);
        jPanelTarefasLayout.setHorizontalGroup(
            jPanelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAddTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTarefasLayout.setVerticalGroup(
            jPanelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAddTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(jPanelTarefasLayout.createSequentialGroup()
                        .addComponent(jLabeltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanelPropriedadesTarefas.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNomeTarefa.setText("Nome");

        jTextFieldNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelDescricaoTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescricaoTarefa.setText("Descrição");

        jTextAreaDescricaoTarefa.setColumns(20);
        jTextAreaDescricaoTarefa.setRows(5);
        jScrollPaneDescricaoTarefa.setViewportView(jTextAreaDescricaoTarefa);

        jLabelPrazo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrazo.setText("Prazo");

        jFormattedTextFieldPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabelNotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotas.setText("Notas");

        jTextAreaNotasTarefas.setColumns(20);
        jTextAreaNotasTarefas.setRows(5);
        jScrollPaneNotas.setViewportView(jTextAreaNotasTarefas);

        javax.swing.GroupLayout jPanelPropriedadesTarefasLayout = new javax.swing.GroupLayout(jPanelPropriedadesTarefas);
        jPanelPropriedadesTarefas.setLayout(jPanelPropriedadesTarefasLayout);
        jPanelPropriedadesTarefasLayout.setHorizontalGroup(
            jPanelPropriedadesTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadesTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPropriedadesTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeTarefa)
                    .addComponent(jLabelDescricaoTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDescricaoTarefa)
                    .addComponent(jLabelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneNotas)
                    .addGroup(jPanelPropriedadesTarefasLayout.createSequentialGroup()
                        .addComponent(jLabelPrazo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFormattedTextFieldPrazo))
                .addContainerGap())
        );
        jPanelPropriedadesTarefasLayout.setVerticalGroup(
            jPanelPropriedadesTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadesTarefasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelNomeTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabelDescricaoTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescricaoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabelPrazo)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabelNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPropriedadesTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPropriedadesTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAddTarefaMouseClicked
        // TODO add your handling code here:
       
        
        try {
             Task task = new Task();
            task.setIdProject(5); // aqui sera setado o ID do projeto ao qual a tarefa pertence
            
            task.setNome(jTextFieldNomeTarefa.getText());
            task.setDescricao(jTextAreaDescricaoTarefa.getText());
            task.setObservacao(jTextAreaNotasTarefas.getText());
            task.setCompletada(false);
       
             
            // data de criação tem que ser convertida para ser armazenada
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");// chamei a class que formata uma string para o formato dd/mm/aaaa
            Date prazo = null; // criei uma variavel do tipo date, com valor nulo
            prazo = simpleDateFormat.parse(jFormattedTextFieldPrazo.getText());// converti a string data para um dado do tipo date, e a atribui para a variavel prazo do tipo date
            task.setPrazo(prazo);// passei a var prazo para o metodo setPraso que a armazenara na propriedade prazo da class task
                  
            taskController.save(task);
       
            JOptionPane.showMessageDialog(rootPane,"Tarefas cadastradas com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        
        
        
    }//GEN-LAST:event_botaoAddTarefaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TarefasDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarefasDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarefasDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarefasDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TarefasDialogScreen dialog = new TarefasDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoAddTarefa;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrazo;
    private javax.swing.JLabel jLabelDescricaoTarefa;
    private javax.swing.JLabel jLabelNomeTarefa;
    private javax.swing.JLabel jLabelNotas;
    private javax.swing.JLabel jLabelPrazo;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JPanel jPanelPropriedadesTarefas;
    private javax.swing.JPanel jPanelTarefas;
    private javax.swing.JScrollPane jScrollPaneDescricaoTarefa;
    private javax.swing.JScrollPane jScrollPaneNotas;
    private javax.swing.JTextArea jTextAreaDescricaoTarefa;
    private javax.swing.JTextArea jTextAreaNotasTarefas;
    private javax.swing.JTextField jTextFieldNomeTarefa;
    // End of variables declaration//GEN-END:variables

    
     // chamaremos um metodo set da classe project, esse metodo vai atribui a tarefa a um determinado projeto, apartir do idProject, que vai ser chamado atravez desse metodo
    public void setProject(Project project) { 
        this.project = project;
    }

       
    

}
// continuar na aula 15