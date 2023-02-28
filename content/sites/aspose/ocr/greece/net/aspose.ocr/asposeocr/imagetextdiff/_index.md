---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR για Αναφορά API .NET
description: AsposeOcr μέθοδος. Συγκρίνετε τα κείμενα στις δύο εικόνες και επιστρέψτε έναν αριθμό που αντιπροσωπεύει πόσο μοιάζουν 0 έως 1.
type: docs
weight: 90
url: /el/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Συγκρίνετε τα κείμενα στις δύο εικόνες και επιστρέψτε έναν αριθμό που αντιπροσωπεύει πόσο μοιάζουν (0 έως 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath1 | String | Διαδρομή προς την πρώτη εικόνα. |
| fullPath2 | String | Διαδρομή προς τη δεύτερη εικόνα. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |
| ignoreCase | Boolean | True - σημαίνει αναζήτηση χωρίς διάκριση πεζών-κεφαλαίων. |

### Επιστρεφόμενη Αξία

Το 0 σημαίνει ότι τα κείμενα είναι τελείως διαφορετικά. 1 σημαίνει ότι τα κείμενα είναι πανομοιότυπα.

### Δείτε επίσης

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)


