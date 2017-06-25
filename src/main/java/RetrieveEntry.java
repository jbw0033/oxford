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
}
