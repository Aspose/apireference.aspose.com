---
title: VectorLayer.UseSpatialIndex
second_title: Riferimento API Aspose.GIS per .NET
description: VectorLayer metodo. Carica lindice spaziale per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro comeWhereIntersects eNearestTo. Se lindice non esiste lo crea prima. UtilizzoforceRebuild per forzare la ricreazione dellindice.
type: docs
weight: 190
url: /it/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Carica l'indice spaziale per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro come[`WhereIntersects`](../../featuressequence/whereintersects/) e[`NearestTo`](../nearestto/). Se l'indice non esiste, lo crea prima. Utilizzo*forceRebuild* per forzare la ricreazione dell'indice.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indexPath | String | Percorso del file indice. |
| forceRebuild | Boolean | Indica se ricreare l'indice anche se esiste già. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| IOException | Si è verificato un errore di I/O. |
| InvalidOperationException | L'indice spaziale è già caricato per questo layer. |
| [GisException](../../gisexception/) | Il file esiste e non è un file di indice spaziale creato da Aspose.GIS. |

### Guarda anche

* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Carica l'indice spaziale per velocizzare il filtraggio in base al valore degli attributi nei metodi di filtro come[`WhereIntersects`](../../featuressequence/whereintersects/) e[`NearestTo`](../nearestto/). Se l'indice non esiste, lo crea prima. Utilizzo*forceRebuild* per forzare la ricreazione dell'indice.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indexPath | AbstractPath | Percorso del file indice. |
| forceRebuild | Boolean | Indica se ricreare l'indice anche se esiste già. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il percorso è`null`. |
| IOException | Si è verificato un errore di I/O. |
| InvalidOperationException | L'indice spaziale è già caricato per questo layer. |
| [GisException](../../gisexception/) | Il file esiste e non è un file di indice spaziale creato da Aspose.GIS. |

### Guarda anche

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)


