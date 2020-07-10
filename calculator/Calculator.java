

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

    private JFrame frame;
    private JTextField textField;
    double firstnum;
    double secoundnum;
    double result;
    String opration;
    private Object math;
    String answer;



    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 507, 344);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("7");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum=textField.getText()+btnNewButton.getText();
                textField.setText(iNum);
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button = new JButton("4\r\n");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button.getText();
                textField.setText(iNum);
            }
        });
        button.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_1 = new JButton("1");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_1.getText();
                textField.setText(iNum);
            }
        });
        button_1.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_2 = new JButton("0");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_2.getText();
                textField.setText(iNum);
            }
        });
        button_2.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_3 = new JButton("8");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_3.getText();
                textField.setText(iNum);

            }
        });
        button_3.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_4 = new JButton("5");
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_4 .getText();
                textField.setText(iNum);
            }
        });
        button_4.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_5 = new JButton("2");
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum=textField.getText()+button_5.getText();
                textField.setText(iNum);
            }
        });
        button_5.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_6 = new JButton(".");
        button_6.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_7 = new JButton("9");
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_7.getText();
                textField.setText(iNum);
            }
        });
        button_7.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_8 = new JButton("6");
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_8 .getText();
                textField.setText(iNum);
            }
        });
        button_8.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_9 = new JButton("3");
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum=textField.getText()+button_9.getText();
                textField.setText(iNum);
            }
        });
        button_9.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_10 = new JButton("\u00B1");
        button_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=ops*(-1);
                textField.setText(String.valueOf(ops));
            }
        });
        button_10.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_11 = new JButton("+");
        button_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnum=Double.parseDouble(textField.getText());
                textField.setText("");
                opration="+";
            }
        });
        button_11.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_12 = new JButton("-");
        button_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnum=Double.parseDouble(textField.getText());
                textField.setText("");
                opration="-";
            }
        });
        button_12.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_13 = new JButton("/\r\n");
        button_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstnum=Double.parseDouble(textField.getText());
                textField.setText("");
                opration="/";
            }
        });
        button_13.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_14 = new JButton("=");
        button_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String answer;
                secoundnum=Double.parseDouble(textField.getText());
                if(opration=="+")
                {
                    result=firstnum+secoundnum;
                    answer=String.format("%2f",result);
                    textField.setText(answer);
                }

                else if(opration=="-")
                {
                    result=firstnum-secoundnum;
                    answer=String.format("%2f",result);
                    textField.setText(answer);
                }

                else if(opration=="*")
                {
                    result=firstnum*secoundnum;
                    answer=String.format("%2f",result);
                    textField.setText(answer);
                }

                else if(opration=="/")
                {
                    result=firstnum/secoundnum;
                    answer=String.format("%2f",result);
                    textField.setText(answer);
                }

            }
        });
        button_14.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnC = new JButton("<-");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String backspace=null;
                if(textField.getText().length()>0) {
                    StringBuilder strB =new StringBuilder (textField.getText());
                    strB.deleteCharAt(textField.getText().length()-1);
                    backspace=strB.toString();
                    textField.setText(backspace);

                }
            }
        });
        btnC.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnC_1 = new JButton("c");
        btnC_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textField.setText(null);
            }
        });
        btnC_1.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_17 = new JButton("#");
        button_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.sqrt(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        button_17.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton button_18 = new JButton("*");
        button_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnum=Double.parseDouble(textField.getText());
                textField.setText("");
                opration="*";
            }
        });
        button_18.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnLog = new JButton("log");
        btnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.log(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnLog.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnSin = new JButton("sin");
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.sin(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnSin.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnSinh = new JButton("sinh");
        btnSinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.sinh(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnSinh.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnPi = new JButton("octa");
        btnPi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a=Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(a,8));
            }
        });
        btnPi.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnCos = new JButton("cos");
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.cos(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnCos.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnCosh = new JButton("cosh");
        btnCosh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.cosh(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnCosh.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnXy = new JButton("x^y");
        btnXy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.pow(ops,ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnXy.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnTan = new JButton("tan");
        btnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.tan(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnTan.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnTanh = new JButton("tanh");
        btnTanh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.tanh(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnTanh.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnX = new JButton("x^2");
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=(ops*ops);
                textField.setText(String.valueOf(ops));

            }
        });
        btnX.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnCbr = new JButton("cbr");
        btnCbr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.cbrt(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnCbr.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnRund = new JButton("rund");
        btnRund.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=Math.round(ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnRund.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnX_1 = new JButton("x^3");
        btnX_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops=Double.parseDouble((String.valueOf(textField.getText())));
                ops=(ops*ops*ops);
                textField.setText(String.valueOf(ops));
            }
        });
        btnX_1.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnBin = new JButton("bin");
        btnBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a=Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(a,2));
            }
        });
        btnBin.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnHex = new JButton("hex");
        btnHex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a=Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(a,16));
            }
        });
        btnHex.setFont(new Font("Tahoma", Font.BOLD, 13));
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(10)
                                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(button_2, 0, 0, Short.MAX_VALUE)
                                                        .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button, GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                                                        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(btnC_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_6, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_5, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                        .addComponent(button_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(button_17, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(button_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                                        .addComponent(button_8, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                                        .addComponent(button_9, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(button_13, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_14, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_18, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_12, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button_11, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnLog, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6)
                                                .addComponent(btnSin, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6)
                                                .addComponent(btnSinh, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnXy, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(btnCos, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6)
                                                .addComponent(btnCosh, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnX, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(btnTan, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6)
                                                .addComponent(btnTanh, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnX_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(btnCbr, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(btnRund, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnPi, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(btnBin, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6)
                                                .addComponent(btnHex, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
                                .addGap(54))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(19)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(26)
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(btnLog, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSin, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSinh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(btnCos, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCosh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGap(80)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                                .addComponent(button_10, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(button_14, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(button_6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                                        .addComponent(btnTan, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnX, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(btnTanh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(button, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(button_13, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(button_9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(button_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnX_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnCbr, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnRund, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                                .addComponent(btnBin, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnPi, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(btnHex, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(groupLayout.createSequentialGroup()
                                                        .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(43)
                                                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                .addComponent(button_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button_8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button_18, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(43)
                                                        .addComponent(button_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(groupLayout.createSequentialGroup()
                                                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                .addComponent(btnC_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button_17, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button_11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                .addComponent(button_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button_12, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnXy, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(59))
        );
        frame.getContentPane().setLayout(groupLayout);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
    }
}
