package command;

public class TVOffCommand implements Command {
    //聚合TVReceiver
    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        tvReceiver.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        tvReceiver.on();
    }
}
