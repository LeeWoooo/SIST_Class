package day1118.flowlayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * FlowLayout : �帧 ���̾ƿ�
 * ������Ʈ�� ���� ũ�⸦ ������ ��ġ�ϴ� ������� ��ġ�ȴ�.
 * �������� ũ�Ⱑ �ٰų� �þ�� ������Ʈ�� ��ġ�� ������ �Ʒ��� �̵��Ѵ�.
 * @author owner
 */

//1. ������ ������Ʈ�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame {
//2. �����ڸ� �ۼ�.
	public UseFlowLayout() {
		super("FlowLayout�� ���");
		
		//3. ������Ʈ�� ����
		JLabel jlblNanme = new JLabel("�̸�");
		JTextField jtfName = new JTextField(10); //�빮��A���� 10���� �����ٶ�
		JLabel jlblage = new JLabel("����");
		
		
		Integer[] arrage=new Integer[100];
		for(int i = 0 ; i < arrage.length ; i++) {
			arrage[i]=i+1;
		}//end for
		
		JComboBox<Integer> jcbage = new JComboBox<Integer>(arrage); 
		
		JButton jbtninput = new JButton("�Է�");
		
		//4. ��ġ�����ڸ� ���� : BorderLayout => FlowLayout
		setLayout(new FlowLayout());
		
		//5. ������Ʈ�� ��ġ�մϴ�. ( add�ϴ� ������� ���ʿ��� ����������)
		add(jlblNanme);
		add(jtfName);
		add(jlblage);
		add(jcbage);
		add(jbtninput);
		//6. �������� ũ�⸦ �����մϴ�.
		setSize(600, 400);
		
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//8. ������ ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseFlowLayout

	public static void main(String[] args) {
		
		new UseFlowLayout();
		
	}//mian
}//class
