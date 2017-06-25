package oxford;

public class XReference {
  private String id;
  private String text;
  private String type;

  public XReference() {}

  public String getId() {
    return id;
  }

  public void setId(String idIn) {
    this.id = idIn;
  }

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }

  public String getType() {
    return type;
  }

  public void setType(String typeIn) {
    this.type = typeIn;
  }
}
