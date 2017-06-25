package oxford;

public class RetrieveEntry {
  private Object metadata;
  private HeadwordEntry[] results;

  public RetrieveEntry() {}

  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadataIn) {
    this.metadata = metadataIn;
  }

  public HeadwordEntry[] getResults() {
    return results;
  }

  public void setResults(HeadwordEntry[] resultsIn) {
    this.results = resultsIn;
  }

  public String toString() {
    String output = "--" + results[0].getWord() + "--\n\n";

    for (LexicalEntry le : results[0].getLexicalEntries()) {
      output += le.getLexicalCategory() + "-\n";

      for (Entry entry : le.getEntries()) {
        for (Sense s : entry.getSenses()) {
          output += s + "\n";
        }
      }
    }

    return output;
  }
}
