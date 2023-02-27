---
title: AsposeOcr.RecognizeMultipleImages
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Erkennt mehrere Bilder aus der Liste.  Archive und Ordner werden nicht unterstützt. Die maximale Anzahl verarbeiteter Bilder beträgt 20. Unterstützt GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 200
url: /de/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

Erkennt mehrere Bilder aus der Liste.  Archive und Ordner werden nicht unterstützt. Die maximale Anzahl verarbeiteter Bilder beträgt 20. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| files | List`1 | Vollständige Pfade zu den Bildern. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Anordnung von[`RecognitionResult`](../../recognitionresult/) Objekte mit Erkennungsergebnissen für jedes verarbeitete Bild.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

Erkennt mehrere Bilder aus der Liste mit Standardeinstellungen.  Archive und Ordner werden nicht unterstützt. Die maximale Anzahl verarbeiteter Bilder beträgt 20. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| files | List`1 | Vollständige Pfade zu den Bildern. |

### Rückgabewert

Anordnung von[`RecognitionResult`](../../recognitionresult/) Objekte mit Erkennungsergebnissen für jedes verarbeitete Bild.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

Erkennt mehrere Bilder, die in einem ZIP-Archiv oder aus einem Ordner gepackt sind.  Verschachtelte Archive und Ordner werden nicht unterstützt. Maximal 20 verarbeitete Bilder. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Vollständiger Pfad zum Zip-Archiv (einschließlich der Erweiterung .zip) oder zum Ordner mit Bildern. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Anordnung von[`RecognitionResult`](../../recognitionresult/) Objekte mit Erkennungsergebnissen für jedes verarbeitete Bild.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

Erkennt mehrere Bilder, die in einem ZIP-Archiv oder aus einem Ordner mit Standardeinstellungen gepackt sind.  Verschachtelte Archive und Ordner werden nicht unterstützt. Maximal 20 verarbeitete Bilder. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Vollständiger Pfad zum Zip-Archiv (einschließlich der Erweiterung .zip) oder zum Ordner mit Bildern. |

### Rückgabewert

Anordnung von[`RecognitionResult`](../../recognitionresult/) Objekte mit Erkennungsergebnissen für jedes verarbeitete Bild.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


