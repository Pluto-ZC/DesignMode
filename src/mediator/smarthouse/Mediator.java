package mediator.smarthouse;

public abstract class Mediator {
	//将中介者对象加入到集合中
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收消息，具体的同事对象发出
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
