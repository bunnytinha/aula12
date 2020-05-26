//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.text.ParseException;

public class TelaTemperatura extends JFrame implements ActionListener
{
   private Container caixa;
   private JLabel lbltexto = new JLabel("Informe abaixo a quantidade de temperaturas que você gostaria de ver informações.");
   private JLabel lblquantidade = new JLabel("Quantidade:");
   private JTextField quantidade = new JTextField("");
   private JButton ok = new JButton("Ir");
   
   private JTable tabela;
   private JScrollPane container;            
   private String[][] conteudo;     
   private String colunas[]= {"temperatuas", "média", "maior", "menor"};
   private String d;
   private int telaW;
   private int telaH;
   
   public TelaTemperatura()
   {
      super("Temperatura");
      
      caixa = getContentPane();
      
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
      telaW = d.width;
      telaH = d.height;
      
      /*conteudo= indicaAlunos();
      container = criaTabela();*/
      
      caixa.setLayout(null);
      
      ok.actionListener(this);
      
      caixa.add(lbltexto);
      caixa.add(lblquantidade);
      caixa.add(quantidade);
      caixa.add(ok);
      caixa.add(tabela);

      setSize(telaW,telaH);
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main (String [] args){
      SwingUtilities.invokeLater (new Runnable (){
         public void run (){
            new TelaTemperatura();
         }
      });
   }

}