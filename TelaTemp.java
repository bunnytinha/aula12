import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTemp extends JFrame implements ActionListener
{
   private JTable tabela = new JTable();
   private JButton mostrar = new JButton("Mostrar");
   private JButton sair = new JButton("Sair");
   private String[][] conteudo;     
   private String colunas[]= {"temperatura","media","maior","menor"};
   
   public TelaTemp()
   {
      super("Temperatura");
      
      JPanel painel = new JPanel(new GridLayout(1,1));
      JPanel painel1 = new JPanel(new FlowLayout());
      JPanel painel2 = new JPanel(new GridLayout(1,1));
      JPanel painel3 = new JPanel(new FlowLayout());
      JPanel painel4 = new JPanel(new GridLayout(1,1));
      JPanel painel5 = new JPanel(new FlowLayout());
      
      painel.add(tabela);
      painel1.add(painel);
      painel2.add(sair);
      painel3.add(painel2);
      painel4.add(mostrar);
      painel5.add(painel4);
      
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painel1, BorderLayout.NORTH);
      caixa.add(painel3, BorderLayout.SOUTH);
      caixa.add(painel5, BorderLayout.CENTER);
      
      mostrar.addActionListener(this);
      sair.addActionListener(this);
      
      setSize(300,150);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);      
      
   }
   
   public void actionPerformed(ActionEvent a)
   {
      //String textinho = ftexto.getText();
   
      if(a.getSource() == mostrar)
      {
         //JOptionPane.showMessageDialog(null,textinho);
      }
      else if(a.getSource() == sair)
      {
         dispose();
      }
   }
}