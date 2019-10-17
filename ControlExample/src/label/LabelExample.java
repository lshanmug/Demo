package label;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class LabelExample {
public static void main(String[] args) {
	Display display = new Display();
	Shell shell = new Shell(display);
	shell.setLayout(new GridLayout(1, false));

	Group group = new Group(shell, SWT.NONE);
	group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	group.setLayout(new GridLayout(1, false));
	group.setText("label group");
	
	Label label = new Label(group, SWT.NONE);
	label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
	label.setText("text label");
	
	label = new Label(group, SWT.NONE);
	label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
	label.setText("text label0");

	shell.pack();
	shell.open();
	while (!shell.isDisposed()) {
		if (!display.readAndDispatch())
			display.sleep();
	}
	display.dispose();
}
}
