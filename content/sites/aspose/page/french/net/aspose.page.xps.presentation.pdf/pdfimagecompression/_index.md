---
title: Enum PdfImageCompression
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression énumération. Spécifie le type de compression appliqué aux images dans le fichier PDF.
type: docs
weight: 430
url: /fr/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

Spécifie le type de compression appliqué aux images dans le fichier PDF.

```csharp
public enum PdfImageCompression
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| Auto | `0` | Sélectionne automatiquement la compression la plus appropriée pour chaque image. |
| None | `1` | Enregistre des octets d'image bruts, ce qui entraîne des fichiers PDF plus volumineux. |
| Rle | `2` | Compression de la longueur d'exécution. |
| Flate | `3` | Compression plate. |
| LzwBaselinePredictor | `4` | La sélection du prédicteur est limitée au prédicteur PNG Paeth pour accélérer le processus. En pratique, fonctionne étonnamment bien. Mieux queLzwOptimizedPredictor . |
| LzwOptimizedPredictor | `5` | La sélection des prédicteurs est plus compliquée et devrait entraîner des tailles d'image plus petites, mais prenant plus de temps. |
| Jpeg | `6` | Compression JPEG. Ne prend pas en charge la transparence. |

### Voir également

* espace de noms [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* Assemblée [Aspose.Page](../../)


