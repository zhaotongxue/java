package toKnow;
import java.util.*;
/* 
 * @author ��ͬѧ
 * @version 7.0
 */
public class JavaDoc{
public static void main(String args[]){
    int i=2;
    /* 
     * @see i
     * @deprecated �������
     * @throws ��֪���������ȼ�������
     */
    int q=3*i++ + ++i;
    System.out.println("Q:"+q);

}
}
/*
 * @output:
 */
