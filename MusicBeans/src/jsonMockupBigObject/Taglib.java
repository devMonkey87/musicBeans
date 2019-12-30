package jsonMockupBigObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Taglib {

@SerializedName("taglib-uri")
@Expose
private String taglibUri;
@SerializedName("taglib-location")
@Expose
private String taglibLocation;

public String getTaglibUri() {
return taglibUri;
}

public void setTaglibUri(String taglibUri) {
this.taglibUri = taglibUri;
}

public String getTaglibLocation() {
return taglibLocation;
}

public void setTaglibLocation(String taglibLocation) {
this.taglibLocation = taglibLocation;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("taglibUri", taglibUri).append("taglibLocation", taglibLocation).toString();
}

}