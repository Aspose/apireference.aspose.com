---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression Enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression Enum. Gibt den Kompressionstyp an, der auf Bilder in der PDF-Datei in C++ angewendet wird."
type: docs
weight: 700
url: /de/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Gibt den Kompressionstyp an, der auf Bilder in der PDF-Datei angewendet wird.

```cpp
enum class PdfImageCompression
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Automatisch | 0 | Wählt automatisch die am besten geeignete Kompression für jedes Bild aus. |
| None | 1 | Speichert rohe Bildbytes, was zu größeren PDF-Dateigrößen führt. |
| Rle | 2 | Run-Length-Kompression. |
| Flate | 3 | Flate-Kompression. |
| LzwBaselinePredictor | 4 | Die Auswahl des Prädiktors ist auf den PNG-Paeth-Prädiktor beschränkt, um den Vorgang zu beschleunigen. In der Praxis funktioniert es überraschend gut. Besser als [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | Die Auswahl des Prädiktors ist komplizierter und sollte zu kleineren Bildgrößen führen, dauert jedoch länger. |
| Jpeg | 6 | JPEG-Kompression. Unterstützt keine Transparenz. |

## Siehe auch

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
