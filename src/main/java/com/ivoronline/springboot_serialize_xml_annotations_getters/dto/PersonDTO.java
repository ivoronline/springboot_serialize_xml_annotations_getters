package com.ivoronline.springboot_serialize_xml_annotations_getters.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "personelement")
public class PersonDTO {

  //PROPERTIES
  private Integer id;
  private String  name;
  private Integer age;

  //SETTERS (Used by us to set Properties)
  public void setId  (Integer id  ) { this.id   = id;   }
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age ) { this.age  = age;  }

  //GETTERS (Used by JAXB for Marshaling)
  @XmlAttribute(name = "personid"  ) public Integer getId  () { return id;               }
  @XmlElement  (name = "personname") public String  getName() { return "Getter " + name; }
  @XmlTransient                      public Integer getAge () { return age;              }

}



