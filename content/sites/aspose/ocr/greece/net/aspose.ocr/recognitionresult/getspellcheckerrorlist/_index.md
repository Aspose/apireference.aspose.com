---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR για Αναφορά API .NET
description: RecognitionResult μέθοδος. Βρείτε τις ανορθόγραφες λέξεις με προτεινόμενη ορθογραφία για ένα δεδομένο κείμενο εισαγωγής.
type: docs
weight: 110
url: /el/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Βρείτε τις ανορθόγραφες λέξεις με προτεινόμενη ορθογραφία για ένα δεδομένο κείμενο εισαγωγής.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| language | SpellCheckLanguage | Λεξικό προς χρήση. |
| dictionaryPath | String | Προαιρετικά. Πλήρης διαδρομή προς το λεξικό χρήστη (λεξικό συχνότητας). Μορφή αρχείου λεξικού: Αρχείο απλού κειμένου σε κωδικοποίηση UTF-8. Η συχνότητα του Word και του Word διαχωρίζονται με κενό ή καρτέλα. Από προεπιλογή, η λέξη αναμένεται στην πρώτη στήλη και η συχνότητα στη δεύτερη στήλη. Κάθε λέξη- ζεύγος συχνοτήτων σε ξεχωριστή γραμμή. Μια γραμμή ορίζεται ως μια ακολουθία χαρακτήρων ακολουθούμενη από μια τροφοδοσία γραμμής ("\n"), μια επιστροφή μεταφοράς ("\r"), ή μια επιστροφή μεταφοράς που ακολουθείται αμέσως από μια τροφοδοσία γραμμής ("\r\n"). Κάθε λέξη αναμένεται να είναι με πεζά. |

### Επιστρεφόμενη Αξία

Μια λίστα αντικειμένων SpellCheckError που αντιπροσωπεύει λέξεις με ορθογραφικά λάθη με λίστες προτεινόμενες σωστές ορθογραφίες για κάθε λέξη με ορθογραφικό λάθος, και με την απόσταση επεξεργασίας.

### Δείτε επίσης

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* χώρος ονομάτων [Aspose.OCR](../../recognitionresult/)
* συνέλευση [Aspose.OCR](../../../)


