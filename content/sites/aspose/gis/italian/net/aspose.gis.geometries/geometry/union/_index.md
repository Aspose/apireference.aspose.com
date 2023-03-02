---
title: Geometry.Union
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Unisce questa geometria e una geometria specificata.
type: docs
weight: 430
url: /it/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

Unisce questa geometria e una geometria specificata.

```csharp
public IGeometry Union(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria con cui unire. |

### Valore di ritorno

Una geometria che rappresenta un'unione di questa geometria e un argomento. La geometria del risultato contiene set di punti presenti in questa geometria o in un argomento.

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


