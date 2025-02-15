---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Rättar text ersätter felstavade ord.
type: docs
weight: 60
url: /sv/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

Rättar text (ersätter felstavade ord).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Text för rättelse. |
| language | SpellCheckLanguage | Ordbok att använda. |
| dictionaryPath | String | Valfritt. Fullständig sökväg till användarordboken (frekvensordbok). Ordboksfilformat: Oformaterad textfil i UTF-8-kodning. Ord- och ordfrekvens separeras med mellanslag eller tabb. Som standard förväntas ordet i den första kolumnen och frekvensen i den andra kolumnen. Varje ord- frekvenspar på en separat rad. En rad definieras som en sekvens av tecken följt av en radmatning ("\n"), en radmatning ("\r"), eller en radmatning omedelbart följt av en radmatning ("\r\n"). Varje ord förväntas vara i gemener. |

### Returvärde

Text med ersatta ord.

### Se även

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


