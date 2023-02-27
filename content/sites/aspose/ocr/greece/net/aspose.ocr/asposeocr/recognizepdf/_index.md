---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR για Αναφορά API .NET
description: AsposeOcr μέθοδος. Αναγνώριση κειμένου από σαρωμένο pdf εξαγωγή εικόνων.  Αναγνωρίζει αρχείο pdf με δυνατότητα καθορισμούDocumentRecognitionSettings . Υποστηρίζει μόνο σαρωμένο PDF. Δεν υποστηρίζει PDF με δυνατότητα αναζήτησης.
type: docs
weight: 220
url: /el/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Αναγνώριση κειμένου από σαρωμένο pdf (εξαγωγή εικόνων).  Αναγνωρίζει αρχείο pdf με δυνατότητα καθορισμού[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Υποστηρίζει μόνο σαρωμένο PDF. Δεν υποστηρίζει PDF με δυνατότητα αναζήτησης.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πλήρης διαδρομή προς την εικόνα. |
| settings | DocumentRecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

ο[`RecognitionResult`](../../recognitionresult/) αντικείμενο με αποτελέσματα αναγνώρισης εικόνας.

### Δείτε επίσης

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Αναγνώριση κειμένου από σαρωμένο pdf (εξαγωγή εικόνων).  Αναγνωρίζει αρχείο pdf με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει μόνο σαρωμένο PDF. Δεν υποστηρίζει PDF με δυνατότητα αναζήτησης.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | Ροή μνήμης με το αρχείο pdf. |
| settings | DocumentRecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

ο[`RecognitionResult`](../../recognitionresult/) αντικείμενο με αποτελέσματα αναγνώρισης εικόνας.

### Δείτε επίσης

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)


