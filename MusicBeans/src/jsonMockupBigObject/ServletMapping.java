package jsonMockupBigObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ServletMapping {

@SerializedName("cofaxCDS")
@Expose
private String cofaxCDS;
@SerializedName("cofaxEmail")
@Expose
private String cofaxEmail;
@SerializedName("cofaxAdmin")
@Expose
private String cofaxAdmin;
@SerializedName("fileServlet")
@Expose
private String fileServlet;
@SerializedName("cofaxTools")
@Expose
private String cofaxTools;

public String getCofaxCDS() {
return cofaxCDS;
}

public void setCofaxCDS(String cofaxCDS) {
this.cofaxCDS = cofaxCDS;
}

public String getCofaxEmail() {
return cofaxEmail;
}

public void setCofaxEmail(String cofaxEmail) {
this.cofaxEmail = cofaxEmail;
}

public String getCofaxAdmin() {
return cofaxAdmin;
}

public void setCofaxAdmin(String cofaxAdmin) {
this.cofaxAdmin = cofaxAdmin;
}

public String getFileServlet() {
return fileServlet;
}

public void setFileServlet(String fileServlet) {
this.fileServlet = fileServlet;
}

public String getCofaxTools() {
return cofaxTools;
}

public void setCofaxTools(String cofaxTools) {
this.cofaxTools = cofaxTools;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("cofaxCDS", cofaxCDS).append("cofaxEmail", cofaxEmail).append("cofaxAdmin", cofaxAdmin).append("fileServlet", fileServlet).append("cofaxTools", cofaxTools).toString();
}

}