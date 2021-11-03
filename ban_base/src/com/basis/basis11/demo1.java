package com.test;

/**
 * @Creater banyahui
 * @Date 2019/12/23 下午 14:00
 * @Description 基础加强 枚举
 */
public class demo1 {
    public enum sex {
        boy,
        gril
    }

    public enum sexh {
        BOY(1, "男孩"),
        GRIL(2, "女孩");

        private int code;
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        private String ms;
        public String getMs() {
            return ms;
        }
        public void setMs(String ms) {
            this.ms = ms;
        }

        sexh(int code, String ms) {
            this.code=code;this.ms=ms;
        }

        public String getValue(int code){
            for (sexh value : values()) {
                if(code==value.getCode()) return value.getMs();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        sex sex1 = demo1.sex.boy;
        System.out.println("sex1 = " + sex1);

        sex boy = Enum.valueOf(sex.class, "boy");
        System.out.println("boy = " + boy);

        System.out.println("遍历枚举...");
        for (sex value : sex.values()) {
            System.out.println("name:" + value.name());
        }

        sexh sexh= demo1.sexh.BOY;
        System.out.println("sexh = " + sexh.getValue(1));
    }

}
