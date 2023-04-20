---
title: Interface IFile
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.IO.IFile interfaccia. Un oggetto File è un oggetto Blob con un attributo name che è una stringa può essere creato allinterno dellapplicazione Web tramite un costruttore o è un riferimento a una sequenza di byte da un file dal file system OS sottostante.
type: docs
weight: 1940
url: /it/net/aspose.svg.io/ifile/
---
## IFile interface

Un oggetto File è un oggetto Blob con un attributo name, che è una stringa; può essere creato all'interno dell'applicazione Web tramite un costruttore o è un riferimento a una sequenza di byte da un file dal file system (OS) sottostante.

```csharp
public interface IFile : IBlob
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [LastModified](../../aspose.svg.io/ifile/lastmodified/) { get; } | La data dell'ultima modifica del file. Al momento dell'ottenimento, se i programmi utente possono rendere disponibili queste informazioni, questo deve restituire un long long impostato sull'ora in cui il file è stato modificato l'ultima volta come numero di millisecondi dall'epoca Unix. |
| [Name](../../aspose.svg.io/ifile/name/) { get; } | Il nome del file. Al momento dell'acquisizione, deve restituire il nome del file come stringa. |

### Guarda anche

* interface [IBlob](../iblob/)
* spazio dei nomi [Aspose.Svg.IO](../../aspose.svg.io/)
* assemblea [Aspose.SVG](../../)


