---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR voor .NET API-referentie
description: AsposeOcr methode. Herkent tekst op afbeelding.
type: docs
weight: 140
url: /nl/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Herkent tekst op afbeelding.

```csharp
public string RecognizeImage(string fullPath)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Pad naar de afbeelding. |

### Winstwaarde

Herkende tekst.

### Opmerkingen

Maakt gebruik van automatische correctie van scheve afbeeldingen en detectie van tekstgebieden. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Zie ook

* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Herkent tekst op afbeelding.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Pad naar de afbeelding. |
| settings | RecognitionSettings | Herkenning instellingen. |

### Winstwaarde

De[`RecognitionResult`](../../recognitionresult/) object met resultaten voor beeldherkenning.

### Opmerkingen

Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Zie ook

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Herkent tekst op afbeelding.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | Geheugenstroom die de afbeelding bevat. |

### Winstwaarde

Herkende tekst.

### Opmerkingen

Maakt gebruik van automatische correctie van scheve afbeeldingen en detectie van tekstgebieden. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Zie ook

* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Herkent tekst op afbeelding.  Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | Geheugenstroom die de afbeelding bevat. |
| settings | RecognitionSettings | Herkenning instellingen. |

### Winstwaarde

De[`RecognitionResult`](../../recognitionresult/) object met resultaten voor beeldherkenning.

### Zie ook

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Herkent tekst op afbeelding.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageData | Byte[] | Gedecodeerde afbeelding in bytes-array. Gebruikt RGB-verlichtingstechnologie voor bitsPerPixel &gt; 1. |
| width | Int32 | Breedte afbeelding. |
| height | Int32 | Afbeelding hoogte. |
| pixelFormat | PixelType | Ondersteunt byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Herkenning instellingen. |

### Winstwaarde

De[`RecognitionResult`](../../recognitionresult/) object met resultaten voor beeldherkenning.

### Opmerkingen

Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt rij-gedecodeerde bytegegevens.

### Zie ook

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Herkent tekst op afbeelding.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageData | Color[] | Gedecodeerde afbeelding in Aspose.Drawing.Color-array. |
| width | Int32 | Breedte afbeelding. |
| height | Int32 | Afbeelding hoogte. |
| settings | RecognitionSettings | Herkenning instellingen. |

### Winstwaarde

De[`RecognitionResult`](../../recognitionresult/) object met resultaten voor beeldherkenning.

### Opmerkingen

Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt rij-gedecodeerde bytegegevens.

### Zie ook

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)


