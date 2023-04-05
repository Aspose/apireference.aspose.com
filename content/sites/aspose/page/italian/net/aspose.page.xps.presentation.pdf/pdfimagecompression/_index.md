---
title: Enum PdfImageCompression
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression enum. Specifica il tipo di compressione applicato alle immagini nel file PDF.
type: docs
weight: 430
url: /it/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

Specifica il tipo di compressione applicato alle immagini nel file PDF.

```csharp
public enum PdfImageCompression
```

### I valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Auto | `0` | Seleziona automaticamente la compressione più appropriata per ogni immagine. |
| None | `1` | Risparmia byte di immagini grezze risultando in file PDF di dimensioni maggiori. |
| Rle | `2` | Compressione lunghezza corsa. |
| Flate | `3` | Compressione piatta. |
| LzwBaselinePredictor | `4` | La selezione del predittore è limitata al predittore PNG Paeth per accelerare il processo. In pratica si comporta sorprendentemente bene. Meglio diLzwOptimizedPredictor . |
| LzwOptimizedPredictor | `5` | La selezione del predittore è più complicata e dovrebbe comportare immagini di dimensioni inferiori, ma richiede più tempo. |
| Jpeg | `6` | Compressione JPEG. Non supporta la trasparenza. |

### Guarda anche

* spazio dei nomi [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* assemblea [Aspose.Page](../../)


