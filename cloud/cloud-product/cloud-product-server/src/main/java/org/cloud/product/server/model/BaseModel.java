package org.cloud.product.server.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BaseModel{

	public int hashCode() {  
        return HashCodeBuilder.reflectionHashCode(this);  
    }  
  
    public String toString() {  
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);  
    }  
  
    public boolean equals(Object obj) {  
        return EqualsBuilder.reflectionEquals(this, obj);  
    }  

}
