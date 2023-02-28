---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR voor .NET API-referentie
description: AsposeOcr methode. Corrigeert tekst vervangt verkeerd gespelde woorden.
type: docs
weight: 60
url: /nl/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

Corrigeert tekst (vervangt verkeerd gespelde woorden).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | String | Tekst ter correctie. |
| language | SpellCheckLanguage | Woordenboek om te gebruiken. |
| dictionaryPath | String | Optioneel. Volledig pad naar het gebruikerswoordenboek (frequentiewoordenboek). Bestandsindeling woordenboek: Platte tekstbestand in UTF-8-codering. Woord en woordfrequentie worden gescheiden door een spatie of tab. Standaard wordt het woord verwacht in de eerste kolom en de frequentie in de tweede kolom. Elk woord- frequentiepaar in een afzonderlijke regel. Een regel wordt gedefinieerd als een reeks tekens gevolgd door een regelinvoer ("\n"), een regelterugloop ("\r"), of een regelterugloop onmiddellijk gevolgd door een regelinvoer ("\r\n"). Elk woord wordt geacht in kleine letters te staan. |

### Winstwaarde

Tekst met vervangen woorden.

### Zie ook

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)


