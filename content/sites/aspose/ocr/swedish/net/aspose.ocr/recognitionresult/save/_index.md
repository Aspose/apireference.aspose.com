---
title: RecognitionResult.Save
second_title: Aspose.OCR för .NET API-referens
description: RecognitionResult metod. Sparar dokumentet som vanlig text PDF eller Microsoft Worddokument.
type: docs
weight: 130
url: /sv/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Sparar dokumentet som vanlig text, PDF eller Microsoft Word-dokument.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullFileName | String | Filnamn med en sökväg för att spara igenkänningsresultat i det valda formatet. |
| saveFormat | SaveFormat | Dokumentformat (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Ställ in sant för att korrigera felstavade ord om du har sådana i ditt igenkänningsresultat. |
| language | SpellCheckLanguage | Ordbok för stavningskontroll (valfritt). |
| dictionaryPath | String | Valfritt. Fullständig sökväg till användarlexikonet i .txt-format. Formatet är [ord - mellanslag - frekvens(tal)]. Exempel: 23135851162\natt 3400031103\n |

### Se även

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* namnutrymme [Aspose.OCR](../../recognitionresult/)
* hopsättning [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Sparar dokumentet som vanlig text, PDF eller Microsoft Word-dokument.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream för att spara igenkänningsresultat i det valda formatet. |
| saveFormat | SaveFormat | Dokumentformat (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Ställ in sant för att korrigera felstavade ord om du har sådana i ditt igenkänningsresultat. |
| language | SpellCheckLanguage | Ordbok för stavningskontroll (valfritt). |
| dictionaryPath | String | Valfritt. Fullständig sökväg till användarlexikonet i .txt-format. Formatet är [ord - mellanslag - frekvens(tal)]. Exempel: 23135851162\natt 3400031103\n |

### Se även

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* namnutrymme [Aspose.OCR](../../recognitionresult/)
* hopsättning [Aspose.OCR](../../../)


