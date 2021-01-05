package responsibilitychain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequset(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println("请求编号id="+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequset(purchaseRequest);
        }
    }
}
