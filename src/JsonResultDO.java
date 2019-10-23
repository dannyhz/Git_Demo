
import java.io.Serializable;

public class JsonResultDO
  implements Serializable
{
  private static final long serialVersionUID = -5208817809050895592L;
  public static final JsonResultDO EMPTY_RESULT = new JsonResultDO();
  private boolean success = true;
  private String msgCode;
  private Object[] arguments;
  private Object datas;
  
  public JsonResultDO() {}
  
  public JsonResultDO(String msgcode)
  {
    this.success = false;
    this.msgCode = msgcode;
  }
 }