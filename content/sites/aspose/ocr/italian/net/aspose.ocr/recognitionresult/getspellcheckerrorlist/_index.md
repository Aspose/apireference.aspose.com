---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR per Riferimento API .NET
description: RecognitionResult metodo. Trova le parole errate con lortografia suggerita per un determinato testo di input.
type: docs
weight: 110
url: /it/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Trova le parole errate con l'ortografia suggerita per un determinato testo di input.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| language | SpellCheckLanguage | Dizionario da usare. |
| dictionaryPath | String | Facoltativamente. Percorso completo del dizionario utente (dizionario di frequenza). Formato del file del dizionario: File di testo normale con codifica UTF-8. Parola e frequenza della parola sono separate da spazio o tabulazione. Per impostazione predefinita, la parola è prevista nella prima colonna e la frequenza nella seconda colonna. Ogni parola- frequenza-coppia in una riga separata. Una riga è definita come una sequenza di caratteri seguita da un avanzamento riga ("\n"), un ritorno a capo ("\r"), o un ritorno a capo immediatamente seguito da un avanzamento riga ("\r\n"). Ogni parola dovrebbe essere in minuscolo. |

### Valore di ritorno

Un elenco di oggetti SpellCheckError che rappresentano le parole con errori di ortografia con elenchi che suggeriscono l'ortografia corretta per ogni parola con errori di ortografia, e con la distanza di modifica.

### Guarda anche

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* spazio dei nomi [Aspose.OCR](../../recognitionresult/)
* assemblea [Aspose.OCR](../../../)


