---
title: Class OutputStream
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.IO.OutputStream classe. Un flusso surrogato esegue il wrapping del flusso di output reale e ne controlla laccesso. OutputStream contiene dati URI che descrivono la posizione del flusso di output.
type: docs
weight: 1980
url: /it/net/aspose.svg.io/outputstream/
---
## OutputStream class

Un flusso surrogato esegue il wrapping del flusso di output reale e ne controlla l'accesso. `OutputStream` contiene dati URI che descrivono la posizione del flusso di output.

```csharp
public class OutputStream : Stream
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [OutputStream](outputstream/)(Stream, string) | Inizializza una nuova istanza di`OutputStream` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [CanRead](../../aspose.svg.io/outputstream/canread/) { get; } | Ottiene un valore che indica se il flusso di output sottoposto a wrapping supporta la lettura. |
| override [CanSeek](../../aspose.svg.io/outputstream/canseek/) { get; } | Ottiene un valore che indica se il flusso di output sottoposto a wrapping supporta la ricerca. |
| override [CanWrite](../../aspose.svg.io/outputstream/canwrite/) { get; } | Ottiene un valore che indica se il flusso di output sottoposto a wrapping supporta la scrittura. |
| override [Length](../../aspose.svg.io/outputstream/length/) { get; } | Ottiene la lunghezza in byte del flusso di output avvolto. |
| override [Position](../../aspose.svg.io/outputstream/position/) { get; set; } | Ottiene o imposta la posizione all'interno del flusso di output avvolto. |
| [Uri](../../aspose.svg.io/outputstream/uri/) { get; } | Ottiene l'URI della posizione del flusso. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Close](../../aspose.svg.io/outputstream/close/)() | Chiude il flusso di output avvolto e il flusso corrente. |
| override [Flush](../../aspose.svg.io/outputstream/flush/)() | Cancella tutti i buffer per il flusso di output avvolto e fa sì che tutti i dati memorizzati nel buffer vengano scritti nel dispositivo sottostante. |
| override [Read](../../aspose.svg.io/outputstream/read/)(byte[], int, int) | Legge una sequenza di byte dal flusso di output avvolto e fa avanzare la posizione all'interno del flusso del numero di byte letti. |
| override [Seek](../../aspose.svg.io/outputstream/seek/)(long, SeekOrigin) | Imposta la posizione all'interno del flusso di output avvolto. |
| override [SetLength](../../aspose.svg.io/outputstream/setlength/)(long) | Imposta la lunghezza del flusso di output avvolto. |
| override [Write](../../aspose.svg.io/outputstream/write/)(byte[], int, int) | Scrive una sequenza di byte nel flusso output avvolto e fa avanzare la posizione corrente all'interno di questo flusso del numero di byte scritti. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.IO](../../aspose.svg.io/)
* assemblea [Aspose.SVG](../../)


