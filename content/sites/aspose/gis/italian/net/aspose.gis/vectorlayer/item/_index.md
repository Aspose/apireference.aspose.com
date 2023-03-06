---
title: VectorLayer.Item
second_title: Riferimento API Aspose.GIS per .NET
description: VectorLayer proprietà. Ottiene ilFeature allindice specificato.
type: docs
weight: 70
url: /it/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

Ottiene il[`Feature`](../../feature/) all'indice specificato.

```csharp
public virtual Feature this[int index] { get; }
```

| Parametro | Descrizione |
| --- | --- |
| index | L'indice della funzione. |

### Valore della proprietà

Il[`Feature`](../../feature/) .

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | viene generato se il livello è aperto in sola scrittura. |
| ArgumentOutOfRangeException | L'indice è fuori intervallo. |
| [GisException](../../gisexception/) | Errore durante la lettura della funzione dal file. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [Feature](../../feature/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)


