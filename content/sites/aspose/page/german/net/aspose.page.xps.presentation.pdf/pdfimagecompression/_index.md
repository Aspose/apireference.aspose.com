---
title: Enum PdfImageCompression
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression opsomming. Gibt den Komprimierungstyp an der auf Bilder in der PDFDatei angewendet wird.
type: docs
weight: 430
url: /de/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

Gibt den Komprimierungstyp an, der auf Bilder in der PDF-Datei angewendet wird.

```csharp
public enum PdfImageCompression
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Auto | `0` | Wählt automatisch die am besten geeignete Komprimierung für jedes Bild aus. |
| None | `1` | Speichert Rohbild-Bytes, was zu größeren PDF-Dateigrößen führt. |
| Rle | `2` | Komprimierung der Lauflänge. |
| Flate | `3` | Flate-Komprimierung. |
| LzwBaselinePredictor | `4` | Die Prädiktorauswahl ist auf den PNG-Paeth-Prädiktor beschränkt, um den Prozess zu beschleunigen. In der Praxis schneidet überraschend gut ab. Besser alsLzwOptimizedPredictor . |
| LzwOptimizedPredictor | `5` | Die Auswahl des Prädiktors ist komplizierter und sollte zu kleineren Bildgrößen führen, aber nimmt mehr Zeit in Anspruch. |
| Jpeg | `6` | JPEG-Komprimierung. Unterstützt keine Transparenz. |

### Siehe auch

* namensraum [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* Montage [Aspose.Page](../../)


