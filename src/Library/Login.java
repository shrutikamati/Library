package Library;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Library library;
	protected JTextField loginName;
	protected JPasswordField loginPassWord;

	public Login() throws HeadlessException {
		super();
	}

	public Login(GraphicsConfiguration arg0) {
		super(arg0);
	}

	public Login(String arg0) throws HeadlessException {
		super(arg0);
	}

	public Login(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
	}

}
