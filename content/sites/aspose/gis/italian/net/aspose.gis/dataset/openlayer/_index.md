---
title: Dataset.OpenLayer
second_title: Riferimento API Aspose.GIS per .NET
description: Dataset metodo. Apre il livello con il nome specificato per la lettura.
type: docs
weight: 110
url: /it/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Apre il livello con il nome specificato per la lettura.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Nome del layer da aprire. |
| options | DriverOptions | Opzioni aperte. |

### Valore di ritorno

Lo strato aperto per la lettura.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | Il layer con il nome specificato non esiste; L'oggetto Opzioni ha un tipo errato per questo set di dati. |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo set di dati. |
| ArgumentNullException | Il nome è`null`. |
| [GisException](../../gisexception/) | Errore durante la lettura dell'elemento dal layer. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* spazio dei nomi [Aspose.Gis](../../dataset/)
* assemblea [Aspose.GIS](../../../)


