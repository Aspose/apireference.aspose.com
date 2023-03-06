---
title: IGeometry.Covers
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie een gespecificeerde geometrie dekt.
type: docs
weight: 150
url: /nl/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

Bepaalt of deze geometrie een gespecificeerde geometrie dekt.

```csharp
public bool Covers(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie een andere geometrie "ruimtelijk bedekt".`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of de ene geometrie een andere dekt in termen van DE-9IM intersectiematrix. De ene geometrie dekt een andere, als de geometrie elk punt van een andere geometrie bevat. Deze methode is vergelijkbaar met[`SpatiallyContains`](../spatiallycontains/) , maar keert terug`true` vaker, omdat het geen onderscheid maakt tussen binnen- en grenspunten. Dus als geometrie A op grens van geometrie B ligt,[`SpatiallyContains`](../spatiallycontains/) geeft terug`false` , terwijl deze methode terugkeert`true`. Deze methode is gelijk aan:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Zie ook

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


