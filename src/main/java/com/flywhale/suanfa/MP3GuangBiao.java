package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * MP3光标位置
 */
public class MP3GuangBiao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String line = in.nextLine();
            int n = Integer.parseInt(line);
            String cmd = in.nextLine();
            int index = 0;
            int rs = 0;
            for(Character c : cmd.toCharArray()){
                if ( c == 'U')
                {
                    index--;
                    if (index < 0){
                        index = n - 1;
                        rs = n-4 > 0 ? n-4 : 0;
                        continue;
                    }
                    if (n > 4 && rs - 1 == index){
                        rs = index;
                    }

                }
                if (c == 'D')
                {
                    index++;
                    if (index >= n) {
                        index = 0;
                        rs = 0;
                        continue;
                    }
                    if (n > 4 && rs + 4 == index){
                        rs++;
                    }
                }
            }
            int end = rs + ((n > 4) ? 4 : n);
            for(int i=rs;i<end;i++){
                System.out.print((i+1) + " ");
            }
            System.out.print("\n");
            System.out.println((index + 1));
        }
    }

}
