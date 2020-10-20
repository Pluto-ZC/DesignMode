package memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1 100");

        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2 80");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3 50");

        caretaker.add(originator.saveStateMemento());

        //当前状态
        System.out.println("当前的状态：" + originator.getState());

        //恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1，当前的状态："+originator.getState());
    }

}
