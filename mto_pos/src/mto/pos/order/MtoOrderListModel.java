package mto.pos.order;

import java.util.ArrayList;
import java.util.List;

import dtv.pos.framework.form.BasicListEditModel;
import dtv.ui.UIServices;

public class MtoOrderListModel extends BasicListEditModel {
	
	private List<MtoOrderList> _results = new ArrayList<MtoOrderList>();
	
	public List<MtoOrderList> getResults() {
		return _results;
	}

	public void setResults(List<MtoOrderList> _results) {
		this._results = _results;
		refresh();
	}

	public void addOrder(MtoOrderList argOrder) {
	    if (argOrder != null) {
	      this._results.add(argOrder);
	      displayList();
	    } 
	  }

	protected void displayList() {
	    UIServices.invoke(new Runnable() {
	          public void run() {
	            MtoOrderListModel.this.getModel().setElements(MtoOrderListModel.this._results);
	          }
	        });
	  }
	
	public void refresh() {
	    UIServices.invoke(new Runnable() {
	          public void run() {
	        	  MtoOrderListModel.this.getModel().setElements(MtoOrderListModel.this._results);
	        	  MtoOrderListModel.this.getSelectionModel().selectFirst();
	          }
	        });
	  }
	
	 public void displayResultsWithGivenIndexSelected(List<MtoOrderList> argOrders, final int[] selectedIndex) {
		    this._results.clear();
		    this._results.addAll(argOrders);
		    UIServices.invoke(new Runnable() {
		          public void run() {
		        	  MtoOrderListModel.this.getModel().setElements(MtoOrderListModel.this._results);
		        	  MtoOrderListModel.this.getSelectionModel().clearSelection();
		        	  MtoOrderListModel.this.getSelectionModel().setSelections(selectedIndex);
		          }
		        });
		  }
}
