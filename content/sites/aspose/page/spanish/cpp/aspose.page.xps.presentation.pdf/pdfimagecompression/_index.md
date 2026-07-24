---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enumeración"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enumeración. Especifica el tipo de compresión aplicado a las imágenes en el archivo PDF en C++."
type: docs
weight: 700
url: /es/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Especifica el tipo de compresión aplicado a las imágenes en el archivo PDF.

```cpp
enum class PdfImageCompression
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Automático | 0 | Selecciona automáticamente la compresión más adecuada para cada imagen. |
| None | 1 | Guarda los bytes de imagen sin procesar, lo que resulta en archivos PDF de mayor tamaño. |
| Rle | 2 | Compresión Run Length. |
| Flate | 3 | Compresión Flate. |
| LzwBaselinePredictor | 4 | La selección del predictor está restringida al predictor PNG Paeth para acelerar el proceso. En la práctica funciona sorprendentemente bien. Mejor que [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | La selección del predictor es más complicada y debería resultar en tamaños de imagen más pequeños, pero lleva más tiempo. |
| Jpeg | 6 | Compresión JPEG. No admite transparencia. |

## Ver también

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
