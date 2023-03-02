---
title: LineString.AddPoint
second_title: Aspose.GIS voor .NET API-referentie
description: LineString methode. Voegt een punt toe aan het einde van de lijn.
type: docs
weight: 110
url: /nl/net/aspose.gis.geometries/linestring/addpoint/
---
## AddPoint(IPoint) {#addpoint}

Voegt een punt toe aan het einde van de lijn.

```csharp
public void AddPoint(IPoint point)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| point | IPoint | Het punt om toe te voegen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het argument is`null`. |
| ArgumentException | Het argument is leeg (its[`IsEmpty`](../../igeometry/isempty/) is`true` ). |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van deze geometrie en[`SpatialReferenceSystem`](../spatialreferencesystem/) van argument zijn beide niet`null` en zijn niet gelijk aan elkaar. |

### Zie ook

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* naamruimte [Aspose.Gis.Geometries](../../linestring/)
* montage [Aspose.GIS](../../../)

---

## AddPoint(double, double) {#addpoint_1}

Voegt een punt toe aan het einde van de lijn.

```csharp
public void AddPoint(double x, double y)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | Double | De waarde voor X-coördinaat. |
| y | Double | De waarde voor Y-coördinaat. |

### Zie ook

* class [LineString](../)
* naamruimte [Aspose.Gis.Geometries](../../linestring/)
* montage [Aspose.GIS](../../../)

---

## AddPoint(double, double, double) {#addpoint_2}

Voegt een punt toe aan het einde van de lijn.

```csharp
public void AddPoint(double x, double y, double z)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | Double | De waarde voor X-coördinaat. |
| y | Double | De waarde voor Y-coördinaat. |
| z | Double | De waarde voor Z-coördinaat. |

### Zie ook

* class [LineString](../)
* naamruimte [Aspose.Gis.Geometries](../../linestring/)
* montage [Aspose.GIS](../../../)

---

## AddPoint(double, double, double, double) {#addpoint_3}

Voegt een punt toe aan het einde van de lijn.

```csharp
public void AddPoint(double x, double y, double z, double m)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | Double | De waarde voor X-coördinaat. |
| y | Double | De waarde voor Y-coördinaat. |
| z | Double | De waarde voor Z-coördinaat. |
| m | Double | De waarde voor M-coördinaat. |

### Zie ook

* class [LineString](../)
* naamruimte [Aspose.Gis.Geometries](../../linestring/)
* montage [Aspose.GIS](../../../)


