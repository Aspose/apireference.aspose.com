---
title: AsposeOcr.RecognizeImage
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaît le texte sur limage.
type: docs
weight: 140
url: /fr/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Reconnaît le texte sur l'image.

```csharp
public string RecognizeImage(string fullPath)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |

### Return_Value

Texte reconnu.

### Remarques

Utilise la correction automatique de l'inclinaison de l'image et la détection des zones de texte. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Reconnaît le texte sur l'image.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Reconnaît le texte sur l'image.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux mémoire contenant l'image. |

### Return_Value

Texte reconnu.

### Remarques

Utilise la correction automatique de l'inclinaison de l'image et la détection des zones de texte. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Reconnaît le texte sur l'image.  Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux mémoire contenant l'image. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Reconnaît le texte sur l'image.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| imageData | Byte[] | Image décodée dans un tableau d'octets. Utilise la technologie d'éclairage RVB pour bitsPerPixel &gt; 1. |
| width | Int32 | Largeur de l'image. |
| height | Int32 | Hauteur de l'image. |
| pixelFormat | PixelType | Prend en charge les octets, rvb, bgr, rgba. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend en charge les données d'octet décodées en ligne.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Reconnaît le texte sur l'image.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| imageData | Color[] | Image décodée dans le tableau Aspose.Drawing.Color. |
| width | Int32 | Largeur de l'image. |
| height | Int32 | Hauteur de l'image. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend en charge les données d'octet décodées en ligne.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


