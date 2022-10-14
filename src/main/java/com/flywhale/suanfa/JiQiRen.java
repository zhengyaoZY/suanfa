package com.flywhale.suanfa;

/**
 * 最初，机器人位于(0, 0)处。 给定一系列动作，判断该机器人的移动轨迹是否是一个环，这意味着它最终会回到原来的位置。
 *
 * 移动的顺序由字符串表示。 每个动作都由一个字符表示。 有效的机器人移动是R（右），L（左），U（上）和D（下）。 输出应该为true或false，表示机器人是否回到原点。
 */
public class JiQiRen {

    public boolean judgeCircle(String moves) {
        // Write your code here
        int rCount = 0;
        int lCount = 0;
        int uCount = 0;
        int dCount = 0;
        char[] moveChar = moves.toCharArray();
        for(int i = 0 ; i < moveChar.length; i++){
            switch (moveChar[i]){
                case 'R':
                    rCount++;
                    break;
                case 'L':
                    lCount++;
                    break;
                case 'U':
                    uCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
                default:
            }
        }
        if(rCount == lCount && uCount == dCount){
            return  true;
        }else {
            return false;
        }
    }

}
