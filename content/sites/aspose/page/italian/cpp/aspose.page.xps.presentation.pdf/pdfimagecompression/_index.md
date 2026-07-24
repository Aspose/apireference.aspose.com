---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. Specifica il tipo di compressione applicata alle immagini nel file PDF in C++."
type: docs
weight: 700
url: /it/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Specifica il tipo di compressione applicata alle immagini nel file PDF.

```cpp
enum class PdfImageCompression
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Auto | 0 | Seleziona automaticamente la compressione più appropriata per ogni immagine. |
| None | 1 | Salva i byte grezzi dell’immagine, risultando in file PDF di dimensioni maggiori. |
| Rle | 2 | Compressione Run Length. |
| Flate | 3 | Compressione Flate. |
| LzwBaselinePredictor | 4 | La selezione del predittore è limitata al predittore PNG Paeth per velocizzare il processo. In pratica funziona sorprendentemente bene. È migliore di [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | La selezione del predittore è più complicata e dovrebbe produrre dimensioni di immagine più piccole, ma richiede più tempo. |
| Jpeg | 6 | Compressione JPEG. Non supporta la trasparenza. |

## Vedi anche

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
