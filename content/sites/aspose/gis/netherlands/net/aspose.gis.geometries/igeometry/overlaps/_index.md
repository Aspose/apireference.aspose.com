---
title: IGeometry.Overlaps
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie overlapt met een gespecificeerde geometrie.
type: docs
weight: 280
url: /nl/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

Bepaalt of deze geometrie overlapt met een gespecificeerde geometrie.

```csharp
public bool Overlaps(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie een andere geometrie "ruimtelijk overlapt".`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of geometrieën overlappingen zijn in termen van DE-9IM intersectiematrix. Twee geometrieën overlappen elkaar als ze enkele maar niet alle inwendige punten gemeenschappelijk hebben en het snijpunt van de geometrieën dezelfde dimensie heeft als de geometrieën zelf. Voor tweePoint geometrieën of tweeSurface geometrieën this methode is gelijk aan: Voor tweeLine geometrieën deze methode is gelijk aan: Voor twee geometrieën die niet gelijk zijn[`Dimension`](../dimension/) deze methode keert altijd terug`false`. Zie OpenGIS Simple Features Specification voor meer details over DE-9IM en de relatie "ruimtelijke overlappingen".

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


