package Spring.annotation.test;

import java.util.Arrays;

public class DeclaredOrNot {
    public static void main(String[] args) {
        Class<Sub> clazz = Sub.class;
        System.out.println("============================Field===========================");
        //public + 继承
        System.out.println(Arrays.toString(clazz.getFields()));
        //all + 自身
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));

        System.out.println("============================Method===========================");
        //public + 继承
        System.out.println(Arrays.toString(clazz.getMethods()));
        //all + 自身
        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));

        System.out.println("============================Constructor===========================");
        //public + 自身
        System.out.println(Arrays.toString(clazz.getConstructors()));
        //all + 自身
        System.out.println(Arrays.toString(clazz.getDeclaredConstructors()));


        System.out.println("============================AnnotatedElement===========================");
        //注解DBTable2是否存在于元素上
        System.out.println(clazz.isAnnotationPresent(DBTable2.class));
        //如果存在该元素的指定类型的注释DBTable2，则返回这些注释，否则返回 null。
        System.out.println(clazz.getAnnotation(DBTable2.class));
        //继承
        System.out.println(Arrays.toString(clazz.getAnnotations()));
        //自身
        System.out.println(Arrays.toString(clazz.getDeclaredAnnotations()));
    }
}
@DBTable
class Super{
    private int superPrivateF;
    public int superPublicF;

    public Super(){
    }

    private int superPrivateM(){
        return 0;
    }
    public int superPubliceM(){
        return 0;
    }
}  @DBTable2
class Sub extends Super{
    private int subPrivateF;
    public int subPublicF;

    private Sub(){
    }
    public Sub(int i){
    }

    private int subPrivateM(){
        return 0;
    }
    public int subPubliceM(){
        return 0;
    }
}