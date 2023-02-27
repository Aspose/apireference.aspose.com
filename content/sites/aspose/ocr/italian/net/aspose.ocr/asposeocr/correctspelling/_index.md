---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Corregge il testo sostituisce le parole errate.
type: docs
weight: 60
url: /it/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

Corregge il testo (sostituisce le parole errate).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | String | Testo da correggere. |
| language | SpellCheckLanguage | Dizionario da usare. |
| dictionaryPath | String | Facoltativamente. Percorso completo del dizionario utente (dizionario di frequenza). Formato del file del dizionario: File di testo normale con codifica UTF-8. Parola e frequenza della parola sono separate da spazio o tabulazione. Per impostazione predefinita, la parola è prevista nella prima colonna e la frequenza nella seconda colonna. Ogni parola- frequenza-coppia in una riga separata. Una riga è definita come una sequenza di caratteri seguita da un avanzamento riga ("\n"), un ritorno a capo ("\r"), o un ritorno a capo immediatamente seguito da un avanzamento riga ("\r\n"). Ogni parola dovrebbe essere in minuscolo. |

### Valore di ritorno

Testo con parole sostituite.

### Guarda anche

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


