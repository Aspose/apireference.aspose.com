---
title: Geometry.Crosses
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Bepaalt of deze geometrie en een gespecificeerde geometrie elkaar kruisen.
type: docs
weight: 170
url: /nl/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

Bepaalt of deze geometrie en een gespecificeerde geometrie elkaar kruisen.

```csharp
public bool Crosses(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie een andere geometrie "ruimtelijk kruist".`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of geometrieën kruisen zijn in termen van DE-9IM snijpuntmatrix. Twee geometrieën kruisen elkaar als ze enkele maar niet alle inwendige punten gemeenschappelijk hebben en de afmeting van het snijpunt kleiner is dan de afmeting van ten minste één van de geometries. Dat is: twee[`LineString`](../../linestring/) s kruisen, als ze een 'X'-letter vormen, een LineString en een[`Polygon`](../../polygon/) kruisen als LineString door het interieur van een polygoon gaat. Zie OpenGIS Simple Features Specification voor meer details over DE-9IM en de relatie "ruimtelijk kruisen".

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


