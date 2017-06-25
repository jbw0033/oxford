package oxford;

public class HeadwordEntry {

  private String id;
  private String language;
  private LexicalEntry[] lexicalEntries;
  private Pronunciation[] pronunciations;
  private String type;
  private String word;

  public HeadwordEntry() {}

  public String getId() {
    return id;
  }

  public void setId(String idIn) {
    this.id = idIn;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String languageIn) {
    this.language = languageIn;
  }

  public LexicalEntry[] getLexicalEntries() {
    return lexicalEntries;
  }

  public void setLexicalEntries(LexicalEntry[] lexicalEntriesIn) {
    this.lexicalEntries = lexicalEntriesIn;
  }

  public Pronunciation[] getPronunciations() {
    return pronunciations;
  }

  public void setPronunciations(Pronunciation[] pronunciationsIn) {
    this.pronunciations = pronunciationsIn;
  }

  public String getType() {
    return type;
  }

  public void setType(String typeIn) {
    this.type = typeIn;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String wordIn) {
    this.word = wordIn;
  }
}
