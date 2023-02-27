---
title: AsposeOcr.RecognizeMultipleImages
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaît plusieurs images de la liste.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum dimages traitées est de 20. Prend en charge GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 200
url: /fr/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

Reconnaît plusieurs images de la liste.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| files | List`1 | Chemins complets vers les images. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Tableau de[`RecognitionResult`](../../recognitionresult/) objets avec des résultats de reconnaissance pour chaque image traitée.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

Reconnaît plusieurs images de la liste avec les paramètres par défaut.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| files | List`1 | Chemins complets vers les images. |

### Return_Value

Tableau de[`RecognitionResult`](../../recognitionresult/) objets avec des résultats de reconnaissance pour chaque image traitée.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

Reconnaît plusieurs images emballées dans une archive ZIP ou à partir d'un dossier.  Les archives et les dossiers imbriqués ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin complet vers l'archive zip (y compris l'extension .zip) ou vers le dossier contenant les images. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Tableau de[`RecognitionResult`](../../recognitionresult/) objets avec des résultats de reconnaissance pour chaque image traitée.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

Reconnaît plusieurs images emballées dans une archive ZIP ou à partir d'un dossier avec les paramètres par défaut.  Les archives et les dossiers imbriqués ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin complet vers l'archive zip (y compris l'extension .zip) ou vers le dossier contenant les images. |

### Return_Value

Tableau de[`RecognitionResult`](../../recognitionresult/) objets avec des résultats de reconnaissance pour chaque image traitée.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


