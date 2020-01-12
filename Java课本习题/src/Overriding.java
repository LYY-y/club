class Animal{
    void play(){
        System.out.println("我是动物，我会很多本领");
    }
}

class Bird extends Animal{
    void play(){
        System.out.println("我是小鸟，我能飞翔");
    }
}

class Fish extends Animal{
    void play(){
        System.out.println("我是小鱼，我能游泳");
    }
}
class Overriding {
    public static void main(String[] args){
        Animal s1=new Animal();
        Bird s2=new Bird();
        Fish s3=new Fish();
        s1.play();
        s2.play();
        s3.play();
    }

}
