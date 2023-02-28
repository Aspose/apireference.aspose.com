---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Erkennt Text auf dem Bild.
type: docs
weight: 140
url: /de/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Erkennt Text auf dem Bild.

```csharp
public string RecognizeImage(string fullPath)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |

### Rückgabewert

Erkannter Text.

### Bemerkungen

Verwendet automatische Bildschrägkorrektur und Erkennung von Textbereichen. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Erkennt Text auf dem Bild.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Erkennt Text auf dem Bild.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom, der das Bild enthält. |

### Rückgabewert

Erkannter Text.

### Bemerkungen

Verwendet automatische Bildschrägkorrektur und Erkennung von Textbereichen. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Erkennt Text auf dem Bild.  Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom, der das Bild enthält. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Erkennt Text auf dem Bild.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageData | Byte[] | Decodiertes Bild im Byte-Array. Verwendet RGB-Beleuchtungstechnologie für BitsPerPixel &gt; 1. |
| width | Int32 | Bild breite. |
| height | Int32 | Bildhöhe. |
| pixelFormat | PixelType | Unterstützt Byte, RGB, BGR, RGBA. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt zeilendecodierte Bytedaten.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Erkennt Text auf dem Bild.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageData | Color[] | Dekodiertes Bild im Aspose.Drawing.Color-Array. |
| width | Int32 | Bild breite. |
| height | Int32 | Bildhöhe. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt zeilendecodierte Bytedaten.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


