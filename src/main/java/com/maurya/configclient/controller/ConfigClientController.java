package com.maurya.configclient.controller;

import com.maurya.configclient.config.ConfigClientConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

  private final ConfigClientConfiguration configClientConfiguration;

  @Autowired
  public ConfigClientController(ConfigClientConfiguration configClientConfiguration) {
    this.configClientConfiguration = configClientConfiguration;
  }

  @RequestMapping("/ack")
  String getAck() {
    return configClientConfiguration.getSomeString() + StringUtils.SPACE +
      configClientConfiguration.getSomeList().get(0).getName();
  }

}
