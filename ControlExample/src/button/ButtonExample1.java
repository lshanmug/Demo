package button;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class ButtonExample1 {
	
	public static void createButtons(Composite parent) {
		createButton(parent, SWT.PUSH, "Push button");
	}
	
	public static Button createButton(Composite parent, int style, String text) {
		Button button = new Button(parent, style);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText(text);
		return button;
	}
	
}
