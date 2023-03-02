---
title: GeometryCollection.Add
second_title: Aspose.GIS voor .NET API-referentie
description: GeometryCollection methode. Voegt de opgegeven geometrie toe aan de collectie.
type: docs
weight: 110
url: /nl/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Voegt de opgegeven geometrie toe aan de collectie.

```csharp
public void Add(IGeometry geometry)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| geometry | IGeometry | De geometrie die moet worden toegevoegd. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het argument is`null`. |
| ArgumentException | De collectie accepteert geen geometrieën van dit type. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van deze geometrie en[`SpatialReferenceSystem`](../spatialreferencesystem/) argument zijn beide not `null` en zijn niet gelijk aan elkaar. |

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* naamruimte [Aspose.Gis.Geometries](../../geometrycollection/)
* montage [Aspose.GIS](../../../)


