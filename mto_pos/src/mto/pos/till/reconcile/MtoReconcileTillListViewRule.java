package mto.pos.till.reconcile;

import dtv.pos.framework.ui.listview.AbstractListViewRule;
import dtv.util.StringUtils;
import mto.xst.query.results.MtoAllTillStatusResult;

/**
 * @author Nishanthi_Babu
 * User story 92929 Reconcile Till
 */
public class MtoReconcileTillListViewRule extends AbstractListViewRule {
	public boolean checkListViewRule(Object argData) {
		boolean result = false;
		if (argData instanceof MtoAllTillStatusResult) {
			MtoAllTillStatusResult data = (MtoAllTillStatusResult) argData;
			result = !StringUtils.isEmpty(data.getCashDrawerDescription());
		}

		return this.getParameter() != null && "INVERT".equalsIgnoreCase(this.getParameter()) ? !result : result;
	}
}
