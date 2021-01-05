package responsibilitychain;

public class ScoolMasterApprover extends Approver {
    public ScoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequset(PurchaseRequest purchaseRequest) {
        if ( purchaseRequest.getPrice()>30000){
            System.out.println("请求编号id="+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequset(purchaseRequest);
        }
    }
}
