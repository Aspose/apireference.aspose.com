---
title: Class RecognitionResult
second_title: Aspose.OCR για Αναφορά API .NET
description: Aspose.OCR.RecognitionResult τάξη. Τα αποτελέσματα της αναγνώρισης εικόνας. Περιέχει στοιχεία με πληροφορίες αναγνώρισης και μεθόδους για την εξαγωγή αποτελεσμάτων.
type: docs
weight: 220
url: /el/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

Τα αποτελέσματα της αναγνώρισης εικόνας. Περιέχει στοιχεία με πληροφορίες αναγνώρισης και μεθόδους για την εξαγωγή αποτελεσμάτων.

```csharp
public class RecognitionResult
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Λαμβάνει ή ορίζει εικόνα για δημιουργία pdf. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Παίρνει συντεταγμένες ορθογωνίων. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Λαμβάνει αποτελέσματα αναγνώρισης λίστας μιας λίστας περιοχών (Ορθογώνια). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Ένα σύνολο χαρακτήρων που βρέθηκαν από τον αλγόριθμο αναγνώρισης και διατεταγμένα σε φθίνουσα σειρά πιθανότητας. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Λαμβάνει μια λίστα αποτελεσμάτων αναγνώρισης με μια λίστα σειρών (Ορθογώνια). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Λαμβάνει αποτέλεσμα αναγνώρισης σε μία συμβολοσειρά. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Παίρνει γωνία κλίσης. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Λαμβάνει λίστα με τα προειδοποιητικά μηνύματα που περιγράφουν μη κρίσιμα σφάλματα που εμφανίστηκαν κατά τη δημιουργία. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Φόρμα συμβολοσειράς JSON με αποτελέσματα αναγνώρισης. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Διορθώνει κείμενο (αντικαθιστά ανορθόγραφες λέξεις). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Βρείτε τις ανορθόγραφες λέξεις με προτεινόμενη ορθογραφία για ένα δεδομένο κείμενο εισαγωγής. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Φόρμα συμβολοσειράς XML με αποτελέσματα αναγνώρισης. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Αποθηκεύει το έγγραφο ως απλό κείμενο, PDF ή έγγραφο Microsoft Word. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Αποθηκεύει το έγγραφο ως απλό κείμενο, PDF ή έγγραφο Microsoft Word. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Για να συμπληρώσετε το πλήρες αποτέλεσμα από αναγνωρισμένα τμήματα (γραμμές). |

## Άλλα Μέλη

| Ονομα | Περιγραφή |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Αναγνωρισμένο κείμενο από σειρά με συντεταγμένες σειρών. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OCR](../../aspose.ocr/)
* συνέλευση [Aspose.OCR](../../)


