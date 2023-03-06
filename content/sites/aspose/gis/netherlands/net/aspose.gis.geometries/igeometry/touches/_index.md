---
title: IGeometry.Touches
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie en een opgegeven geometrie elkaar raken.
type: docs
weight: 360
url: /nl/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

Bepaalt of deze geometrie en een opgegeven geometrie elkaar raken.

```csharp
public bool Touches(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie een andere geometrie "ruimtelijk raakt".`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of geometrieën elkaar raken in termen van DE-9IM snijmatrix. Twee geometrieën raken elkaar als ze tenminste één grenspunt gemeenschappelijk hebben, maar geen interne punten. Dat wil zeggen: twee[`LineString`](../../linestring/)raken elkaar als ze een eindpunt delen, maar geen segment delen, twee polygonen raken elkaar als ze een deel van de buitenste of binnenste ring delen, maar hun binnenkanten overlappen elkaar niet. Deze methode is gelijk aan: Zie OpenGIS Simple Features Specification voor meer details over DE-9IM en de relatie "ruimtelijk raakt".

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


