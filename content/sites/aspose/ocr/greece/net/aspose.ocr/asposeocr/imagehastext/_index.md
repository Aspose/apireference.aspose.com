---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR για Αναφορά API .NET
description: AsposeOcr μέθοδος. Ελέγξτε αν η εικόνα περιέχει το παρεχόμενο τμήμα κειμένου.
type: docs
weight: 80
url: /el/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Ελέγξτε αν η εικόνα περιέχει το παρεχόμενο τμήμα κειμένου.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πορεία προς την εικόνα. |
| text | String | Θραύσμα κειμένου για αναζήτηση στην εικόνα. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |
| ignoreCase | Boolean | True - σημαίνει αναζήτηση χωρίς διάκριση πεζών-κεφαλαίων. |

### Επιστρεφόμενη Αξία

Σωστό εάν η εικόνα περιέχει τμήμα κειμένου. False - η εικόνα δεν περιέχει τμήμα κειμένου.

### Παρατηρήσεις

Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Δείτε επίσης

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Ελέγξτε αν το κείμενο της εικόνας ταιριάζει με την παρεχόμενη κανονική έκφραση.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πορεία προς την εικόνα. |
| regex | Regex | System.Text.RegularExpressions αντικείμενο με το παρεχόμενο μοτίβο και τις επιλογές. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

True αν το κείμενο της εικόνας ταιριάζει με την παρεχόμενη κανονική έκφραση.

### Παρατηρήσεις

Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Δείτε επίσης

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)


