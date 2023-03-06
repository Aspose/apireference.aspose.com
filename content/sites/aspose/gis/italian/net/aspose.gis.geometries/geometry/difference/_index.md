---
title: Geometry.Difference
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Sottrae una geometria specificata da questa geometria.
type: docs
weight: 180
url: /it/net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

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
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


