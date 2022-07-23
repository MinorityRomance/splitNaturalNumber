package possibleException;

/**
 * 自定义非自然数异常类
 * @version 1.0
 * @author Jay Zhou
 */
public class FalseNaturalNumberException extends Exception{
    private String message;

    /**
     * 初始化
     */
    public FalseNaturalNumberException(){}

    /**
     * 创建异常实例
     * @param message 异常信息
     */
    public FalseNaturalNumberException(String message){
        super();
        this.setNaturalNumber(message);
    }

    /**
     * 返回自然数
     * @return 自然数
     */
    public String getNaturalNumber() {
        return message;
    }

    /**
     * 改变自然数
     * @param message 错误信息
     */
    public void setNaturalNumber(String message) {
        this.message = message;
    }

}
