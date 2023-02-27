---
title: AsposeOcr.RecognizePdf
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaître le texte dun pdf numérisé extraire des images.  Reconnaît le fichier pdf avec la possibilité de spécifierDocumentRecognitionSettings . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables.
type: docs
weight: 220
url: /fr/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Reconnaître le texte d'un pdf numérisé (extraire des images).  Reconnaît le fichier pdf avec la possibilité de spécifier[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin complet vers l'image. |
| settings | DocumentRecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Reconnaître le texte d'un pdf numérisé (extraire des images).  Reconnaît le fichier pdf avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux de mémoire avec le fichier pdf. |
| settings | DocumentRecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


