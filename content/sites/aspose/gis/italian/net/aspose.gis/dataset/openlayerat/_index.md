---
title: Dataset.OpenLayerAt
second_title: Riferimento API Aspose.GIS per .NET
description: Dataset metodo. Apre il livello allindice specificato per la lettura.
type: docs
weight: 120
url: /it/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Apre il livello all'indice specificato per la lettura.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| index | Int32 | Indice del layer da aprire. |
| options | DriverOptions | Opzioni aperte. |

### Valore di ritorno

Lo strato aperto per la lettura.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo set di dati. |
| ArgumentOutOfRangeException | L'indice è fuori intervallo |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo set di dati. |
| [GisException](../../gisexception/) | Errore durante la lettura dell'elemento dal layer. |
| IOException | Si è verificato un errore di I/O. |

### Guarda anche

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* spazio dei nomi [Aspose.Gis](../../dataset/)
* assemblea [Aspose.GIS](../../../)


