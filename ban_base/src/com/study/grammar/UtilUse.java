package com.ban.grammar;

import java.util.Calendar;
import java.util.Random;

// base使用基础util包
public class UtilUse {
    // scanner 扫描器
    // 控制台输入 读取输入信息等  System.in  nextLine()

    // random 随机器
    //    左闭右开 含头不含尾 ，初始化可以使用种子，不指定则为系统毫秒数，指定后根据种子计算，每次一致

    // math 数学
    // abs ceil(大) floor(小) round(四舍五入)
    // 两位小数1： DecimalFormat df = new DecimalFormat("#.00");
    //           System.out.println(df.format(f));
    // 两位小数2： String.format("%.2f", f)
    // 两位小数3：NumberFormat nf = NumberFormat.getNumberInstance();
    //          nf.setMaximumFractionDigits(2);
    //          System.out.println(nf.format(f));

    // system 类
    //          System.arraycopy();
    //          System.currentTimeMillis();
    //          System.getProperties();

    // object 类
    // clone() 创建并返回此对象的一个副本。
    // equals(Object obj) 指示某个其他对象是否与此对象“相等”。
    // hashCode() 返回该对象的哈希码值。
    // toString() 返回该对象的字符串表示。
    // wait() notify() notifyAll()

    // arrays 类
    // sort() 排序
    // Arrays.binarySerch() 二分查找，找到则定位元素下标 有序数组
    // Arrays.copyOf() 和 Arrays.copyOfRange(); //截取数组

    // date 类
    // Date d = new Date(); //创建一个代表系统当前日期的Date对象
    // Date d1 = new Date(2014-1900, 6-1, 12); （注意参数的设置） (mounth + 1)
    // getTime（）方法来获取毫秒数 返回值类型是long，其可以把日期对象转成毫秒值
    // SimpleDateFormat 格式化日期 线程不安全，不能公用

    // calendar 类
    // 3种实现类 3种日历类型
    // Calendar c = Calendar.getInstance();//默认是当前日期
    // c.set(2014, 6-1, 9);//把Calendar对象c1的年月日分别设这为：2014、6、9  重载设置单独日期
    // long t1 = c.getTimeInMillis();  毫秒数
    // c.setTime(long); c.setTime(date); 毫秒转换 date转换 为calendar
    // c.getTime() 转换为date
    // set add 日期进行修改， 计算结果


    // collections 类
    //  reverse(List list)：反转指定List集合中元素的顺序
    //  shuffle(List list)：对List中的元素进行随机排序（洗牌）
    //  sort(List list)：对List里的元素根据自然升序排序
    //  sort(List list, Comparator c)：自定义比较器进行排序
    //  swap(List list, int i, int j)：将指定List集合中i处元素和j出元素进行交换


    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String s = scanner.nextLine();
//        System.out.println(s);

        Random random =new Random();
        int i = random.nextInt(100);
        System.out.println(i);

        Calendar calendar=Calendar.getInstance();  // 多态 返回的是抽象类

//        System.arraycopy();
//        System.currentTimeMillis();
//        System.getProperties();

    }
}
