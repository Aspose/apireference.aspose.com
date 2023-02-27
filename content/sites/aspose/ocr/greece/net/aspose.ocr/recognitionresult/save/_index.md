---
title: RecognitionResult.Save
second_title: Aspose.OCR για Αναφορά API .NET
description: RecognitionResult μέθοδος. Αποθηκεύει το έγγραφο ως απλό κείμενο PDF ή έγγραφο Microsoft Word.
type: docs
weight: 130
url: /el/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Αποθηκεύει το έγγραφο ως απλό κείμενο, PDF ή έγγραφο Microsoft Word.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullFileName | String | Όνομα αρχείου με διαδρομή για αποθήκευση του αποτελέσματος αναγνώρισης στην επιλεγμένη μορφή. |
| saveFormat | SaveFormat | Μορφή εγγράφου (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Ορίστε το true για να διορθώσετε τις λέξεις που έχουν γραφτεί σωστά σε περίπτωση που έχετε τέτοιες στο αποτέλεσμα αναγνώρισής σας. |
| language | SpellCheckLanguage | Λεξικό για ορθογραφικό έλεγχο (προαιρετικό). |
| dictionaryPath | String | Προαιρετικά. Πλήρης διαδρομή προς το λεξικό χρήστη σε μορφή .txt. Η μορφή είναι [λέξη - διάστημα - συχνότητα(αριθμός)]. Παράδειγμα: το 23135851162\nότι 3400031103\n |

### Δείτε επίσης

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* χώρος ονομάτων [Aspose.OCR](../../recognitionresult/)
* συνέλευση [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Αποθηκεύει το έγγραφο ως απλό κείμενο, PDF ή έγγραφο Microsoft Word.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream για αποθήκευση του αποτελέσματος αναγνώρισης στην επιλεγμένη μορφή. |
| saveFormat | SaveFormat | Μορφή εγγράφου (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Ορίστε το true για να διορθώσετε τις λέξεις που έχουν γραφτεί σωστά σε περίπτωση που έχετε τέτοιες στο αποτέλεσμα αναγνώρισής σας. |
| language | SpellCheckLanguage | Λεξικό για ορθογραφικό έλεγχο (προαιρετικό). |
| dictionaryPath | String | Προαιρετικά. Πλήρης διαδρομή προς το λεξικό χρήστη σε μορφή .txt. Η μορφή είναι [λέξη - διάστημα - συχνότητα(αριθμός)]. Παράδειγμα: το 23135851162\nότι 3400031103\n |

### Δείτε επίσης

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* χώρος ονομάτων [Aspose.OCR](../../recognitionresult/)
* συνέλευση [Aspose.OCR](../../../)


