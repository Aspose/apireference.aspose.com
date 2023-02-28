---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR für .NET-API-Referenz
description: RecognitionResult methode. Finden Sie die falsch geschriebenen Wörter mit vorgeschlagenen Schreibweisen für einen bestimmten Eingabetext.
type: docs
weight: 110
url: /de/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Finden Sie die falsch geschriebenen Wörter mit vorgeschlagenen Schreibweisen für einen bestimmten Eingabetext.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| language | SpellCheckLanguage | Wörterbuch zu verwenden. |
| dictionaryPath | String | Optional. Vollständiger Pfad zum Benutzerwörterbuch (Frequenzwörterbuch). Wörterbuchdateiformat: Nur-Text-Datei in UTF-8-Codierung. Wort und Worthäufigkeit sind durch Leerzeichen oder Tabulator getrennt. Standardmäßig wird das Wort in der ersten Spalte und die Häufigkeit in der zweiten Spalte erwartet. Jedes Wort- Frequenzpaar in einer separaten Zeile. Eine Zeile ist definiert als eine Folge von Zeichen gefolgt von einem Zeilenvorschub ("\n"), einem Wagenrücklauf ("\r"), oder einem Wagenrücklauf unmittelbar gefolgt von einem Zeilenvorschub ("\r\n"). Jedes Wort wird in Kleinbuchstaben erwartet. |

### Rückgabewert

Eine Liste von SpellCheckError-Objekten, die falsch geschriebene Wörter darstellen, mit Listen, die die korrekte Schreibweise für jedes falsch geschriebene Wort und den Bearbeitungsabstand vorschlagen.

### Siehe auch

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* namensraum [Aspose.OCR](../../recognitionresult/)
* Montage [Aspose.OCR](../../../)


