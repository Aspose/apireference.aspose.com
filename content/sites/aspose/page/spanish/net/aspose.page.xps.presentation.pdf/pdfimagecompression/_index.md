---
title: Enum PdfImageCompression
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression enumeración. Especifica el tipo de compresión aplicada a las imágenes en el archivo PDF.
type: docs
weight: 440
url: /es/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

Especifica el tipo de compresión aplicada a las imágenes en el archivo PDF.

```csharp
public enum PdfImageCompression
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Auto | `0` | Selecciona automáticamente la compresión más adecuada para cada imagen. |
| None | `1` | Guarda bytes de imagen sin procesar, lo que da como resultado archivos PDF de mayor tamaño. |
| Rle | `2` | Compresión de longitud de ejecución. |
| Flate | `3` | Compresión plana. |
| LzwBaselinePredictor | `4` | La selección del predictor está restringida al predictor PNG Paeth para acelerar el proceso. En la práctica funciona sorprendentemente bien. Mejor queLzwOptimizedPredictor . |
| LzwOptimizedPredictor | `5` | La selección del predictor es más complicada y debería generar tamaños de imagen más pequeños, pero lleva más tiempo. |
| Jpeg | `6` | Compresión JPEG. No admite transparencia. |

### Ver también

* espacio de nombres [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* asamblea [Aspose.Page](../../)


