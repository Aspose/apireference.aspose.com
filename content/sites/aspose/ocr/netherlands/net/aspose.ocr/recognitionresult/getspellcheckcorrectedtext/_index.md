---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Aspose.OCR voor .NET API-referentie
description: RecognitionResult methode. Corrigeert tekst vervangt verkeerd gespelde woorden.
type: docs
weight: 100
url: /nl/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

Corrigeert tekst (vervangt verkeerd gespelde woorden).

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| language | SpellCheckLanguage | Woordenboek om te gebruiken. |
| dictionaryPath | String | Optioneel. Volledig pad naar het gebruikerswoordenboek (frequentiewoordenboek). Bestandsindeling woordenboek: Platte tekstbestand in UTF-8-codering. Woord en woordfrequentie worden gescheiden door een spatie of tab. Standaard wordt het woord verwacht in de eerste kolom en de frequentie in de tweede kolom. Elk woord- frequentiepaar in een afzonderlijke regel. Een regel wordt gedefinieerd als een reeks tekens gevolgd door een regelinvoer ("\n"), een regelterugloop ("\r"), of een regelterugloop onmiddellijk gevolgd door een regelinvoer ("\r\n"). Elk woord wordt geacht in kleine letters te staan. |

### Winstwaarde

Tekst met vervangen woorden.

### Zie ook

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* naamruimte [Aspose.OCR](../../recognitionresult/)
* montage [Aspose.OCR](../../../)


