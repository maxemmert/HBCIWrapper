/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package name.kiesel.hbci.passport;

import org.kapott.hbci.passport.HBCIPassportPinTan;

/**
 *
 * @author alex
 */
public class HBCIPassportNonPersistentPinTan extends HBCIPassportPinTan {

	public HBCIPassportNonPersistentPinTan(Object initObject) {
		super(initObject);
	}

	public HBCIPassportNonPersistentPinTan(Object init, int dummy) {
		super(init, dummy);
	}

	@Override
	public void saveChanges() {
		// Intentionally empty
	}

}
