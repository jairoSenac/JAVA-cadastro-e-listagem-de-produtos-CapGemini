/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Task;
import view.ProjetDialogScreen;
import model.Project;
/**
 *
 * @author jairo
 */
public class MainScreen extends javax.swing.JFrame {

    
    // criar instancias dos controladores que vão trazer as informações do DB
    ProjectController projectController;//ok
    TaskController taskController;//ok
    
    DefaultListModel projectModel;//ok
    /* criamos uma instancia de uma classe
     ja existente na biblioteca do java que é a classe  DefaultListModel, do tipo Project,
    e demos a ela o nome de projectModel*/
    
    //construtor
    public MainScreen() {
        initComponents(); //ok
        decorateTableTask(); //ok 
     
        // chamar o metodo que inicia as instancias dos controladores
        inciarDataController();// ok
        
         iniciarComponenteModel();// ok initComponenteModel
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListaSemTarefas = new javax.swing.JPanel();
        notificaSemTarefa = new javax.swing.JLabel();
        orientaAddTarefa = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        Cabeçalho = new javax.swing.JPanel();
        tituloCabeçalho = new javax.swing.JLabel();
        mensgemCabeçalho = new javax.swing.JLabel();
        NavProject = new javax.swing.JPanel();
        tituloNavProject = new javax.swing.JLabel();
        botaoAddProjec = new javax.swing.JLabel();
        NavTarefas = new javax.swing.JPanel();
        tituloNavTarefa = new javax.swing.JLabel();
        botaoAddTarefa = new javax.swing.JLabel();
        colunaListaNomeProjetos = new javax.swing.JPanel();
        jScrollPainelLista = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        ListaDeTarefasAreaPrincipal = new javax.swing.JPanel();
        jScrollPaneTask = new javax.swing.JScrollPane();
        jTableTask = new javax.swing.JTable();

        painelListaSemTarefas.setBackground(new java.awt.Color(255, 255, 255));

        notificaSemTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        notificaSemTarefa.setForeground(new java.awt.Color(0, 153, 51));
        notificaSemTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notificaSemTarefa.setText("Nenhuma tarefa por aqui:D");

        orientaAddTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orientaAddTarefa.setForeground(new java.awt.Color(0, 153, 51));
        orientaAddTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orientaAddTarefa.setText("click no botão \"+\" para adicionar uma nova tarefa");

        icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        javax.swing.GroupLayout painelListaSemTarefasLayout = new javax.swing.GroupLayout(painelListaSemTarefas);
        painelListaSemTarefas.setLayout(painelListaSemTarefasLayout);
        painelListaSemTarefasLayout.setHorizontalGroup(
            painelListaSemTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelListaSemTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelListaSemTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orientaAddTarefa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addComponent(notificaSemTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelListaSemTarefasLayout.setVerticalGroup(
            painelListaSemTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaSemTarefasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orientaAddTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificaSemTarefa)
                .addGap(150, 150, 150))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(800, 800));

        Cabeçalho.setBackground(new java.awt.Color(102, 153, 0));
        Cabeçalho.setForeground(new java.awt.Color(51, 153, 0));

        tituloCabeçalho.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCabeçalho.setForeground(new java.awt.Color(255, 255, 255));
        tituloCabeçalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        tituloCabeçalho.setText("  Todo App");

        mensgemCabeçalho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mensgemCabeçalho.setForeground(new java.awt.Color(255, 255, 255));
        mensgemCabeçalho.setText("Anote tudo, não esquieça de nada");

        javax.swing.GroupLayout CabeçalhoLayout = new javax.swing.GroupLayout(Cabeçalho);
        Cabeçalho.setLayout(CabeçalhoLayout);
        CabeçalhoLayout.setHorizontalGroup(
            CabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeçalhoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(CabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensgemCabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CabeçalhoLayout.setVerticalGroup(
            CabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeçalhoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(tituloCabeçalho)
                .addGap(18, 18, 18)
                .addComponent(mensgemCabeçalho)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        NavProject.setBackground(java.awt.Color.white);

        tituloNavProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloNavProject.setForeground(new java.awt.Color(51, 153, 0));
        tituloNavProject.setText("Projetos");

        botaoAddProjec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoAddProjec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        botaoAddProjec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAddProjecMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NavProjectLayout = new javax.swing.GroupLayout(NavProject);
        NavProject.setLayout(NavProjectLayout);
        NavProjectLayout.setHorizontalGroup(
            NavProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloNavProject, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoAddProjec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        NavProjectLayout.setVerticalGroup(
            NavProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNavProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAddProjec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        NavTarefas.setBackground(java.awt.Color.white);

        tituloNavTarefa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloNavTarefa.setForeground(new java.awt.Color(0, 153, 0));
        tituloNavTarefa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloNavTarefa.setText("   Tarefas");

        botaoAddTarefa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoAddTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoAddTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        botaoAddTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAddTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NavTarefasLayout = new javax.swing.GroupLayout(NavTarefas);
        NavTarefas.setLayout(NavTarefasLayout);
        NavTarefasLayout.setHorizontalGroup(
            NavTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloNavTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoAddTarefa)
                .addContainerGap())
        );
        NavTarefasLayout.setVerticalGroup(
            NavTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNavTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAddTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        colunaListaNomeProjetos.setBackground(java.awt.Color.white);

        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 153, 51));
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 51));
        jScrollPainelLista.setViewportView(jListProjects);

        javax.swing.GroupLayout colunaListaNomeProjetosLayout = new javax.swing.GroupLayout(colunaListaNomeProjetos);
        colunaListaNomeProjetos.setLayout(colunaListaNomeProjetosLayout);
        colunaListaNomeProjetosLayout.setHorizontalGroup(
            colunaListaNomeProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colunaListaNomeProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPainelLista)
                .addContainerGap())
        );
        colunaListaNomeProjetosLayout.setVerticalGroup(
            colunaListaNomeProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colunaListaNomeProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPainelLista)
                .addContainerGap())
        );

        ListaDeTarefasAreaPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jTableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTask.setToolTipText("");
        jTableTask.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTask.setRowHeight(50);
        jTableTask.setSelectionBackground(new java.awt.Color(51, 204, 0));
        jScrollPaneTask.setViewportView(jTableTask);

        javax.swing.GroupLayout ListaDeTarefasAreaPrincipalLayout = new javax.swing.GroupLayout(ListaDeTarefasAreaPrincipal);
        ListaDeTarefasAreaPrincipal.setLayout(ListaDeTarefasAreaPrincipalLayout);
        ListaDeTarefasAreaPrincipalLayout.setHorizontalGroup(
            ListaDeTarefasAreaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTask, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        ListaDeTarefasAreaPrincipalLayout.setVerticalGroup(
            ListaDeTarefasAreaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NavProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colunaListaNomeProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NavTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListaDeTarefasAreaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NavTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NavProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colunaListaNomeProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListaDeTarefasAreaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // o codigo abaixo é o metodo do evento de click do mouse que vai chamar a tela de add projeto
    private void botaoAddProjecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAddProjecMouseClicked
        // o codigo abaixo  é uma instancia da classe que modela a tela de cadastro de projeto
        ProjetDialogScreen projectDialogScreen = new ProjetDialogScreen(this, rootPaneCheckingEnabled);// vai chamar a tela projetDialogScreen
        // o codigo abaixo faz aparecer o tela de cadastro de projeto 
        projectDialogScreen.setVisible(true); // faz a parecer a tela quando clicar na label
        
        // Ouvinte da tela de cadastro de projetos
        projectDialogScreen.addWindowListener(new WindowAdapter() {// adicionando um ouvinte na janela projectDialogScreen
                                                                   // esse atravez desse ouvinte podemos ter informação 
                                                                   // a respeito dos eventos que ocorrer no janela projectDialogScreen   
                                                                   // e quando a janela projectDialogScreen for fechada ela execulta o metodo abaixo
        
            public void windowClosed(WindowEvent e){// aqui determinamos para o ouvinte, que quando ouver o fechamento da janela projectDialogScreen 
                                                    //o metodo windowClosed, chama o metodo carregarProjetos
            
                                                    
                    carregarProjetos();// chamado do metodo que carrega os projeto cadastrado para a lista de projetos
        }
        }
        );
    }//GEN-LAST:event_botaoAddProjecMouseClicked
       // codigo abaixo é um evento de click que chama a tela de cadastro de de tarefas    
    private void botaoAddTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAddTarefaMouseClicked
        // o codigo a baixo é uma instancia da classe que modela a tela de cadastro de tarefas
        TarefasDialogScreen tarefasDialogScreen = new TarefasDialogScreen(this, rootPaneCheckingEnabled);
        
        // o codigo abaixo permite atribuir o id do projeto ao qual a tarefa pertence, para ser implementado para o cadastro de tarefas
        //tarefasDialogScreen.setProject(null); 
        tarefasDialogScreen.setVisible(true);        // torna visivel a tela de cadastro de tarefas
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabeçalho;
    private javax.swing.JPanel ListaDeTarefasAreaPrincipal;
    private javax.swing.JPanel NavProject;
    private javax.swing.JPanel NavTarefas;
    private javax.swing.JLabel botaoAddProjec;
    private javax.swing.JLabel botaoAddTarefa;
    private javax.swing.JPanel colunaListaNomeProjetos;
    private javax.swing.JLabel icone;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JScrollPane jScrollPainelLista;
    private javax.swing.JScrollPane jScrollPaneTask;
    private javax.swing.JTable jTableTask;
    private javax.swing.JLabel mensgemCabeçalho;
    private javax.swing.JLabel notificaSemTarefa;
    private javax.swing.JLabel orientaAddTarefa;
    private javax.swing.JPanel painelListaSemTarefas;
    private javax.swing.JLabel tituloCabeçalho;
    private javax.swing.JLabel tituloNavProject;
    private javax.swing.JLabel tituloNavTarefa;
    // End of variables declaration//GEN-END:variables

    
    // customizando o heder da table de tarefas
public void decorateTableTask(){
 jTableTask.getTableHeader().setFont(new Font("segoe UI ", Font.BOLD, 15));// define a fonte,estylo da fonte, tamanho da fonte do cabeçalho 
 jTableTask.getTableHeader().setBackground(new Color(0,153,102));// preenchimento do cabeçalho
 jTableTask.getTableHeader().setForeground(new Color(255,255,255));// cor da fonte do cabeçalho
 
 // chamando um metodo de sorteio automatico para a oganizar o ordem dos elementos na tabela
 jTableTask.setAutoCreateRowSorter(true);// cria automaticamente, uma ordenação nas colunas, se a coluna for numerica sera ordenado do maior para menor e vice versa
                                         // se a coluna for alfabetico, sera ordenado por ordem alfabetico de A a Z , ou de Z a A

}
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

public void inciarDataController(){// ok
    projectController = new ProjectController();//ok
    taskController = new TaskController();//ok
}

public  void iniciarComponenteModel(){ 
    projectModel = new DefaultListModel(); 
    carregarProjetos(); // ok loadProjecs 
}

public  void carregarProjetos(){ // ok loadproject
    List<Project> projectList = new ArrayList<Project>();
            projectList = projectController.getAll(); // ok <Project>projects
       projectModel.clear(); 
       for(int i = 0; i < projectList.size(); i++){
       Project projectEncontrado = projectList.get(i);    
       projectModel.addElement(projectEncontrado); 
     }                    
       jListProjects.setModel(projectModel);
   }
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
}

// continuar na video aula 17B