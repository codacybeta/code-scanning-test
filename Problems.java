public class Problems {
  private String name;
  private Integer count;
  
  public Problems(String name, Integer count) {
    this.name = name;
    this.count = count;
  }

  public List<String> complexShennanigans(List<String> simpleStuff) {
    return simpleStuff.stream.map(s -> s.replace(name, count.toString()).collect(Collectors.toList());
  }
}
