public class ArrayClass<T> {
    private T[] array;

    public void setT(T[] array){
        this.array=array;
    }

    public T[] getT(){
        return array;
    }

    public static void main(String[] args){
        ArrayClass<String> a=new ArrayClass<String>();
        String[] beauty={"西施","王昭君","貂蝉","杨贵妃"};
        a.setT(beauty);

        for(int i = 0; i < a.getT().length; i++){
            System.out.print(a.getT()[i]+" ");
        }
    }
}
