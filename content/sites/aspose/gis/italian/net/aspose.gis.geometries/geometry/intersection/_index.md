---
title: Geometry.Intersection
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Crea unintersezione tra questa geometria e una geometria specificata.
type: docs
weight: 270
url: /it/net/aspose.gis.geometries/geometry/intersection/
---
## Geometry.Intersection method

Crea un'intersezione tra questa geometria e una geometria specificata.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria con cui calcolare l'intersezione. |

### Valore di ritorno

Una geometria che rappresenta un'intersezione di questa geometria e un argomento. La geometria del risultato contiene set di punti presenti sia in questa geometria che in un argomento.

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


