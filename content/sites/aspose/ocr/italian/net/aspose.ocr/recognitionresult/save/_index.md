---
title: RecognitionResult.Save
second_title: Aspose.OCR per Riferimento API .NET
description: RecognitionResult metodo. Salva il documento come testo normale PDF o documento Microsoft Word.
type: docs
weight: 130
url: /it/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Salva il documento come testo normale, PDF o documento Microsoft Word.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullFileName | String | Nome file con un percorso per salvare il risultato del riconoscimento nel formato selezionato. |
| saveFormat | SaveFormat | Formato del documento (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Imposta true per correggere le parole errate nel caso in cui siano presenti nel risultato del riconoscimento. |
| language | SpellCheckLanguage | Dizionario per il controllo ortografico (facoltativo). |
| dictionaryPath | String | Facoltativamente. Percorso completo del dizionario utente in formato .txt. Il formato è [parola - spazio - frequenza (numero)]. Esempio: il 23135851162\nquello 3400031103\n |

### Guarda anche

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* spazio dei nomi [Aspose.OCR](../../recognitionresult/)
* assemblea [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Salva il documento come testo normale, PDF o documento Microsoft Word.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream per salvare il risultato del riconoscimento nel formato selezionato. |
| saveFormat | SaveFormat | Formato del documento (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Imposta true per correggere le parole errate nel caso in cui siano presenti nel risultato del riconoscimento. |
| language | SpellCheckLanguage | Dizionario per il controllo ortografico (facoltativo). |
| dictionaryPath | String | Facoltativamente. Percorso completo del dizionario utente in formato .txt. Il formato è [parola - spazio - frequenza (numero)]. Esempio: il 23135851162\nquello 3400031103\n |

### Guarda anche

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* spazio dei nomi [Aspose.OCR](../../recognitionresult/)
* assemblea [Aspose.OCR](../../../)


