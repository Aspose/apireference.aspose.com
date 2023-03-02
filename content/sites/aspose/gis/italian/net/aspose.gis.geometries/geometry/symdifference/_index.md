---
title: Geometry.SymDifference
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Crea una differenza simmetrica tra questa geometria e una geometria specificata.
type: docs
weight: 380
url: /it/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

Crea una differenza simmetrica tra questa geometria e una geometria specificata.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria con cui calcolare la differenza simmetrica. |

### Valore di ritorno

Una geometria che rappresenta una differenza simmetrica di questa geometria e un argomento. La geometria risultante contiene set di punti presenti in una delle geometrie ma non presenti in entrambe.

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


