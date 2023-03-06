---
title: IGeometry.GetDistanceTo
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Calcola la distanza minima tra questa geometria e una geometria specificata.
type: docs
weight: 230
url: /it/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

Calcola la distanza minima tra questa geometria e una geometria specificata.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria da cui trovare la distanza. |

### Valore di ritorno

Se entrambe le geometrie non lo sono[`IsEmpty`](../isempty/) - una distanza tra i punti più vicini delle geometrie. Se almeno una geometria è vuota -1 viene restituito.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


