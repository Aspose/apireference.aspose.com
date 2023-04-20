---
title: Interface IBlob
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.IO.IBlob interfaccia. Un oggetto Blob fa riferimento a una sequenza di byte e ha un attributo size che è il numero totale di byte nella sequenza di byte e un attributo type che è una stringa con codifica ASCII in lettere minuscole che rappresenta il tipo di supporto della sequenza di byte .
type: docs
weight: 1920
url: /it/net/aspose.svg.io/iblob/
---
## IBlob interface

Un oggetto Blob fa riferimento a una sequenza di byte e ha un attributo size che è il numero totale di byte nella sequenza di byte e un attributo type, che è una stringa con codifica ASCII in lettere minuscole che rappresenta il tipo di supporto della sequenza di byte .

```csharp
public interface IBlob
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Size](../../aspose.svg.io/iblob/size/) { get; } | Restituisce la dimensione della sequenza di byte in numero di byte. Al momento dell'acquisizione, gli user agent conformi devono restituire il numero totale di byte che possono essere letti da un oggetto FileReader o FileReaderSync, oppure 0 se il Blob non ha byte da leggere . |
| [Type](../../aspose.svg.io/iblob/type/) { get; } | La stringa con codifica ASCII in minuscolo che rappresenta il tipo di supporto del Blob. Al momento dell'acquisizione, i programmi utente devono restituire il tipo di un Blob come una stringa con codifica ASCII in minuscolo, in modo tale che quando viene convertito in un byte sequenza, è un tipo MIME analizzabile, o la stringa vuota – 0 byte – se il tipo non può essere determinato. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Slice](../../aspose.svg.io/iblob/slice/)(ulong, ulong, string) | Restituisce un nuovo oggetto Blob con byte che vanno dal parametro start facoltativo fino al parametro end facoltativo, escluso, e con un attributo type che è il valore del parametro contentType facoltativo. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.IO](../../aspose.svg.io/)
* assemblea [Aspose.SVG](../../)


