---
title: LineString.LineString
second_title: Aspose.GIS for .NET API Reference
description: LineString constructor. Initializes a new instance of the LineString class.
type: docs
weight: 10
url: /net/aspose.gis.geometries/linestring/linestring/
---
## LineString() {#constructor}

Initializes a new instance of the [`LineString`](../) class.

```csharp
public LineString()
```

### See Also

* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)

---

## LineString(IEnumerable&lt;IPoint&gt;) {#constructor_2}

Initializes a new instance of the [`LineString`](../) class.

```csharp
public LineString(IEnumerable<IPoint> collection)
```

| Parameter | Type | Description |
| --- | --- | --- |
| collection | IEnumerable`1 | The collection of points. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |
| ArgumentException | Any point is empty (its [`IsEmpty`](../../igeometry/isempty/) is `true`). |

### See Also

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)

---

## LineString(ILineString) {#constructor_1}

Initializes a new instance of the [`LineString`](../) class.

```csharp
public LineString(ILineString other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | ILineString | The other line to copy data from. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |

### See Also

* interface [ILineString](../../ilinestring/)
* class [LineString](../)
* namespace [Aspose.Gis.Geometries](../../linestring/)
* assembly [Aspose.GIS](../../../)


