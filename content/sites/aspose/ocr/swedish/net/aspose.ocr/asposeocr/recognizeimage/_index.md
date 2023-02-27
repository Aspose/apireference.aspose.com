---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känner igen text på bild.
type: docs
weight: 140
url: /sv/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Känner igen text på bild.

```csharp
public string RecognizeImage(string fullPath)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |

### Returvärde

Igenkänd text.

### Anmärkningar

Använder automatisk snedställningskorrigering och detektering av textområden. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Känner igen text på bild.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| settings | RecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Känner igen text på bild.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller bilden. |

### Returvärde

Igenkänd text.

### Anmärkningar

Använder automatisk snedställningskorrigering och detektering av textområden. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Känner igen text på bild.  Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller bilden. |
| settings | RecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Känner igen text på bild.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageData | Byte[] | Avkodad bild i byte-array. Använder RGB-ljusteknik för bitsPerPixel &gt; 1. |
| width | Int32 | Bildens bredd. |
| height | Int32 | Bildhöjd. |
| pixelFormat | PixelType | Stöder byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder radavkodade bytedata.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Känner igen text på bild.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageData | Color[] | Avkodad bild i Aspose.Drawing.Color array. |
| width | Int32 | Bildens bredd. |
| height | Int32 | Bildhöjd. |
| settings | RecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder radavkodade bytedata.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


