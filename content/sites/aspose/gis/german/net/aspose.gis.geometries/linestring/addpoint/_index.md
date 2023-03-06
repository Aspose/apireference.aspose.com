---
title: LineString.AddPoint
second_title: Aspose.GIS für .NET-API-Referenz
description: LineString methode. Fügt einen Punkt am Ende der Linie hinzu.
type: docs
weight: 110
url: /de/net/aspose.gis.geometries/linestring/addpoint/
---
## AddPoint(IPoint) {#addpoint}

Fügt einen Punkt am Ende der Linie hinzu.

```csharp
public void AddPoint(IPoint point)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| point | IPoint | Der hinzuzufügende Punkt. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Das Argument ist`null`. |
| ArgumentException | Das Argument ist leer (seine[`IsEmpty`](../../igeometry/isempty/) Ist`true` ). |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) dieser Geometrie und[`SpatialReferenceSystem`](../spatialreferencesystem/) Argument sind beide nicht`null` und sind nicht gleich. |

### Siehe auch

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* namensraum [Aspose.Gis.Geometries](../../linestring/)
* Montage [Aspose.GIS](../../../)

---

## AddPoint(double, double) {#addpoint_1}

Fügt einen Punkt am Ende der Linie hinzu.

```csharp
public void AddPoint(double x, double y)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Double | Der Wert für die X-Koordinate. |
| y | Double | Der Wert für die Y-Koordinate. |

### Siehe auch

* class [LineString](../)
* namensraum [Aspose.Gis.Geometries](../../linestring/)
* Montage [Aspose.GIS](../../../)

---

## AddPoint(double, double, double) {#addpoint_2}

Fügt einen Punkt am Ende der Linie hinzu.

```csharp
public void AddPoint(double x, double y, double z)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Double | Der Wert für die X-Koordinate. |
| y | Double | Der Wert für die Y-Koordinate. |
| z | Double | Der Wert für die Z-Koordinate. |

### Siehe auch

* class [LineString](../)
* namensraum [Aspose.Gis.Geometries](../../linestring/)
* Montage [Aspose.GIS](../../../)

---

## AddPoint(double, double, double, double) {#addpoint_3}

Fügt einen Punkt am Ende der Linie hinzu.

```csharp
public void AddPoint(double x, double y, double z, double m)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Double | Der Wert für die X-Koordinate. |
| y | Double | Der Wert für die Y-Koordinate. |
| z | Double | Der Wert für die Z-Koordinate. |
| m | Double | Der Wert für die M-Koordinate. |

### Siehe auch

* class [LineString](../)
* namensraum [Aspose.Gis.Geometries](../../linestring/)
* Montage [Aspose.GIS](../../../)


