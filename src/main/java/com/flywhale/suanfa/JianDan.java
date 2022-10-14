package com.flywhale.suanfa;

import java.util.*;

/**
 *
 */
public class JianDan {

    /**
     * 合并表记录
     * 数据表记录包含表索引index和数值value（int范围的正整数），
     * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
     */
    public void test1(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int next = sc.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for (int i = 0; i < next; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else {
                    map.put(key,value);
                }
            }
            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                System.out.println(integerIntegerEntry.getKey()+" "+integerIntegerEntry.getValue());
            }
        }
    }

    /**
     * 字符个数统计
     * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
     * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
     */
    public void test2(){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
            hs.add(str.charAt(i));
        System.out.println(hs.size());
    }

    /**
     * 数字颠倒
     * 输入一个整数，将这个整数以字符串的形式逆序输出
     */
    public void test3(){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuffer rs=new StringBuffer(str);
        rs.reverse();
        System.out.println(rs);
    }

    /**
     * 句子逆转
     * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
     * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
     */
    public void test4(){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s[]=str.split(" ");
        for(int i=s.length-1;i>=0;i--)
            if(i!=0)
                System.out.print(s[i]+" ");
            else
                System.out.print(s[i]);
    }

    /**
     * 统计每个月兔子的总数
     * 有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
     * 例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
     * 一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
     */
    public int test5(int month){
        // 第一个月初始化
        // 一月龄兔子总数
        int oneMonth = 1;
        // 二月龄兔子总数
        int twoMonth = 0;
        // 三月龄及以上兔子总数
        int threeMonth = 0;
        // 下个月将繁殖的兔子数量
        int addVal = 0;
        // 第二个月开始递推, i表示第i个月
        for(int i = 2; i <= month; i++) {
            // 三月龄及以上兔子总数 = 二月龄兔子总数 + 原本三月龄及以上兔子总数
            threeMonth += twoMonth;
            // 二月龄兔子总数 = 上个月的一月龄兔子总数
            twoMonth = oneMonth;
            // 一月龄（即这个月出生）兔子总数 = 上个月将繁殖的兔子数量
            oneMonth = addVal;
            // 下个月将出生的兔子 = 下个月成为三月龄及以上的兔子数量
            addVal = twoMonth + threeMonth;
        }
        return (oneMonth + twoMonth + threeMonth);
    }

    /**
     * 蛇形矩阵
     * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
     */
    public void test6(){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();    //读入正整数n

            int[][] result = new int[n][];    //建立数组（n行）
            int t = 1;    //记录依次赋予的数组值
            for(int i=0; i < n; i++){
                result[i] = new int[n-i];    //数组第i行有n-i个元素
                for(int j=0; j < i+1; j++){    //对第i个对角线赋值
                    result[i-j][j] = t;
                    t++;
                }
            }

            //输出数组值
            for(int[] a : result){
                for(int a1 : a)
                    System.out.print(a1 + " ");
                System.out.println();
            }
        }
    }

    /**
     * 图片整理
     * Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过代码解决。
     * Lily使用的图片使用字符"A"到"Z"、"a"到"z"、"0"到"9"表示。
     */
    public void test7(){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a[]=new int[128];
            String str=in.next();
            for(int i=0;i<str.length();i++){
                int k=str.charAt(i);//统计出现次数
                a[k]++;
            }
            for(int j=48;j<a.length;j++){//从'0'开始输出
                if(a[j]!=0)
                    for(int b=0;b<a[j];b++)
                        System.out.print((char)j);
            }
            System.out.println();
        }
    }

    /**
     * 统计字符
     * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
     */
    public void test8(){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            String s1=str.replaceAll("[A-Z]+|[a-z]+", "");
            System.out.println(str.length()-s1.length());
            String s2=s1.replaceAll(" ", "");
            System.out.println(s1.length()-s2.length());
            String s3=s2.replaceAll("[0-9]+", "");
            System.out.println(s2.length()-s3.length()+"\n"+s3.length());
        }
    }

    /**
     * 汽水瓶
     * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
     * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
     */
    public void test9(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int bottle = sc.nextInt();
            if(bottle==0){
                break;
            }
            System.out.println(bottle/2);
        }
    }

    /**
     * 简单密码
     * 现在有一种密码变换算法。
     * 九键手机键盘上的数字与字母的对应： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0，把密码中出现的小写字母都变成九键键盘对应的数字，如：a 变成 2，x 变成 9.
     * 而密码中出现的大写字母则变成小写之后往后移一位，如：X ，先变成小写，再往后移一位，变成了 y ，例外：Z 往后移是 a 。
     * 数字和其它的符号都不做变换。
     */
    public void test10(){
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");
        map.put("0","0");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            //构造buffer容器存储转换后的字符串
            StringBuffer buffer = new StringBuffer();
            for(char c : chars){
                //如果是正整数则不需要进行加密
                if(c>='0'&& c<='9'){
                    buffer.append(String.valueOf(c));
                }else if(c>='A'&& c<='Y'){ //如果是A~Y的大写字母则需要将其+32位转换成小写再向后移1位
                    char newChar = (char)(c+32+1);
                    buffer.append(String.valueOf(newChar));
                }else if(c=='Z'){ //如果是Z则加密成a
                    buffer.append("a");
                }else{
                    //去除map容器中的key与字符进行校验并加密
                    Set<String> keys = map.keySet();
                    for(String k : keys){
                        if(k.contains(String.valueOf(c)))
                            buffer.append(map.get(k));
                    }
                }
            }
            System.out.print(buffer.toString());
        }
    }

    /**
     * 求int型正整数在内存中存储时1的个数
     */
    public void test11(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();    //读取数字
        int n = 0;    //计数变量
        for(int i=0; i < 32; i++){
            if((num&1) == 1)    //如果末位为1则计数
                n++;
            num = num >>> 1;    //无符号右移
        }
        System.out.println(n);
    }

    /**
     * 字符串排序
     * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
     */
    public void test12(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String [] arr = new String[n];
            for(int i=0;i<n;i++){
                String str = sc.next();
                arr[i] = str;
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }

    /**
     * 统计大写字母个数
     * 找出给定字符串中大写字符(即'A'-'Z')的个数。
     */
    public void test13(){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(in.nextLine().replaceAll("[^A-Z]","").length());
        }
    }

    /**
     * 表达式求值
     * @param substring
     */
    public int test14(String substring){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //将其他括号，替换成小括号
        s=s.replace("{","(");
        s=s.replace("[","(");
        s=s.replace("}",")");
        s=s.replace("]",")");
        Stack<Integer> stack=new Stack<>();
        int n=s.length();
        char[] chs=s.toCharArray();
        int index=0;
        //初始化符号为'+'
        char sign='+';
        //记录数字
        int number=0;
        for(int i=0;i<n;i++){
            char ch=chs[i];
            //当前字符是空格，跳过
            if(ch==' ')continue;
            //当前字符是数字，拼数字
            if(Character.isDigit(ch)){
                number=number*10+ch-'0';
            }
            //如果当前字符是小括号
            if(ch=='('){
                //移到小括号后一位字符
                int j=i+1;
                //统计括号的数量
                int count=1;
                while(count>0){
                    //遇到右括号，括号数-1
                    if(chs[j]==')')count--;
                    //遇到左括号，括号数+1
                    if(chs[j]=='(')count++;
                    j++;
                }
                //递归，解小括号中的表达式
                number=test14(s.substring(i+1,j-1));
                i=j-1;
            }
            //遇到符号，将数字处理后放进栈
            if(!Character.isDigit(ch) || i==n-1){
                //如果是'+',直接入栈
                if(sign=='+'){
                    stack.push(number);
                }
                //如果是'-',数字取相反数在入栈
                else if(sign=='-'){
                    stack.push(-1*number);
                }
                //如果是'*',弹出一个数字乘后放入栈
                else if(sign=='*'){
                    stack.push(stack.pop()*number);
                }
                //如果是'/',弹出一个数字/后放入栈
                else if(sign=='/'){
                    stack.push(stack.pop()/number);
                }
                //更新符号
                sign=ch;
                //刷新数字
                number=0;
            }
        }
        //栈中数字求和得到结果
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }

    /**
     * 杨辉三角变形
     * 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数、左上角数和右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
     * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3，输入2则输出-1。
     */
    public void test15(){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if(num == 1 || num == 2){
                System.out.println(-1);
                continue;
            }
            else if(num % 4 == 1 || num % 4 == 3){
                System.out.println(2);
                continue;
            }
            else if(num % 4 == 0){
                System.out.println(3);
                continue;
            }
            else if(num % 4 == 2){
                System.out.println(4);
                continue;
            }
        }
    }

    /**
     * 完全数计算
     * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
     * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
     * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
     */
    public void test16(){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();

            //第一个完全数是6，若小于6则输出0
            if(n < 6){
                System.out.println(0);
                continue;
            }

            int count = 0;    //计数变量
            for(int t=6; t <= n; t++){
                int sum = 0;
                //统计因数的和，计数到该数的1/2即可
                for(int i=1; i <= t/2; i++){
                    if(t%i == 0)
                        sum += i;
                }
                if(sum == t)
                    count++;
            }

            //输出结果
            System.out.println(count);
        }
    }

    /**
     * 输出单向链表中倒数K个节点
     * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
     */
    public void test17(){
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            ListNode header = new ListNode();
            for (int i=0; i< num;i++) {
                int value = scan.nextInt();
                ListNode node = new ListNode(value, header.next);
                header.next = node;
            }
            int target = scan.nextInt();
            for (int i=0; i<target; i++) {
                header = header.next;
            }
            System.out.println(header.value);
        }
    }
    class ListNode{
        int value;
        ListNode next;
        public ListNode(){

        }
        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 计算日期到天数的转换
     * 根据输入的日期，计算是这一年的第几天。
     * 保证年份为4位数且日期合法。
     */
    public void test18(){
        Scanner in=new Scanner(System.in);
        int y=in.nextInt();
        int m=in.nextInt();
        int d=in.nextInt();
        Calendar c1=Calendar.getInstance();//实例化
        c1.set(y, m-1, d);//注意月份从0开始
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));
    }

    /**
     * 放苹果
     * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
     * 注意：如果有7个苹果和3个盘子，（5，1，1）和（1，5，1）被视为是同一种分法。
     */
    public void test19(){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            System.out.println(count(sc.nextInt(),sc.nextInt()));
        }
        sc.close();
    }
    public static int count(int m,int n)
    {
        if(m<0||n<=0)
            return 0;
        //细分到苹果数为一或盘子数为一的情况返回一
        if(m==1||n==1||m==0)
            return 1;
        //将此事件无线细分
        return count(m,n-1)+count(m-n,n);
    }


    /**
     * HJ60 查找组成一个偶数最接近的两个素数
     * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
     */
    public void test20(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int l = n/2;
            int r = n/2;

            while(l>2 && r<n-2){
                if(helper(l) && helper(r) && l+r==n) break;
                else {
                    l--;
                    r++;
                }
            }
            System.out.println(l);
            System.out.println(r);
        }
    }
    private static boolean helper(int n){
        if(n<=2) return false;
        for(int i=2;i<n;i++)
            if(n%i==0) return false;
        return true;
    }

    /**
     * 字符串字符匹配
     * 判断短字符串S中的所有字符是否在长字符串T中全部出现。
     */
    public void test21(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] array = a.split("");  //将 短字符串 切分并放入数组中
            //定义计数器并初始化
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (b.contains(array[i])){
                    // 循环判断 长字符串 中是否包含 短字符串中的字符
                    // 如果包含，则计数器加一
                    count++;
                }
            }
            // 当计数器大小 等于 原短字符串生成的数组长度时 ，即为 短字符串的所有字符均在长字符串中出现过
            if (count == array.length){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }

    /**
     * 整型数组合并
     * 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
     * 输出时相邻两数之间没有空格。
     */
    public void test22(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Set<Long> set = new TreeSet<>();
            //接收第一个整形数组大小
            int size1 = sc.nextInt();
            for (int i = 0; i < size1; i++) {
                set.add(sc.nextLong()); //将该组的整数按数组大小循环添加进 set
            }
            //接收第一个整形数组大小
            int size2 = sc.nextInt();
            for (int i = 0; i < size2; i++) {
                set.add(sc.nextLong());
            }
            //遍历输出
            for (long n : set) {
                System.out.print(n);
            }
      /*
      注意：测试案例会以 两个整形数组 为一组测试用例， 并可能输入多组
      要记得组与组的结果之间换行
      */
            System.out.println();
        }
    }

    /**
     * HJ76 尼科彻斯定理
     * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
     */
    public void test23(){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int start=n*(n-1)+1;
            int end=n*(n+1)-1;
            for(int i=start;i<=end;i+=2){
                if(i==end){
                    System.out.println(i);
                }
                else
                    System.out.print(i+"+");
            }
        }
    }
    public void test24(){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            long sum = (long)Math.pow(n,3);
            int a1 = (int)sum/n - (n - 1);
            StringBuilder sb = new StringBuilder(Integer.toString(a1));
            for(int i = 1; i < n; i++){
                a1 = a1 + 2;
                sb.append("+");
                sb.append(a1);
            }
            System.out.println(sb);
        }
    }

    /**
     * 百钱买百鸡
     * 公元五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
     * 现要求你打印出所有花一百元买一百只鸡的方式。
     * //        5x+3y+z/3=100;
     * //        x+y+z=100;
     * //        简化得 7x+4y=100;
     */
    public void test25(){
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int x,y,z,middle;
        for(x = 0; x<=14;x++){
            if((100 - 7*x) % 4 == 0){
                y = (100 - 7*x) / 4;
                z = 100-x-y;
                System.out.print(x +" ");
                System.out.print(y +" ");
                System.out.print(z +" ");
                System.out.println();
            }
        }
    }

    /**
     * HJ83 二维数组的操作
     */
    public void test26(){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] a = new int[m][n];
            System.out.println((m>9 || n>9)?-1:0);
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            System.out.println(((Math.max(x1,x2)>=m) || (Math.max(y1,y2)>=n))?-1:0);
            int x = in.nextInt();
            System.out.println((x>=m || (m+1)>9)?-1:0);
            int y = in.nextInt();
            System.out.println((y>=n || (n+1)>9)?-1:0);
            x = in.nextInt();
            y = in.nextInt();
            System.out.println((x>=m || y>=n)?-1:0);
        }
    }

    /**
     * HJ86 求最大连续bit数
     * 求一个int类型数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
     */
    public void test27(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            // 转二进制
            String binaryStr = Integer.toBinaryString(num);
            // 用0 分割
            String[] strArray = binaryStr.split("0");
            // 字符串长度
            int result = 0;
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].length() > result) {
                    result = strArray[i].length();
                }
            }
            System.out.println(result);
        }
    }

    /**
     * HJ87 密码强度等级
     */
    public void test28() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            char[] ch = in.nextLine().toCharArray();
            int score = 0;

            //统计长度
            int len = ch.length;
            if (len <= 4) score += 5;
            else if (len > 4 && len < 8) score += 10;
            else score += 25;

            //遍历获取大小写字母、数字、符号数目
            int upCount = 0;
            int lowCount = 0;
            int numCount = 0;
            int sigCount = 0;

            for (int i = 0; i < len; i++) {
                if (Character.isUpperCase(ch[i])) ++upCount;
                else if (Character.isLowerCase(ch[i])) ++lowCount;
                else if (Character.isDigit(ch[i])) ++numCount;
                else ++sigCount;
            }

            //字母分数
            if ((upCount > 0 && lowCount == 0) || (upCount == 0 && lowCount > 0)) score += 10;
            else if (upCount > 0 && lowCount > 0) score += 20;
            else score += 0;

            //数字分数
            if (numCount == 1) score += 10;
            else if (numCount > 1) score += 20;
            else score += 0;

            //符号分数
            if (sigCount == 1) score += 10;
            else if (sigCount > 1) score += 25;
            else score += 0;

            //奖励分数
            if (numCount > 0 && upCount > 0 && lowCount > 0 && sigCount > 0) score += 5;
            else if (numCount > 0 && sigCount > 0 && (upCount > 0 || lowCount > 0)) score += 3;
            else if (numCount > 0 && (upCount > 0 || lowCount > 0)) score += 2;

            //评分
            if (score >= 90) System.out.println("VERY_SECURE");
            else if (score >= 80) System.out.println("SECURE");
            else if (score >= 70) System.out.println("VERY_STRONG");
            else if (score >= 60) System.out.println("STRONG");
            else if (score >= 50) System.out.println("AVERAGE");
            else if (score >= 25) System.out.println("WEAK");
            else System.out.println("VERY_WEAK");
        }
    }

    /**
     * 字符统计
     * 输入一个只包含小写英文字母和数字的字符串，按照不同字符统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASCII码由小到大排序输出。
     */
    public void test29(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //将字符存入TreeMap
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        //找到max值
        int max = 0;
        for (int val:map.values()) {
            if(val>max)
                max = val;
        }

        //输出
        while (max>0){
            for (char key:map.keySet()){
                if(map.get(key)==max)
                    System.out.print(key);
            }
            max--;
        }
    }

    /**
     * HJ105 记负均正II
     * 输入 n 个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数，如果没有非负数，则平均值为0
     */
    public void test30(){
        Scanner sc = new Scanner(System.in);
        float count1 = 0;
        int count2 = 0;
        float sum = 0;
        while (sc.hasNextInt()){
            int cur = sc.nextInt();
            if (cur >= 0){
                count1++;
                sum += cur;
            }else{
                count2++;
            }
        }
        System.out.println(count2);
        System.out.printf("%.1f\n", count1>0?sum/count1:0);
    }

    /**
     * 最小公倍数
     * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
     */
    public void test31(){
        // TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a*b/gcd(a,b));
    }

    private static int gcd(int a, int b) {
        // TODO Auto-generated method stub
        return b==0?a:gcd(b,a%b);
    }

    /**
     * 自守数
     * 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n(包括n)以内的自守数的个数
     */
    public void test32(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            for(int i=0;i<=n;i++){
                int sum =i*i;
                String s1 = String.valueOf(i);
                String s2 = String.valueOf(sum);
                //从平方的尾部往前截取到与当前数长度相同的子串
                if(s2.substring(s2.length()-s1.length()).equals(s1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    /**
     * 表示数字
     * 将一个字符串中所有的整数前后加上符号“*”，其他字符保持不变。连续的数字视为一个整数。
     */
    public void test33(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(input.replaceAll("([0-9]+)", "*$1*")); //把所有的数字段提取出来，前后加上星号再放回去
        }
    }

    /**
     * 计票统计
     */
    public void test34(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //存储候选人以及票数
            Map<String, Integer> map = new LinkedHashMap<>();
            //候选人数
            int n = sc.nextInt();
            //无效票数
            int invalid = 0;
            for (int i = 0; i < n; i++) {
                map.put(sc.next(), 0);
            }
            //投票人数
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String key = sc.next();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    invalid++;
                }
            }
            for (String key : map.keySet()) {
                System.out.println(key + " : " + map.get(key));
            }
            System.out.println("Invalid" + " : " + invalid);
        }
        sc.close();
    }

    /**
     * 走方格的方案数
     * 请计算n*m的棋盘格子（n为横向的格子数，m为竖向的格子数）从棋盘左上角出发沿着边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
     */
    public void test35(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(cal(m,n));
        }

    }
    private static int cal(int m,int n){
        if(m==1 || n== 1){
            return m+n;
        }
        return cal(m-1,n)+cal(m,n-1);
    }


}
