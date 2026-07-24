---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. Anger typen av kompression som tillämpas på bilder i PDF-filen i C++."
type: docs
weight: 700
url: /sv/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Anger typen av kompression som tillämpas på bilder i PDF-filen.

```cpp
enum class PdfImageCompression
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Auto | 0 | Väljer automatiskt den mest lämpliga kompressionen för varje bild. |
| None | 1 | Sparar råa bildbytes, vilket resulterar i större PDF-filstorlekar. |
| Rle | 2 | Run Length-kompression. |
| Flate | 3 | Flate-kompression. |
| LzwBaselinePredictor | 4 | Prediktorval är begränsat till PNG Paeth-prediktor för att påskynda processen. I praktiken fungerar det förvånansvärt bra. Bättre än [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | Predictor selection is more complicated and should result in smaller image sizes but taking more time. |
| Jpeg | 6 | JPEG compression. Does not support transparency. |

## Se även

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
