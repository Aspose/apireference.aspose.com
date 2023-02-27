---
title: AsposeOcr.RecognizeTiff
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaître le texte dune image TIFF multipage.  Reconnaît le fichier TIFF avec la possibilité de spécifierDocumentRecognitionSettings . Prend en charge TIFF TIF uniquement. Ne prend pas en charge dautres types dimages.
type: docs
weight: 240
url: /fr/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

Reconnaître le texte d'une image TIFF multipage.  Reconnaît le fichier TIFF avec la possibilité de spécifier[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Prend en charge TIFF (TIF) uniquement. Ne prend pas en charge d'autres types d'images.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin complet vers l'image. |
| settings | DocumentRecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) liste des objets avec les résultats de la reconnaissance d'image.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

Reconnaître le texte d'une image TIFF multipage.  Reconnaît le fichier TIFF avec la possibilité de spécifier[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Prend en charge TIFF (TIF) uniquement. Ne prend pas en charge d'autres types d'images.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux de mémoire avec le fichier TIFF. |
| settings | DocumentRecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) liste des objets avec les résultats de la reconnaissance d'image.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


