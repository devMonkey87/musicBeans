package jsonMockupBigObject;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class WebApp {

@SerializedName("servlet")
@Expose
private List<Servlet> servlet = null;
@SerializedName("servlet-mapping")
@Expose
private ServletMapping servletMapping;
@SerializedName("taglib")
@Expose
private Taglib taglib;

public List<Servlet> getServlet() {
return servlet;
}

public void setServlet(List<Servlet> servlet) {
this.servlet = servlet;
}

public ServletMapping getServletMapping() {
return servletMapping;
}

public void setServletMapping(ServletMapping servletMapping) {
this.servletMapping = servletMapping;
}

public Taglib getTaglib() {
return taglib;
}

public void setTaglib(Taglib taglib) {
this.taglib = taglib;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("servlet", servlet).append("servletMapping", servletMapping).append("taglib", taglib).toString();
}

}