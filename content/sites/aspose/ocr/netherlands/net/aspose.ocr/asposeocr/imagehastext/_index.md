---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR voor .NET API-referentie
description: AsposeOcr methode. Controleer of de afbeelding het aangeleverde tekstfragment bevat.
type: docs
weight: 80
url: /nl/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Controleer of de afbeelding het aangeleverde tekstfragment bevat.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Pad naar de afbeelding. |
| text | String | Tekstfragment om op de afbeelding te zoeken. |
| settings | RecognitionSettings | Herkenning instellingen. |
| ignoreCase | Boolean | Waar - betekent een niet-hoofdlettergevoelige zoekopdracht. |

### Winstwaarde

Waar als de afbeelding een tekstfragment bevat. Niet waar - afbeelding bevat geen tekstfragment.

### Opmerkingen

Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Zie ook

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Controleer of de afbeeldingstekst overeenkomt met de opgegeven reguliere expressie.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Pad naar de afbeelding. |
| regex | Regex | System.Text.RegularExpressions-object met het opgegeven patroon en opties. |
| settings | RecognitionSettings | Herkenning instellingen. |

### Winstwaarde

Waar als afbeeldingstekst overeenkomt met de opgegeven reguliere expressie.

### Opmerkingen

Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Zie ook

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)


