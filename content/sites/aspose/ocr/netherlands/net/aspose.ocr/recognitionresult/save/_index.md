---
title: RecognitionResult.Save
second_title: Aspose.OCR voor .NET API-referentie
description: RecognitionResult methode. Slaat het document op als platte tekst PDF of Microsoft Worddocument.
type: docs
weight: 130
url: /nl/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Slaat het document op als platte tekst, PDF of Microsoft Word-document.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullFileName | String | Bestandsnaam met een pad voor het opslaan van het herkenningsresultaat in de geselecteerde indeling. |
| saveFormat | SaveFormat | Documentformaat (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Stel waar in om verkeerd gespelde woorden te corrigeren voor het geval u dit in uw herkenningsresultaat hebt. |
| language | SpellCheckLanguage | Woordenboek voor spellingcontrole (optioneel). |
| dictionaryPath | String | Optioneel. Volledig pad naar het gebruikerswoordenboek in .txt-indeling. Formaat is [woord - spatie - frequentie(getal)]. Voorbeeld: de 23135851162\ndat 3400031103\n |

### Zie ook

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* naamruimte [Aspose.OCR](../../recognitionresult/)
* montage [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Slaat het document op als platte tekst, PDF of Microsoft Word-document.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream voor het opslaan van het herkenningsresultaat in het geselecteerde formaat. |
| saveFormat | SaveFormat | Documentformaat (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Stel waar in om verkeerd gespelde woorden te corrigeren voor het geval u dit in uw herkenningsresultaat hebt. |
| language | SpellCheckLanguage | Woordenboek voor spellingcontrole (optioneel). |
| dictionaryPath | String | Optioneel. Volledig pad naar het gebruikerswoordenboek in .txt-indeling. Formaat is [woord - spatie - frequentie(getal)]. Voorbeeld: de 23135851162\ndat 3400031103\n |

### Zie ook

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* naamruimte [Aspose.OCR](../../recognitionresult/)
* montage [Aspose.OCR](../../../)


