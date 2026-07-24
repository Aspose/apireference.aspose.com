---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. Specificeert het type compressie dat wordt toegepast op afbeeldingen in het PDF-bestand in C++."
type: docs
weight: 700
url: /nl/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Specificeert het type compressie dat wordt toegepast op afbeeldingen in het PDF-bestand.

```cpp
enum class PdfImageCompression
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Auto | 0 | Selecteert automatisch de meest geschikte compressie voor elke afbeelding. |
| None | 1 | Slaat ruwe afbeeldingsbytes op, wat resulteert in grotere PDF-bestandsgroottes. |
| Rle | 2 | Run-Length-compressie. |
| Flate | 3 | Flate-compressie. |
| LzwBaselinePredictor | 4 | Predictor-selectie is beperkt tot de PNG Paeth-predictor om het proces te versnellen. In de praktijk presteert het verrassend goed. Beter dan [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | Predictor-selectie is ingewikkelder en zou moeten resulteren in kleinere afbeeldingsgroottes, maar kost meer tijd. |
| Jpeg | 6 | JPEG-compressie. Ondersteunt geen transparantie. |

## Zie ook

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
