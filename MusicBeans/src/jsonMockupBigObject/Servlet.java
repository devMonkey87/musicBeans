package jsonMockupBigObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Servlet {

@SerializedName("servlet-name")
@Expose
private String servletName;
@SerializedName("servlet-class")
@Expose
private String servletClass;
@SerializedName("init-param")
@Expose
private InitParam initParam;

public String getServletName() {
return servletName;
}

public void setServletName(String servletName) {
this.servletName = servletName;
}

public String getServletClass() {
return servletClass;
}

public void setServletClass(String servletClass) {
this.servletClass = servletClass;
}

public InitParam getInitParam() {
return initParam;
}

public void setInitParam(InitParam initParam) {
this.initParam = initParam;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("servletName", servletName).append("servletClass", servletClass).append("initParam", initParam).toString();
}

}