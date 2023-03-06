---
title: Extent.Contains
second_title: Aspose.GIS für .NET-API-Referenz
description: Extent methode. Bestimmt ob diese Ausdehnung eine durch die Argumente definierte Koordinate enthält.
type: docs
weight: 120
url: /de/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Bestimmt, ob diese Ausdehnung eine durch die Argumente definierte Koordinate enthält.

```csharp
public bool Contains(double x, double y)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Double | X der Koordinate. |
| y | Double | Y der Koordinate. |

### Rückgabewert

Wert, der angibt, ob sich die Koordinate innerhalb des Begrenzungsrahmens befindet.

### Bemerkungen

Koordinaten, die sich an den Grenzen davon befinden[`Extent`](../) are davon als eingeschlossen angesehen[`Extent`](../) .

### Siehe auch

* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Bestimmt, ob dieser Extent das Argument enthält.

```csharp
public bool Contains(Extent extent)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| extent | Extent | Anderes Ausmaß. |

### Rückgabewert

Wert, der angibt, ob dieser Extent das Argument enthält.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) in diesem Umfang und das Argument sind beide nicht`null` und nicht gleich. |

### Bemerkungen

Koordinaten, die sich an den Grenzen davon befinden[`Extent`](../) are davon als eingeschlossen angesehen[`Extent`](../) . Aus diesem Grund wird davon ausgegangen, dass gleiche Extents einander enthalten.

### Siehe auch

* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Bestimmt, ob dieser Extent das Argument enthält.

```csharp
public bool Contains(IGeometry geometry)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| geometry | IGeometry | Eine Geometrie zum Testen des Containments. |

### Rückgabewert

Wert, der angibt, ob dieser Extent das Argument enthält.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) in diesem Umfang und das Argument sind beide nicht`null` und nicht gleich. |

### Bemerkungen

Koordinaten, die sich an den Grenzen davon befinden[`Extent`](../) are davon als eingeschlossen angesehen[`Extent`](../) .

### Siehe auch

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)


