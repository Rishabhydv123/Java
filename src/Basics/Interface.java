package Basics;
interface Man{
    void talk();
}
class boys implements Man{

    @Override
    public void talk() {

        System.out.println("human can");
    }
}

public class Interface {
    public static void main(String[] args) {
        boys b= new boys();
        b.talk();

    }
}



