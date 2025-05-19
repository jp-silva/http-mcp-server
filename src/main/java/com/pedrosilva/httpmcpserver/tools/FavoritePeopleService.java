package com.pedrosilva.httpmcpserver.tools;

import java.util.Set;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class FavoritePeopleService {
  private static final Set<String> FAVORITE_PEOPLE = Set.of("Pedro Silva", "John Doe", "Jane Smith");

  @Tool(description = "returns a random favorite person")
  public String getFavoritePerson() {
    return FAVORITE_PEOPLE.stream()
        .skip((int) (Math.random() * FAVORITE_PEOPLE.size()))
        .findFirst()
        .orElse("No favorite person found");
  }

  public static void main(String[] args) {
    FavoritePeopleService client = new FavoritePeopleService();
    System.out.println(client.getFavoritePerson());
  }
}
