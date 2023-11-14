 package mto.pos.register;
 
 import javax.inject.Inject;
import javax.inject.Provider;

import com.micros.xstore.config.listview.ListViewColumnType;

import dtv.i18n.FormattableFactory;
import dtv.i18n.IFormattable;
import dtv.i18n.OutputContextType;
import dtv.pos.common.TransactionType;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.framework.ui.listview.CellContent;
import dtv.pos.framework.ui.listview.ICellDataHandler;
import dtv.pos.iframework.IModeController;
import dtv.ui.model.IListModel;
import dtv.xst.dao.trl.IRetailTransaction;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;

/**
 * 
 * @author kameswari.srishtu
 *
 */
  public class MtoOrderNumberCellHandler implements ICellDataHandler {
    @Inject
    private Provider<TransactionScope> _transactionScope;
    @Inject
	protected TransactionScope _transScope;
    @Inject
    private FormattableFactory _formattableFactory;
    @Inject
    private Provider<IModeController> _modeProvider;
    private Object _oldReference;
    private String _transactionKeyValue = "_siebelOrderNr";
 
    public CellContent buildCellContent(ListViewColumnType argColConfig, Object argModel) {
       IRetailTransaction retailTrans = (IRetailTransaction)((TransactionScope)this._transactionScope.get()).getTransaction(TransactionType.RETAIL_SALE);
       MtoOrderList  selectedOrder = _transScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
       boolean redrawHeader = false;
 
       if (this._oldReference == null && retailTrans != null || this._oldReference != null && retailTrans == null) {
          redrawHeader = true;
       }
 
       this._oldReference = selectedOrder;
       IFormattable arg = null;
 
       if (selectedOrder != null) {
          arg = this._formattableFactory.getLiteral(selectedOrder.getOrderNumber());
 
          if (redrawHeader) {
 
 
 
 
 
 
 
             IListModel listModel = ((IModeController)this._modeProvider.get()).getStationModel().getCurrentListModel().getModel();
             listModel.setColumnHeaderDisplayed(false);
             listModel.setColumnHeaderDisplayed(true);
 
          }
       } else {
          arg = this._formattableFactory.getLiteral("");
       }
       IFormattable text = this._formattableFactory.getSimpleFormattable(this._transactionKeyValue, new IFormattable[]{arg});
       return new CellContent(text.toString(OutputContextType.VIEW));
    }
 
 
 
    public void setParameter(String argName, String argValue) {
       if ("TranslationKey".equals(argName)) {
          this._transactionKeyValue = argValue;
       }
    }
 }
