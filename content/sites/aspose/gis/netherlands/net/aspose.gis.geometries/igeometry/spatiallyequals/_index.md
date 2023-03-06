---
title: IGeometry.SpatiallyEquals
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie ruimtelijk gelijk is aan een gespecificeerde geometrie.
type: docs
weight: 320
url: /nl/net/aspose.gis.geometries/igeometry/spatiallyequals/
---
## IGeometry.SpatiallyEquals method

Bepaalt of deze geometrie ruimtelijk gelijk is aan een gespecificeerde geometrie.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie "ruimtelijk gelijk" is aan de gespecificeerde geometrie.`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test gelijkheid in termen van DE-9IM intersectiematrix. Het hangt niet af van order van componenten (bijv. volgorde van binnenringen in polygoon), Z- en M-waarden. Kortom, het test dat twee geometrieën dezelfde "ruimte" innemen wanneer ze worden geprojecteerd op een tweedimensionale ruimte. Deze methode is gelijk aan: Zie OpenGIS Simple Features Specification voor meer details over DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


