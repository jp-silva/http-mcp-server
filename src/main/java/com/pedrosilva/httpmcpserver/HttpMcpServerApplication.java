package com.pedrosilva.httpmcpserver;

import com.pedrosilva.httpmcpserver.tools.FavoritePeopleService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HttpMcpServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(HttpMcpServerApplication.class, args);
  }

  @Bean
  ToolCallbackProvider favoritePeopleTool(FavoritePeopleService favoritePeopleTools) {
    return MethodToolCallbackProvider.builder()
        .toolObjects(favoritePeopleTools)
        .build();
  }
}
