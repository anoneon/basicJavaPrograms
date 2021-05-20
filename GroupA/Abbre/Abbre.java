import java.io.*;
class Namae {



	public String makee(String st) throws IOException {
		String surname = "", initial = "";
		int ls = -1;
		char ch;
		st = " " + st;

		for (int i = st.length() - 1; i >= 0; i--) {
			ch = st.charAt(i);
			if (ch == ' ') {
				ls = i;
				break;
			} else {
				surname = ch + surname;
			}
		}

		if (ls == -1) return st;

		else {
			for (int i = 0; i < ls; i++) {
				ch = st.charAt(i);
				if (ch == ' ') {
					initial += st.charAt(i + 1) + " . ";
				}
			}
		}

		initial = initial + surname + "\n";
		return initial;
	}
}

class Abbre {

	public static void main(String arg[]) throws IOException {
	
		DataInputStream d = new DataInputStream(System.in);
		String str;

		Namae obj = new Namae();
		System.out.print("enter name : ");
		str = d.readLine();
		System.out.print(obj.makee(str));
	}
}