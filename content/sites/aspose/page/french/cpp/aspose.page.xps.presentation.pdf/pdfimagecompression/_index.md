---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. Spécifie le type de compression appliqué aux images du fichier PDF en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Spécifie le type de compression appliqué aux images dans le fichier PDF.

```cpp
enum class PdfImageCompression
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Auto | 0 | Sélectionne automatiquement la compression la plus appropriée pour chaque image. |
| None | 1 | Enregistre les octets d’image bruts, ce qui entraîne des tailles de fichier PDF plus importantes. |
| Rle | 2 | Compression Run Length. |
| Flate | 3 | Compression Flate. |
| LzwBaselinePredictor | 4 | La sélection du prédicteur est limitée au prédicteur PNG Paeth pour accélérer le processus. En pratique, les performances sont étonnamment bonnes. Meilleur que [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | La sélection du prédicteur est plus compliquée et devrait entraîner des tailles d'image plus petites, mais prendre plus de temps. |
| Jpeg | 6 | Compression JPEG. Ne prend pas en charge la transparence. |

## Voir aussi

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
