---
title: Enum PdfImageCompression
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression uppräkning. Anger vilken typ av komprimering som tillämpas på bilder i PDFfilen.
type: docs
weight: 440
url: /sv/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

Anger vilken typ av komprimering som tillämpas på bilder i PDF-filen.

```csharp
public enum PdfImageCompression
```

### Värderingar

| namn | Värde | Beskrivning |
| --- | --- | --- |
| Auto | `0` | Väljer automatiskt den lämpligaste komprimeringen för varje bild. |
| None | `1` | Sparar råa bildbytes vilket resulterar i större PDF-filstorlekar. |
| Rle | `2` | Run Length-komprimering. |
| Flate | `3` | Flate compression. |
| LzwBaselinePredictor | `4` | Prediktorval är begränsat till PNG Paeth-prediktor för att påskynda processen. I praktiken presterar förvånansvärt bra. Bättre änLzwOptimizedPredictor . |
| LzwOptimizedPredictor | `5` | Val av prediktor är mer komplicerat och bör resultera i mindre bildstorlekar men tar längre tid. |
| Jpeg | `6` | JPEG-komprimering. Stöder inte transparens. |

### Se även

* namnutrymme [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* hopsättning [Aspose.Page](../../)


