package day1112.useString;

/**
 * �� ���ڿ��� ��� �� �� ���� class : StringBuffer , StringBuilder�� ���.
 * �乮�ڿ� = "���ڿ�"+"���ڿ�"
 * @author owner
 */
public class UseStringBuilder {
	
	
	public void useStringBuffer() {
		
		//class�� ����Ϸ��� ó�� Instanceȭ �� �� ���.
		//1.���� (class���� �ٸ� class�� ����� ����ϱ� ���� ���(is-a)�� ���� �� �� �ְ�,
		// Instance�� ���� �����Ͽ� ���(has-a)�� ���� �ִ�.
		StringBuffer sb = new StringBuffer();
		//2.��� (method ȣ�� : Instance�� �����ϴ� ���� ���)
		//�� �߰�.(����, �Ǽ�, ����, ���ڿ�, Boolean)
		sb.append("������ ");
		sb.append(11);
		sb.append("��");
		sb.append("12");
		sb.append("��");
		
		//�� ����.(�ε����� �����Ͽ� ���� �ִ´�.)
		//������ 11��12��
		//0 1 2 3456 78 9 << String Index
		sb.insert(4, "2020��");
		//������ 2020��11��12��
		//0 1  23 456789......
		
		//�� ���� : ���ڿ����� �⵵ 4�ڸ� �� �� 2�ڸ��� ����
		//delete(����index, ��index+1)
		//���� null���ڸ� �����ϰ� �ֱ� ������ ��index�� +1
		sb.delete(4, 6);
		
		//���ڿ� ������.
		sb.reverse();
//		sb.reverse();
		
		//StringBuffer�� ������ String�� �Ҵ��� ���ô�.
		//String str = sb; // String�� StringBuffer�� �ٸ� Data type�̴�.
		String str = sb.toString();
		System.out.println(str);
		
	}//useStringBuilder
	
	public void useStringBuilder() {
		
		
		//class�� ����Ϸ��� ó�� Instanceȭ �� �� ���.
		//1.���� (class���� �ٸ� class�� ����� ����ϱ� ���� ���(is-a)�� ���� �� �� �ְ�,
		// Instance�� ���� �����Ͽ� ���(has-a)�� ���� �ִ�.
		StringBuilder sb = new StringBuilder();
		//2.��� (method ȣ�� : Instance�� �����ϴ� ���� ���)
		//�� �߰�.(����, �Ǽ�, ����, ���ڿ�, Boolean)
//		sb.append("������ ");
//		sb.append(11);
//		sb.append("��");
//		sb.append("12");
//		sb.append("��");
		
		//method chain
		sb.append("������").append(11).append("��").append(12).append("��");
		
		
		//�� ����.(�ε����� �����Ͽ� ���� �ִ´�.)
		//������ 11��12��
		//0 1 2 3456 78 9 << String Index
		sb.insert(4, "2020��");
		//������ 2020��11��12��
		//0 1  23 456789......
		
		//�� ���� : ���ڿ����� �⵵ 4�ڸ� �� �� 2�ڸ��� ����
		//delete(����index, ��index+1)
		//���� null���ڸ� �����ϰ� �ֱ� ������ ��index�� +1
		sb.delete(4, 6);
		
		//���ڿ� ������.
		sb.reverse();
//		sb.reverse();
		
		String str = sb.toString();
		System.out.println(str);		
		
	}//useStringBuilder

	public static void main(String[] args) {

		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("=================");
		usb.useStringBuilder();
		
//		String(���ڿ�)�� +������ ����ϸ� Compiler�� +������ StringBuilder�� ����
//		String str = "�ȳ�";
//		str+="�ϼ���";
//		str+="������ ����� �Դϴ�";
//		System.out.println(str);
//		
//		+�������� String�� ��� ���� �� Compiler���� ����Ǵ� ����
//		
//		public static void main(String args[])
//	    {
//	        String str = "\uC548\uB155";
//	        str = (new StringBuilder(String.valueOf(str))).append("\uD558\uC138\uC694").toString();
//	        str = (new StringBuilder(String.valueOf(str))).append("\uC624\uB298\uC740 \uBAA9\uC694\uC77C \uC785\uB2C8\uB2E4").toString();
//	        System.out.println(str);
//	    }
		
	}//main
}//class
