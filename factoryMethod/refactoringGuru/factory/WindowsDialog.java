package factoryMethod.refactoringGuru.factory;

import factoryMethod.refactoringGuru.buttons.Button;
import factoryMethod.refactoringGuru.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
