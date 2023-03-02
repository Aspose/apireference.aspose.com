---
title: GeometryCollection.Add
second_title: Riferimento API Aspose.GIS per .NET
description: GeometryCollection metodo. Aggiunge la geometria specificata alla raccolta.
type: docs
weight: 110
url: /it/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Aggiunge la geometria specificata alla raccolta.

```csharp
public void Add(IGeometry geometry)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| geometry | IGeometry | La geometria da aggiungere. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | La collezione non accetta geometrie di questo tipo. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) di questa geometria e[`SpatialReferenceSystem`](../spatialreferencesystem/) dell'argomento sono entrambi not `null` e non uguali tra loro. |

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometrycollection/)
* assemblea [Aspose.GIS](../../../)


