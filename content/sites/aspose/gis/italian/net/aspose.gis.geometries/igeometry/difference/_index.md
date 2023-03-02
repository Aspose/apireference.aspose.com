---
title: IGeometry.Difference
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Sottrae una geometria specificata da questa geometria.
type: docs
weight: 170
url: /it/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

Sottrae una geometria specificata da questa geometria.

```csharp
public IGeometry Difference(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria da sottrarre. |

### Valore di ritorno

Una geometria che rappresenta una differenza di questa geometria e un argomento. La geometria del risultato contiene set di punti presenti in questa geometria ma non presenti in un argomento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | *other* È`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


