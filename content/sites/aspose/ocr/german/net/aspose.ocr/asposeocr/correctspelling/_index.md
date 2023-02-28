---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Korrigiert Text ersetzt falsch geschriebene Wörter.
type: docs
weight: 60
url: /de/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

Korrigiert Text (ersetzt falsch geschriebene Wörter).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | String | Text zur Korrektur. |
| language | SpellCheckLanguage | Wörterbuch zu verwenden. |
| dictionaryPath | String | Optional. Vollständiger Pfad zum Benutzerwörterbuch (Frequenzwörterbuch). Wörterbuchdateiformat: Nur-Text-Datei in UTF-8-Codierung. Wort und Worthäufigkeit sind durch Leerzeichen oder Tabulator getrennt. Standardmäßig wird das Wort in der ersten Spalte und die Häufigkeit in der zweiten Spalte erwartet. Jedes Wort- Frequenzpaar in einer separaten Zeile. Eine Zeile ist definiert als eine Folge von Zeichen gefolgt von einem Zeilenvorschub ("\n"), einem Wagenrücklauf ("\r"), oder einem Wagenrücklauf unmittelbar gefolgt von einem Zeilenvorschub ("\r\n"). Jedes Wort wird in Kleinbuchstaben erwartet. |

### Rückgabewert

Text mit ersetzten Wörtern.

### Siehe auch

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


