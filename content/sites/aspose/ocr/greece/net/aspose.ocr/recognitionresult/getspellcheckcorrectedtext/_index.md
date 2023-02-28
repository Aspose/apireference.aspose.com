---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Aspose.OCR για Αναφορά API .NET
description: RecognitionResult μέθοδος. Διορθώνει κείμενο αντικαθιστά ανορθόγραφες λέξεις.
type: docs
weight: 100
url: /el/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

Διορθώνει κείμενο (αντικαθιστά ανορθόγραφες λέξεις).

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| language | SpellCheckLanguage | Λεξικό προς χρήση. |
| dictionaryPath | String | Προαιρετικά. Πλήρης διαδρομή προς το λεξικό χρήστη (λεξικό συχνότητας). Μορφή αρχείου λεξικού: Αρχείο απλού κειμένου σε κωδικοποίηση UTF-8. Η συχνότητα του Word και του Word διαχωρίζονται με κενό ή καρτέλα. Από προεπιλογή, η λέξη αναμένεται στην πρώτη στήλη και η συχνότητα στη δεύτερη στήλη. Κάθε λέξη- ζεύγος συχνοτήτων σε ξεχωριστή γραμμή. Μια γραμμή ορίζεται ως μια ακολουθία χαρακτήρων ακολουθούμενη από μια τροφοδοσία γραμμής ("\n"), μια επιστροφή μεταφοράς ("\r"), ή μια επιστροφή μεταφοράς που ακολουθείται αμέσως από μια τροφοδοσία γραμμής ("\r\n"). Κάθε λέξη αναμένεται να είναι με πεζά. |

### Επιστρεφόμενη Αξία

Κείμενο με λέξεις που αντικαθίστανται.

### Δείτε επίσης

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* χώρος ονομάτων [Aspose.OCR](../../recognitionresult/)
* συνέλευση [Aspose.OCR](../../../)


