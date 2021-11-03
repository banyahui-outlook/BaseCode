package com.test2;

import com.iface.Iinput;
import com.iface.board;
import com.iface.mouse;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 16:09
 * @Description 接口测试
 */
public class FaceTest {
    public static void main(String[] args) {
        mouse mouse=new mouse();
        mouse.input();

        Iinput iinput=new board();
        iinput.input();
    }
}
