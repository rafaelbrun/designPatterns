package factoryMethod.refactoringGuru.factory;

import factoryMethod.refactoringGuru.buttons.Button;
import factoryMethod.refactoringGuru.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
