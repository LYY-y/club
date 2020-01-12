public class CommandInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("没有输入参数");
        } else {
            System.out.println("共输入了" + args.length + "个参数");
            for (int i = 0; i < args.length; i++)
                System.out.println("arg[" + i + "]=" + args[i] + "; ");
        }
    }
}
