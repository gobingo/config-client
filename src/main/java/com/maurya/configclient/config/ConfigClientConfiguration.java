package com.maurya.configclient.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@ConfigurationProperties(prefix = "config-client")
public class ConfigClientConfiguration {

  @NotNull
  private int someInt;

  @NotNull
  private String someString;

  @NotNull
  private Map<String, String> someMap = new HashMap<>();

  @NotNull
  private List<SomeConfig> someList = new ArrayList<>();

  public int getSomeInt() {
    return someInt;
  }

  public void setSomeInt(int someInt) {
    this.someInt = someInt;
  }

  public String getSomeString() {
    return someString;
  }

  public void setSomeString(String someString) {
    this.someString = someString;
  }

  public Map<String, String> getSomeMap() {
    return someMap;
  }

  public void setSomeMap(Map<String, String> someMap) {
    this.someMap = someMap;
  }

  public List<SomeConfig> getSomeList() {
    return someList;
  }

  public void setSomeList(List<SomeConfig> someList) {
    this.someList = someList;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }

}
