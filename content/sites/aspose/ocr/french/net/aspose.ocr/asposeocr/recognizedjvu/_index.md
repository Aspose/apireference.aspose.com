---
title: AsposeOcr.RecognizeDjvu
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaître le texte dune image DJVU multipage.  Reconnaît le fichier DJVU avec la possibilité de spécifierDocumentRecognitionSettings . Prend uniquement en charge DJVU. Ne prend pas en charge dautres types dimages.
type: docs
weight: 120
url: /fr/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

Reconnaître le texte d'une image DJVU multipage.  Reconnaît le fichier DJVU avec la possibilité de spécifier[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Prend uniquement en charge DJVU. Ne prend pas en charge d'autres types d'images.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

Reconnaître le texte d'une image DJVU multipage.  Reconnaît le fichier DJVU avec la possibilité de spécifier[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Prend uniquement en charge DJVU. Ne prend pas en charge d'autres types d'images.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux de mémoire avec le fichier DJVU. |
| settings | DocumentRecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) liste des objets avec les résultats de la reconnaissance d'image.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


