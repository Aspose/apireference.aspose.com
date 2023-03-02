---
title: GeometryCollection.ToLinearGeometry
second_title: Aspose.GIS voor .NET API-referentie
description: GeometryCollection methode. Krijgt een geschatte of gelijkwaardige nietkromme versie van deze geometrie met de standaardwaardetolerantie .
type: docs
weight: 220
url: /nl/net/aspose.gis.geometries/geometrycollection/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` .

```csharp
public IGeometryCollection ToLinearGeometry()
```

### Winstwaarde

Een geometrie die geen gebogen geometrieën heeft. Dit is het equivalent van[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) met standaard`tolerantie` . Standaard`tolerantie` s waarde is afhankelijk van[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) van deze geometrie:  Voor geprojecteerde SRS-tolerantie is 0,001 meter (in SRS-eenheden) Voor geografische SRS-tolerantie is`1e-5` graden (in SRS-eenheden) Voor onbekende SRS Tolerantie is`1e-5` Raadpleeg voor meer details over welke transformaties worden toegepast[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) specificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* naamruimte [Aspose.Gis.Geometries](../../geometrycollection/)
* montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` .

```csharp
public IGeometryCollection ToLinearGeometry(double tolerance)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tolerance | Double | De`tolerantie`gebruiken. Het resultaat is gegarandeerd minder dan`tolerantie` weg van de gebogen geometrie. |

### Winstwaarde

Een geometrie die geen gebogen geometrieën heeft. De volgende transformaties worden toegepast: CircularString s zijn linearized (getransformeerd inLineString s met opgegeven*tolerance* )CompoundCurve s worden samengevoegd`LijnString` SCurvePolygon s worden omgezet inPolygon SMultiCurve s worden omgezet inMultiCurve SMultiSurface s worden omgezet inMultiPolygon S Als resultaat,[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) van uitvoergeometrie is`false` .

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | `tolerantie` is kleiner dan of gelijk aan`0` . |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* naamruimte [Aspose.Gis.Geometries](../../geometrycollection/)
* montage [Aspose.GIS](../../../)


