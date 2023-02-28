---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR voor .NET API-referentie
description: RecognitionResult methode. Zoek de verkeerd gespelde woorden met voorgestelde spelling voor een bepaalde invoertekst.
type: docs
weight: 110
url: /nl/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Zoek de verkeerd gespelde woorden met voorgestelde spelling voor een bepaalde invoertekst.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| language | SpellCheckLanguage | Woordenboek om te gebruiken. |
| dictionaryPath | String | Optioneel. Volledig pad naar het gebruikerswoordenboek (frequentiewoordenboek). Bestandsindeling woordenboek: Platte tekstbestand in UTF-8-codering. Woord en woordfrequentie worden gescheiden door een spatie of tab. Standaard wordt het woord verwacht in de eerste kolom en de frequentie in de tweede kolom. Elk woord- frequentiepaar in een afzonderlijke regel. Een regel wordt gedefinieerd als een reeks tekens gevolgd door een regelinvoer ("\n"), een regelterugloop ("\r"), of een regelterugloop onmiddellijk gevolgd door een regelinvoer ("\r\n"). Elk woord wordt geacht in kleine letters te staan. |

### Winstwaarde

Een lijst met SpellCheckError-objecten die verkeerd gespelde woorden vertegenwoordigen met lijsten met voorgestelde correcte spellingen voor elk verkeerd gespeld woord, en met de bewerkingsafstand.

### Zie ook

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* naamruimte [Aspose.OCR](../../recognitionresult/)
* montage [Aspose.OCR](../../../)


