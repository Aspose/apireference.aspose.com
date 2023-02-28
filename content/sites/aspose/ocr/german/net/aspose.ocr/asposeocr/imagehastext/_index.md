---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Überprüfen Sie ob das Bild das bereitgestellte Textfragment enthält.
type: docs
weight: 80
url: /de/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Überprüfen Sie, ob das Bild das bereitgestellte Textfragment enthält.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| text | String | Textfragment zum Suchen auf dem Bild. |
| settings | RecognitionSettings | Erkennungseinstellungen. |
| ignoreCase | Boolean | True - bedeutet eine Suche ohne Berücksichtigung der Groß-/Kleinschreibung. |

### Rückgabewert

True, wenn das Bild ein Textfragment enthält. Falsch – Bild enthält kein Textfragment.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Prüfen Sie, ob der Bildtext mit dem bereitgestellten regulären Ausdruck übereinstimmt.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| regex | Regex | System.Text.RegularExpressions-Objekt mit dem bereitgestellten Muster und den bereitgestellten Optionen. |
| settings | RecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

True, wenn der Bildtext mit dem bereitgestellten regulären Ausdruck übereinstimmt.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


