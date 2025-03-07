---
title: RecognitionResult.Save
second_title: Aspose.OCR für .NET-API-Referenz
description: RecognitionResult methode. Speichert das Dokument als einfaches Text PDF oder Microsoft WordDokument.
type: docs
weight: 130
url: /de/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Speichert das Dokument als einfaches Text-, PDF- oder Microsoft Word-Dokument.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullFileName | String | Dateiname mit Pfad zum Speichern des Erkennungsergebnisses im ausgewählten Format. |
| saveFormat | SaveFormat | Dokumentenformat (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Setzen Sie True, um falsch geschriebene Wörter zu korrigieren, falls Sie solche in Ihrem Erkennungsergebnis haben. |
| language | SpellCheckLanguage | Wörterbuch für die Rechtschreibprüfung (optional). |
| dictionaryPath | String | Optional. Vollständiger Pfad zum Benutzerwörterbuch im TXT-Format. Das Format ist [Wort - Leerzeichen - Häufigkeit (Zahl)]. Beispiel: die 23135851162\ndie 3400031103\n |

### Siehe auch

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* namensraum [Aspose.OCR](../../recognitionresult/)
* Montage [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Speichert das Dokument als einfaches Text-, PDF- oder Microsoft Word-Dokument.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream zum Speichern des Erkennungsergebnisses im ausgewählten Format. |
| saveFormat | SaveFormat | Dokumentenformat (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Setzen Sie True, um falsch geschriebene Wörter zu korrigieren, falls Sie solche in Ihrem Erkennungsergebnis haben. |
| language | SpellCheckLanguage | Wörterbuch für die Rechtschreibprüfung (optional). |
| dictionaryPath | String | Optional. Vollständiger Pfad zum Benutzerwörterbuch im TXT-Format. Das Format ist [Wort - Leerzeichen - Häufigkeit (Zahl)]. Beispiel: die 23135851162\ndie 3400031103\n |

### Siehe auch

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* namensraum [Aspose.OCR](../../recognitionresult/)
* Montage [Aspose.OCR](../../../)


