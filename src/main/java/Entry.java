package oxford;

public class Entry {
  private String[] etymologies;
  private GrammaticalFeatures[] grammaticalFeatures;
  private String homographNumber;
  private CategorizedText[] notes;
  private Pronunciation[] pronunciations;
  private Sense[] senses;
  private Variant[] variantForms;

  public Entry() {}

  public String[] getEtymologies() {
    return etymologies;
  }

  public void setEtymologies(String[] etymologiesIn) {
    this.etymologies = etymologiesIn;
  }

  public GrammaticalFeatures[] getGrammaticalFeatures() {
    return grammaticalFeatures;
  }

  public void setGrammaticalFeatures(GrammaticalFeatures[] grammaticalFeaturesIn) {
    this.grammaticalFeatures = grammaticalFeaturesIn;
  }

  public String getHomographNumber() {
    return homographNumber;
  }

  public void setHomographNumber(String homographNumberIn) {
    this.homographNumber = homographNumberIn;
  }

  public CategorizedText[] getNotes() {
    return notes;
  }

  public void setNotes(CategorizedText[] notesIn) {
    this.notes = notesIn;
  }

  public Pronunciation[] getPronunciations() {
    return pronunciations;
  }

  public void setPronunciations(Pronunciation[] pronunciationsIn) {
    this.pronunciations = pronunciationsIn;
  }

  public Sense[] getSenses() {
    return senses;
  }

  public void setSenses(Sense[] sensesIn) {
    this.senses = sensesIn;
  }

  public Variant[] getVariantForms() {
    return variantForms;
  }

  public void setVariantForms(Variant[] variantFormsIn) {
    this.variantForms = variantFormsIn;
  }
}
